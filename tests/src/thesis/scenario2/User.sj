package thesis.scenario2;

import sj.runtime.*;
import sj.runtime.net.*;

import java.util.*;

import org.json.simple.JSONValue;
import org.json.simple.parser.*;
import java.util.Date;
import java.sql.Timestamp;
import java.io.*;
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
      begin.?[
        !<String>.!<String>
      ]*.
        ?{
          ACCESS: !<JSONMessage>.
            ?{
                OK: ?(JSONMessage),
                FAIL: ?(JSONMessage)
            },
          DENY: ?(String)
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

  private String login;
  private String password;
  Scanner sc = new Scanner(new InputStreamReader(System.in));
  public User(String hname, int port) throws SJIOException {
      SJServerAddress v3na_addr = SJServerAddress.create(p_uv, hname, port);
      SJSocket s_uv = SJRSocket.create(v3na_addr);

      try(s_uv) {
        s_uv.request();
        // login password
        s_uv.inwhile() {
          System.out.println("Enter your login:");
          this.login = sc.nextLine();
          System.out.println("Enter your password:");
          this.password = sc.nextLine();
          s_uv.send(this.login); s_uv.send(this.password);
        }
        s_uv.inbranch() {
            case ACCESS: {
                s_uv.send(
                    JSONMessage.create(
                        JSONValue.toJSONString(this.buildConnectionRequest())
                    )
                );
                s_uv.inbranch() {
                  case OK: {
                    Map msg = ((JSONMessage) s_uv.receive()).parse();
                    print("Result: " + msg.get("message"));
                  }
                  case FAIL: {
                    Map msg = ((JSONMessage) s_uv.receive()).parse();
                    print("Reason: " + msg.get("message"));
                  }
                }      
            }
            case DENY: {
                print((String)s_uv.receive());
            }
        }

      } catch(SJIOException sjioe) {
          sjioe.printStackTrace();
      } catch(Exception e) {
          e.printStackTrace();
      }
  }
}