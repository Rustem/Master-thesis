//$ bin/sjc tests/src/thesis/Cloud.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.V3na 9999

package thesis;

import sj.runtime.*;
import sj.runtime.net.*;


import java.io.IOException;

import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;



public class Cloud {
  public static final int SUCCESS = 1;
  public static final int UNSUCCESS = 0;

  public static void main(String []argv) {
    try {
      new Cloud(Integer.parseInt(argv[0]));  
    } catch(IOException ioe) {
      ioe.printStackTrace();
    }
    
  }
  private protocol p_vs {
      begin.!<String>.?(String)
  }

  private protocol p_vu {
    begin.?(JSONMessage).!{
      OK: !<JSONMessage>.!<Integer>,
      // OK: !<String>.!<@p_vs>.!<String>,
      FAIL:
    }
  }
  
  private void print(String s) {
     System.out.println(s);
  }
  private boolean verify_msg(JSONMessage info) {
    return true;
  }
  public Cloud(int portN) throws IOException {
    SJServerSocket v3naS_vu = SJRServerSocket.create(p_vu, portN);
    SJSocket user_vu = null;
    try(user_vu) {
      user_vu = v3naS_vu.accept();
      JSONMessage request_info = user_vu.receive();
      print("Request for connection: " + request_info);
      if(this.verify_msg(request_info)) {
        user_vu.outbranch(OK) {
          Map msg = new LinkedHashMap();
          msg.put("status", "3");
          msg.put("message", "Wait please.");
          user_vu.send(JSONMessage.create(JSONValue.toJSONString(msg)));
          
          user_vu.send(new Integer(SUCCESS));
        }  
      } else {
        user_vu.outbranch(FAIL) {
          System.out.println("CONNECTION FAILED");
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