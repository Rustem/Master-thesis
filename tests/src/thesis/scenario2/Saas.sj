//$ bin/sjc tests/src/thesis/Cloud.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.V3na 9999

package thesis.scenario2;
import sj.runtime.*;
import sj.runtime.net.*;

import java.io.IOException;
import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

class Saas {
    private static final int OK = 1;
    public static void main(String []argv) {
        try {
            new Saas(Integer.parseInt(argv[0]));  
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
    }
    private protocol p_msg {
        !{
          OK: !<JSONMessage>,
          FAIL: !<JSONMessage>
        }
    }

    private protocol p_sv {
        begin.?(@p_msg).?(JSONMessage)
    }
    private boolean verify_msg(JSONMessage params) {
        return 1 == 1;
    }
    private boolean validate_msg(JSONMessage params) {
        return true;
    }
    private JSONMessage genResponse(String status, String message) {
        Map m = new LinkedHashMap();
        m.put("status", status);
        m.put("message", message);
        return JSONMessage.create(JSONValue.toJSONString(m));
    }
    public Saas(int portNumber) throws IOException{
        SJServerSocket server_sv = SJRServerSocket.create(p_sv, portNumber);
        SJSocket v3na_sv = null;
        SJSocket v3na_user_socket = null;
        try(v3na_sv, v3na_user_socket) {
            v3na_sv = server_sv.accept();
            v3na_user_socket = (@p_msg) v3na_sv.receive();
            JSONMessage req_params = (JSONMessage) v3na_sv.receive();
            boolean allowed = this.verify_msg(req_params) && this.validate_msg(req_params);
            if(allowed) {
                v3na_user_socket.outbranch(OK) {
                    v3na_user_socket.send(
                        this.genResponse("1", "USER CREATED. Email has been sent.")
                    );
                }
            } else {
                v3na_user_socket.outbranch(FAIL) {
                      v3na_user_socket.send(this.genResponse("0", "FAILED."));
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}