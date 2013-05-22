//$ bin/sjc tests/src/thesis/Cloud.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.V3na 9999

package thesis.scenario3;

import sj.runtime.*;
import sj.runtime.net.*;


import java.io.IOException;

import java.util.*;
import java.net.UnknownHostException;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;



public class Cloud {
  public static final int SUCCESS = 1;
  public static final int UNSUCCESS = 0;
  private Map database = new LinkedHashMap();
  public static void main(String []argv) {
    try {
      new Cloud(Integer.parseInt(argv[0]), argv[1], Integer.parseInt(argv[2]));  
    } catch(IOException ioe) {
      ioe.printStackTrace();
    }
    
  }

  private protocol p_payment {
      !<Goods>.?{
          VISA_MASTER: ?<CardDetails>,
          TRANSFER: ?<TransferDetails>
      }.?{
          PAID: !<String>,
          DECLINED: !<String>,
          FAILED: !<String>
      }
  }

  private protocol p_wallet {
      ?<Integer>.?<Integer>.!{
          PAYMENT_INACTIVE: !<OSMPMessage>,
          USER_NOT_FOUND: !<OSMPMessage>,
          OK: !<OSMPMessage>
      }
  }

  private protocol p_vp {
      begin.!< @p_payment >
  }

  private protocol p_vw {
      begin.!< @p_wallet >
  }

  private protocol p_vu {
    begin.
    ![
      ?(String).?(String)     // login password
    ]*.
      ?{
        PAYMENT: @p_vpayment,
        WALLET: @p_vwallet
      }
  }
  
  private void print(String s) {
      System.out.println(s);
  }
  private boolean is_authenticated(String login, String password) {
      try {
          return this.database.get(login).equals(password);
      } catch(java.lang.NullPointerException exc) {
          return false;
      }
  }
  private void connectToDB() {
      this.database.put("r.kamun@gmail.com", "00112358");
  }
  Scanner sc = new Scanner(new InputStreamReader(System.in));
  private String payment_hostName;
  private String payment_port;
  private String wallet_hostname;
  private String wallet_port;

  private void set_backends_address() {
      System.out.println("Enter payment hostname and port. For ex.: localhost:8000");
      String [] address = sc.nextLine().split(":");
      this.payment_hostName = address[0];
      this.payment_port = address[1];

      System.out.println("Enter wallet hostname and port. For ex.: localhost:8001");
      address = sc.nextLine().split(":");
      this.wallet_hostName = address[0];
      this.wallet_port = address[1];
  }

  public Cloud(int portN) throws IOException {
    this.connectToDB();
    this.set_backends_address();
    
    SJServerSocket v3naS_vu = SJRServerSocket.create(p_vu, portN);
    SJSocket user_vu = null;
    String cur_user = null;
    try(user_vu) {
      user_vu = v3naS_vu.accept();
      boolean exit = false;
      int counter = 0, max_atempts = 5;
      user_vu.outwhile(!exit) {
          String login = cur_user = user_vu.receive();
          String password = user_vu.receive();
          counter ++;
          if(this.is_authenticated(login, password) || (counter >= max_atempts)) {
              exit = true;
          }
      }
      if(counter < max_atempts) {
          user_vu.outbranch(ACCESS) {
              print(String.format("User[%s] is allowed to proceed.", cur_user))
              s_uv.inbranch() {
                  case PAYMENT: {
                      print(String.format("User[%s] chosen PAYMENT op.", cur_user))
                      SJServerAddress addr_vp = new SJServerAddress.create(
                          p_vp, this.payment_hostName, this.payment_port);
                      SJSocket s_vp = SJRSocket.create(addr_vp);
                      try(s_vp) {
                          s_vp.request();
                          s_vp.send(s_uv);
                      } catch(UnknownHostException uhe) {
                          uhe.printStackTrace();
                      }
                  }
                  case WALLET: {
                      print(String.format("User[%s] chosen WALLET op.", cur_user))
                      SJServerAddress addr_vw = new SJServerAddress.create(
                          p_vw, this.wallet_hostName, this.wallet_port);
                      SJSocket s_vw = new SJRSocket.create(addr_vw);
                      try(s_vw) {
                          s_vw.request();
                          s_vw.send(s_uv);
                      } catch(UnknownHostException uhe) {
                          uhe.printStackTrace();
                      }
                  }
              }
          }
      } else {
          user_vu.outbranch(DENY) {
              print(String.format("User[%s] is canceled to proceed.", cur_user))
              user_vu.send("You have no permissions. BYE!");
          }
      }
      
    } catch (SJIOException ioe) {
        ioe.printStackTrace();
    } catch(SJIncompatibleSessionException stise) {
        stise.printStackTrace();
    } catch(ClassNotFoundException cnfe) {
        cnfe.printStackTrace();
    }
  }
}