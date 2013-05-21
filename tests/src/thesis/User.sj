//$ bin/sjc tests/src/thesis/User.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.User localhost 9999


package thesis;

import sj.runtime.*;
import sj.runtime.net.*;

import java.util.*;

import org.json.simple.JSONValue;
import org.json.simple.parser.*;
import java.util.Date;
import java.sql.Timestamp;
// import thesis.utils.JSON;
public class User
{
  public static void main(String []argv) {
    try {
    
      new User(argv[0], Integer.parseInt(argv[1]));
    
    } catch(SJIOException sjioe) {
    
      sjioe.printStackTrace();
    
    }
    
  }
  private static protocol p_uv {
      begin.
      !<JSONMessage>.
      ?{
        OK: ?(JSONMessage).?(int),
        FAIL: 
      }
  }

  private Map buildConnectionRequest() {
      long curTime = new Timestamp((new Date()).getTime()).getTime();
      Map msg = new LinkedHashMap();
      msg.put("action", "CONNECTION");
      msg.put("client_email", "r.kamun@gmail.com");
      msg.put("ts", curTime + "");
      return msg;
  }
  private void print(String s) {
      System.out.println(s);
  }

  public User(String hname, int port) throws SJIOException {
      SJServerAddress v3na_addr = SJServerAddress.create(p_uv, hname, port);
      SJSocket s_uv = SJRSocket.create(v3na_addr);

      try(s_uv) {
        s_uv.request();
        
        Map msg = this.buildConnectionRequest();
        s_uv.send(JSONMessage.create(JSONValue.toJSONString(msg)));
        msg = null;

        s_uv.inbranch() {
          case OK: {
            msg = ((JSONMessage) s_uv.receive()).parse();
            print("Status: " + msg.get("message"));
            int status = s_uv.receiveInt();
            print("Status: " + status);
          }
          case FAIL: {
            print("FAILED");
          }
        }
      } catch(SJIOException sjioe) {
          sjioe.printStackTrace();
      } catch(Exception e) {
          e.printStackTrace();
      }
  }
}
