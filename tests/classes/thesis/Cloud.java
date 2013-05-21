package thesis;

import sj.runtime.*;
import sj.runtime.net.*;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

public class Cloud {
    final private java.lang.String _sjprotocol_p_vs =
      ("H4sIAAAAAAAAAIWQMUvEMBTHX6snJ4KIcCB44iQ3KM3mctMJgmjAw+pcYhpq" +
       "Si6NTTx6cDjrJ3Fx\nd3R39Cvo4OI3cDBt7lSK0AyBvLz///f+7/ETWjqHPZ" +
       "0GZqKYru7sMmXU6EAzrV01PD5gCZfn9hFR\ncMfzAYoceo3SusrH0KJXXMQG" +
       "elinqOpDf9ToR42cuo9hSZGcSXMNt+BbakdlYpKIzMzYjjHYebrA\nH8/bbr" +
       "LNf3pOK0JEv/a7W6+D9+UF8DC0Vaa54Zk0sIHnInRjuEDD2U+/UKqwi9ptTB" +
       "syGdcTW8bK\nyPaQhJVfBjq/GJezSlmU6byKEzRyzhhlfMwaUKVje+6rlHXu" +
       "1rYyFISyo0zELI/ow9vL9PDk/q7y\nWZRkZGddxykZEySITFBoci4TuwwDa2" +
       "U1KKuBq6qSsqq+AekRcXhSAgAA");
    final private java.lang.String _sjprotocol_p_vu =
      ("H4sIAAAAAAAAAIWSv2/TQBTHX5wGUqjUQtUKRBET6gCyO7F0gFQiatIrqTDM" +
       "4XI52Y6u5+PutbhS\nxQx/CQt7xwqxscHICgML/wED9yMEiCrZkm2dv+/7Pu" +
       "/75Pc/oWU03DeTGE8UN/5ZjiacoYkNNyZ8\nTfs7PCvkM3sYMghXIwKoNGzW" +
       "WuddEYEWywsxRtgkZpL4uuQfdzJzJ8G9TeCSoppLfAmvIbLUNVWK\nk0yUOG" +
       "UHRufu2XPy4/xOmOzWBTUDTxiyXw82bn/pfF9sQoNAW5WmwKKUCDfIH1NyhI" +
       "VIDqbKdqVU\nZRcV16Z9yhkvjvl8aIu5emjLaOYlhLW/pBDVB61cwIZHbdWi" +
       "Bkc40lSy/AJYi1FbirBKJvSYhjC7\n1OT7VM0gSlnMNafHTo+neuvy1w8f11" +
       "98bkLUhSuipOMuZVjqHixirrnJSzGu1MNHnrb0qm2fK/aO\nbLNlO7NvlfYJ" +
       "HXHx30hNQUcI18NAgsosSVEXMrO7RYgGe9Z/rzZzyuW4ZrcuXXu2SPdenWbd" +
       "mPsj\nDgRlfNfG4XrI3n37dPp47+0b329B0kPfaMUNF3bkRo57EnnGtZOWfO" +
       "91GwlzbgoT99PBk/0wh5eW\nERa6nR6xdHe8qX4DYBFjgm4DAAA=");
    final public static int SUCCESS = 1;
    final public static int UNSUCCESS = 0;
    
    public static void main(String[] argv) {
        try {
            new Cloud(Integer.parseInt(argv[0]));
        }
        catch (IOException ioe) { ioe.printStackTrace(); }
    }
    
    final private SJProtocol p_vs =
      new sj.runtime.SJProtocol(this._sjprotocol_p_vs);
    final private SJProtocol p_vu =
      new sj.runtime.SJProtocol(this._sjprotocol_p_vu);
    
    private void print(String s) { System.out.println(s); }
    
    private boolean verify_msg(JSONMessage info) { return true; }
    
    public Cloud(int portN) throws IOException {
        super();
        SJServerSocket v3naS_vu = SJRServerSocket.create(p_vu, portN);
        SJSocket user_vu = null;
        {
            sj.runtime.net.SJSocket _sjtryreturned_0 = null;
            int _sjspawncount_user_vu = -1;
            try {
                user_vu = v3naS_vu.accept();
                JSONMessage request_info = (JSONMessage) user_vu.receive();
                print("Request for connection: " + request_info);
                if (this.verify_msg(request_info)) {
                    {
                        user_vu.outlabel("OK");
                        Map msg = new LinkedHashMap();
                        msg.put("status", "3");
                        msg.put("message", "Wait please.");
                        user_vu.send(
                          JSONMessage.create(JSONValue.toJSONString(msg)));
                        user_vu.send(new Integer(SUCCESS));
                    }
                } else {
                    {
                        user_vu.outlabel("FAIL");
                        System.out.println("CONNECTION FAILED");
                    }
                }
            }
            catch (SJIOException ioe) { ioe.printStackTrace(); }
            catch (SJIncompatibleSessionException stise) {
                stise.printStackTrace();
            }
            catch (ClassNotFoundException cnfe) { cnfe.printStackTrace(); }
            finally {
                if (user_vu != null && user_vu != _sjtryreturned_0)
                    user_vu.close(_sjspawncount_user_vu);
            }
        }
    }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369120984000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1XXWxURRSe3W233Xax7fZHLP2jFOUn3cUHCVofqA1Iy5au" +
       "XQpSQ5a7d2e3t9y9\n93pn7naLSiAmFDHBGMCfRMEHEhLDg4GoDxo1Af81MX" +
       "0AXyAqxpgoRB4MxGD0zMzdv7vbQpOZzs6c\nc+bMOd93Zu7Z66iamKjH0NXZ" +
       "lKrTIJ01MAlGJJPgxJAqEbIdJmLyYyvuzHw3N7LMgxomUYOiRalE\nFXlI1y" +
       "jO0knkT+N0HJtkMJHAiUnUpGGciGJTkVRlHwjq2iQKECWlSdQyMRnHRFczTD" +
       "BALAObfM/c\nZBj5ZV0j1LRkqpuEosbwtJSRQhZV1FBYIXQgjLxJBasJ8iza" +
       "j1xhVJ1UpRQItoVzpwhxi6HNbB7E\n6xRw00xKMs6pVO1VtARF3U6N/In7to" +
       "IAqNakMZ3S81tVaRJMoIBwSZW0VChKTUVLgWi1bsEuFLUv\naBSEag1J3iul" +
       "cIyipU65iFgCKR8PC1OhqNUpxi1lTdTuyFlRtsa8/n+PRG71uLnPCSyrzP9q" +
       "UOpy\nKI3jJDaxJmOheNsKHh/eZXW4EQLhVoewkBlc+eFE+PdPu4XMsgoyY/" +
       "FpLNOYfGd9R+f84K8+D3Oj\n1tCJwqBQcnKe1Yi9MpA1AItteYtsMZhb/Gz8" +
       "i10H3sV/uFHtMPLKumqltWHkw1piyB7XwDisaFjM\njiWTBNNhVKXyKa/Of0" +
       "M4koqKWTiqYGxIdIqPswZCqAaaC9ooEn8B1lFUO6TqViJIpil6gGJCSYiY\n" +
       "cohOYaKw5Iq1LDOzZMblghN0ONmkAvS26GoCmzH5zLVvnt+09aXD7jyebAco" +
       "8gubQW4TuVzc2P2l\n4WDxTTAa/HluoPFoP/nAjTyTyKek0xaV4ioG+kiqqs" +
       "/gRIxy/DQVYZVDBPDljwPUALUxFQxxaMP5\nMybqdUKqQMRhGEmAk/n9//1w" +
       "IzZznmWfZauFWReuQez3Ct/8q6O7R/Yc7vUwoZkqFlYQ7bu79Zh8\n48jo+U" +
       "vfXllVgC5FfWWMKtdkjHC6HzF1GSeg4hTMv/7Plr+OVT/6vpul3weFhkoAD2" +
       "Btl3OPEmYM\n5KoMC5Y7jOqTupmWVLaUKw11dMrUZwozHBD1fHwfBMAHDcKB" +
       "wja21rGOLTayrknAh8XTcQZew26/\n6F13+eP6z93F5a6hqC5GMRXkaSqkY7" +
       "uJMcxfeSNy7MT1uWd4LuxkUOQ1rLiqyFnuX6sLct9cgcjB\npS3HX1v91uVc" +
       "spsL1gdNU5pluc4enO9880vpbSA5kI0o+zDnkiufdmfJiZhKGhidsUvOq12n" +
       "fzt/\nbbzFXVSXV5SVxmIdUZt5xOqMLOywfLEduPTFtcvP7h+/Ghc1K1BKqU" +
       "2alX7k1I949Ua/XIGVHrg9\ncnFi/Ro+Xlt0RvY7QO3oKHpweGxTVsYGq1rc" +
       "yx5bnVHMWRs2s5ssh890/Lm/L5ys6xHxZjrtfIuq\nCmEsUYzJ+z6ZOHn7e3" +
       "qVH6AAbGajO1u+7Q6piHMbLmWavO+dSrtRzSRq5LevpNEdkmoxAE3C/UmG\n" +
       "7MkwWlKyXnoXisI/kCduhzOPRds6KVUIOoyZNBvXOFjUBu1BaM02i5odLOIV" +
       "U3CAORQchos/hc3A\nL++cvnVwboObYbQ6wxyHmDQW5LZZ7Ply6OyJzvrjP7" +
       "3Mw88yy4xu5Jv38n6l4I+HguuKJvFb9SEg\nE+GvoSxFNdGJoaFN0ShbCAlK" +
       "s/7xkgOsgtZiH6Cl/ABs8ERueqTC7mz8JN+adVtgW9/EtgU2NsCi\nwUaRck" +
       "NubgicNkwlI7GHHFyIsQzJ4bmVTAdNS6NKGgejI1BMqQ7XbiXjOxcyzrqobd" +
       "diPya4Os9q\nn02KAqcE2BGjdOdCjxtO57mnb/oPSRd3s0QxxYchBFQ3+lWc" +
       "wWqBa04jo/wtlwNgw87unzevP/OC\nk2we2L57Uc2Y3JRZ9pRnSvkKLt882M" +
       "sek6VKA6UQrzMxvIW17SVA78rjpNHGSZuNk7aK10XlqNuw\nWLRklT8feUEX" +
       "Jfmcp++m+6O2Pn5JVsUlIlx0vrvLn9Ulr2Xuoy9/onZoPYucKIe6IlaKp7Vh" +
       "GJXP\ngmy4sN9JwFgaKh5f7LcV1sFkRleEP4m8J3XQuqCtsT1Zc2+xdQkwLx" +
       "ZW9lO/u7MzUD+Acxp/etEK\n3gWh9dve9VfyjnWz93InBewn5Uh0bNsoJgS+" +
       "L+7u3wGK6jLw9ZacjaVJyhnSmriuq1jSgNbV/KXK\nXgZLyz4gxWeO3Du/Z9" +
       "UFo+lrgaXcp4gXvgeSlqoW1/yisdcwcVLhvnjFDWDwf0eh1ooDsV+vGBUw\n" +
       "I66g7P8zMntv2A4AAA==");
}
