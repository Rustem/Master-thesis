//$ bin/sjc tests/src/thesis/Cloud.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.V3na 9999

package thesis;

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

  public static void main(String []argv) {
    try {
      new Cloud(Integer.parseInt(argv[0]), argv[1], Integer.parseInt(argv[2]));  
    } catch(IOException ioe) {
      ioe.printStackTrace();
    }
    
  }
  private protocol http_req_rep {
      !<HttpRequestJSONMessage>.?(HttpResponseJSONMessage)
  }

  private protocol p_vu {
    begin.?(JSONMessage).!{
      OK: !<JSONMessage>.!<int>,
      FAIL:
    }
  }
  
  private void print(String s) {
     System.out.println(s);
  }
  private boolean verify_msg(JSONMessage info) {
    return true;
  }
  public Cloud(int portN, String saas_hname, int saas_port) throws IOException {
    SJServerSocket v3naS_vu = SJRServerSocket.create(p_vu, portN);
    SJSocket user_vu = null;

    protocol p_vs { begin.@http_req_rep }

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

          
          SJServerAddress addr_vs = SJServerAddress.create(
              p_vs, saas_hname, saas_port);
          SJSocket s_vs = SJRSocket.create(addr_vs);
          Map http_resp = null;
          try(s_vs) {
              s_vs.request();
              s_vs.send(new HttpRequestJSONMessage(request_info.toString()));
              http_resp = ((HttpResponseJSONMessage) s_vs.receive()).parse();
          } catch(UnknownHostException uhe) {
              uhe.printStackTrace();
          }
          user_vu.send(Integer.parseInt((String) http_resp.get("status")));
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