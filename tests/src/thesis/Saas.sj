//$ bin/sjc tests/src/thesis/Cloud.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.V3na 9999

package thesis;
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
    private protocol p_sv {
        begin.?(HttpRequestJSONMessage).!<HttpResponseJSONMessage>
    }

    public Saas(int portNumber) throws IOException{
        SJServerSocket server_sv = SJRServerSocket.create(p_sv, portNumber);
        SJSocket v3na_sv = null;
        try(v3na_sv) {
            v3na_sv = server_sv.accept();
            HttpRequestJSONMessage msg = v3na_sv.receive();
            Map response = new LinkedHashMap();
            response.put("message", "Created.");
            response.put("status", "1");
            v3na_sv.send(new HttpResponseJSONMessage(JSONValue.toJSONString(response)));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}