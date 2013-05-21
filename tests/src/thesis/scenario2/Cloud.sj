//$ bin/sjc tests/src/thesis/Cloud.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.V3na 9999

package thesis.scenario2;

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
  private protocol p_vs {
      begin.
      !< !{
            OK: !<JSONMessage>,
            FAIL: !<JSONMessage>
      } >.!<JSONMessage>
  }

  private protocol p_vu {
    begin.
    ![
      ?(String).?(String)     // login password
    ]*.
      !{
        ACCESS: ?(JSONMessage).
          !{
            OK: !<JSONMessage>,
            FAIL: !<JSONMessage> 
          },
        DENY: !<String>
      }
  }
  
  private void print(String s) {
     System.out.println(s);
  }
  private boolean verify_msg(JSONMessage info) {
    return true;
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
  public Cloud(int portN, String saas_hname, int saas_port) throws IOException {
    this.connectToDB();
    
    SJServerSocket v3naS_vu = SJRServerSocket.create(p_vu, portN);
    SJSocket user_vu = null;

    try(user_vu) {
      user_vu = v3naS_vu.accept();
      boolean exit = false;
      int counter = 0, max_atempts = 5;
      user_vu.outwhile(!exit) {
          String login = user_vu.receive();
          String password = user_vu.receive();
          counter ++;
          if(this.is_authenticated(login, password) || (counter >= max_atempts)) {
              exit = true;
          }
      }
      if(counter < max_atempts) {
          user_vu.outbranch(ACCESS) {
              JSONMessage req_info = user_vu.receive();
              SJServerAddress addr_vs = SJServerAddress.create(
                  p_vs, saas_hname, saas_port);
              SJSocket s_vs = SJRSocket.create(addr_vs);
              try(s_vs) {
                  s_vs.request();
                  s_vs.send(user_vu);   // pass the remaining protocol
                  s_vs.send(req_info);
              } catch(UnknownHostException uhe) {
                  uhe.printStackTrace();
              }
          }
      } else {
          user_vu.outbranch(DENY) {
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