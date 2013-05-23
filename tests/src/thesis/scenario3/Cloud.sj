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
import java.io.*;


public class Cloud {
  public static final int SUCCESS = 1;
  public static final int UNSUCCESS = 0;
  private Map database = new LinkedHashMap();
  public static void main(String []argv) {
    try {
      new Cloud(Integer.parseInt(argv[0]));  
    } catch(IOException ioe) {
      ioe.printStackTrace();
    }
    
  }

  private protocol p_payment {
      !<Goods>.?{
          VISA_MASTER: ?(CardDetails),
          TRANSFER: ?(TransferDetails)
      }.!{
          PAID: !<String>,
          DECLINED: !<String>,
          FAILED: !<String>
      }
  }

  private protocol p_wallet {
      !<String>.?(Integer).?(Integer).!{
          PAYMENT_INACTIVE: !<OSMPMessage>,
          USER_NOT_FOUND: !<OSMPMessage>,
          OK: !<OSMPMessage>
      }
  }

  private protocol p_vp {
      begin.!<String>.!< @p_payment >
  }

  private protocol p_vw {
      begin.!<String>.!< @p_wallet >
  }

  private protocol p_vu {
    begin.
    ![
      ?(String).?(String)     // login password
    ]*.!{
        ACCESS: ?{
          PAYMENT: @p_payment,
          WALLET: @p_wallet},
        DENY: !<String>
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
  private int payment_port;
  private String wallet_hostName;
  private int wallet_port;

  private void set_backends_address() {
      System.out.println("Enter payment hostname and port. For ex.: localhost:8000");
      String [] address = sc.next().split(":");
      this.payment_hostName = address[0];
      this.payment_port = Integer.parseInt(address[1]);

      System.out.println("Enter wallet hostname and port. For ex.: localhost:8001");
      address = sc.next().split(":");
      this.wallet_hostName = address[0];
      this.wallet_port = Integer.parseInt(address[1]);
  }

  public Cloud(int portN) throws IOException {
    this.connectToDB();
    this.set_backends_address();
    
    SJServerSocket v3naS_vu = SJRServerSocket.create(p_vu, portN);
    SJSocket user_vu = null;
    String cur_user = null;
    try(user_vu) {
      user_vu = v3naS_vu.accept();
      print("Session with user initiated.");
      boolean exit = false;
      int counter = 0, max_atempts = 5;
      user_vu.outwhile(!exit) {
          String login = cur_user = (String) user_vu.receive();
          String password = (String) user_vu.receive();
          counter ++;
          if(this.is_authenticated(login, password) || (counter >= max_atempts)) {
              exit = true;
          }
      }
      if(counter < max_atempts) {
          user_vu.outbranch(ACCESS) {
              print("User is allowed to proceed.");
              user_vu.inbranch() {
                  case PAYMENT: {
                      print("User chosen PAYMENT op.");
                      SJServerAddress addr_vp = SJServerAddress.create(
                          p_vp, this.payment_hostName, this.payment_port);
                      SJSocket s_vp = SJRSocket.create(addr_vp);
                      try(s_vp) {
                          s_vp.request();
                          s_vp.send(cur_user);
                          s_vp.send(user_vu);
                      } catch(UnknownHostException uhe) {
                          uhe.printStackTrace();
                      }
                  }
                  case WALLET: {
                      print("User chosen WALLET op.");
                      SJServerAddress addr_vw = SJServerAddress.create(
                          p_vw, this.wallet_hostName, this.wallet_port);
                      SJSocket s_vw = SJRSocket.create(addr_vw);
                      try(s_vw) {
                          s_vw.request();
                          s_vw.send(cur_user);
                          s_vw.send(user_vu);
                      } catch(UnknownHostException uhe) {
                          uhe.printStackTrace();
                      }
                  }
              }
          }
      } else {
          user_vu.outbranch(DENY) {
              print("User is canceled to proceed.");
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