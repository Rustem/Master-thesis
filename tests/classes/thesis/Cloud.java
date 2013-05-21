package thesis;

import sj.runtime.*;
import sj.runtime.net.*;
import java.io.IOException;
import java.util.*;
import java.net.UnknownHostException;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

public class Cloud {
    final private java.lang.String _sjprotocol_http_req_rep =
      ("H4sIAAAAAAAAAIVRP0vDQBR/Ta34ZxMKgq1O0kFINpdOHYRSoy2NziFeH2nC" +
       "NbnmvZYUxFk/iYu7\no7ujX0EHF7+Bg5ekai1Cb3gc7/3+vN/dwwdUKIEjCk" +
       "2eKaS8xlchCiaTkKjoOh0Ho8GFvrsCilMy\noGTD9khjPB+zEUPVVrGc+TJm" +
       "K+dZWbuZJtBYqb+sbdhQEcNADhgaNoVzvQW29cO2CnbThnXlJRjx\nGG6grF" +
       "2r39vMvQuP1uHjpf3+dGAAaMzeP5hu7uCKz+Na/aX1tlnOkm6omAIO4ohh9z" +
       "fmhANp9eaT\nZqpUql/TXJm2jwKDKa540CxHKc2qobS0Vq4tbduTnsB2LAeY" +
       "uOL+9fn65PTuNtdZi7yR/pEdO/Sm\nniW9yLccToLI10sy7PMQKSCzzaz6SC" +
       "qOCDtO9/ysMFeUmW4x1P/gxhMkXoB9Ae+JQrk9AgAA");
    final private java.lang.String _sjprotocol_p_vu =
      ("H4sIAAAAAAAAAIVTMW/TQBR+sRtIIVJLShESJagCVKEimwWWDjRIjdrEJVUM" +
       "czhfTvYFxz58l+JK\nqDOM/AIWJJZuDIwIwcQGE2JgKUIs/AMGzndpoFaELf" +
       "ms83vf+973vbuDX1DmCVznA0vsMcLVGnsD\nggW3OOFc/3Vbd4hPo3ty08Og" +
       "n5IBkCawUgjNowwHyjigYV/AisMHtsqz/0HbE7St0WsOnGAoIZF4\nBPtgSN" +
       "ZFFod7fhiLMbfmaFx9c9/5+faS7uzClJyOYujh37eWLn5ufJ81oeRAhcWcCh" +
       "pHAs47RyB7\nJGho74wjayljqTTKKlTbJZjQXZIXLWlOD2Ua8lVIwOJfJi1V" +
       "CU0zgSVFdaOQqjMSXoIiHEwhK2Mk\nUwUsOAO0i7SYTcSDbcQmJIxJmjNZ3M" +
       "ri1jhePvn13ftzDz6ZYDThVBijfhNhESdbMCuChPAgDvsp\nu72u2KqPK3Kd" +
       "l68hi83JnlUpt+Ugj4THWjJD5Amo6YZCFPm2KxIa+dJbAUanLfGrhZpdEvUL" +
       "vM3U\nVSZGZt+FsdZ67kTsJHQox3s0ref1lz9eH3bPqoozD2kkT+jl/JiOYa" +
       "60ZZL201RDW/4fg8r+sLp8\nsN/95ukzWpvkK9s2otHw5osv5Np6FesuIjRU" +
       "guYzk0yqb0BVMi3lmUKEyaYcDUl6+NXhxycb7WdP\np9SoiYBwyq2W27m7rU" +
       "1THs0JmGk2thxpVbatsz/gra5gGwQAAA==");
    final public static int SUCCESS = 1;
    final public static int UNSUCCESS = 0;
    
    public static void main(String[] argv) {
        try {
            new Cloud(Integer.parseInt(argv[0]), argv[1],
                      Integer.parseInt(argv[2]));
        }
        catch (IOException ioe) { ioe.printStackTrace(); }
    }
    
    final private SJProtocol http_req_rep =
      new sj.runtime.SJProtocol(this._sjprotocol_http_req_rep);
    final private SJProtocol p_vu =
      new sj.runtime.SJProtocol(this._sjprotocol_p_vu);
    
    private void print(String s) { System.out.println(s); }
    
    private boolean verify_msg(JSONMessage info) { return true; }
    
    public Cloud(int portN, String saas_hname, int saas_port)
          throws IOException {
        super();
        final java.lang.String _sjprotocol_p_vs =
          ("H4sIAAAAAAAAAIWQsUoDQRCGJ9FIRCshIJhoJSmU284mVQRB4mlCTutwbobL" +
           "Hpe9ze0kXECs9Uls\n7C3tLX0FLWx8Awv37hKNQbgtFnbn/+ebfx4/oaQjON" +
           "S+RVOFOr3Dax85aUuj1tmv0zpGT8hL8+hx\nyE6hCBBHUM+1LruKNpT4QAR9" +
           "grqtfZbq2IKb/bhZ5m7YsKbcCCWN4BaKhlpRYTD1gpBm7IzR3H+6\nsj+e97" +
           "LJdv7RtFNCj38dVWuvzff1FSjYUFahFiRCSbBtz01sTCJgnVmlESsVm0Ud5K" +
           "Z1UPaXExvG\nxtBoXA+TEkHlF5PlTFPGSbpCyrFyOV3kKCaYg0o6lud9lTKd" +
           "q0tb6QQux9Mw6GPU4w9vLzcnZ/d3\naZ9V6Q7NrFu2705cFrjSYw5FQnpmGQ" +
           "S7NEAttHVKpLqoVSg1tpz2xXkGVzqBbhLU/uhGY9S0KPsG\nnf1OvIECAAA=");
        SJServerSocket v3naS_vu = SJRServerSocket.create(p_vu, portN);
        SJSocket user_vu = null;
        final SJProtocol p_vs = new sj.runtime.SJProtocol(_sjprotocol_p_vs);
        {
            sj.runtime.net.SJSocket _sjtryreturned_1 = null;
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
                        SJServerAddress addr_vs =
                          SJServerAddress.create(p_vs, saas_hname, saas_port);
                        SJSocket s_vs = SJRSocket.create(addr_vs);
                        Map http_resp = null;
                        {
                            sj.runtime.net.SJSocket _sjtryreturned_0 = null;
                            int _sjspawncount_s_vs = -1;
                            try {
                                s_vs.request();
                                s_vs.send(
                                  new HttpRequestJSONMessage(
                                    request_info.toString()));
                                http_resp = ((HttpResponseJSONMessage)
                                               s_vs.receive()).parse();
                            }
                            catch (UnknownHostException uhe) {
                                uhe.printStackTrace();
                            }
                            finally {
                                if (s_vs != null && s_vs != _sjtryreturned_0)
                                    s_vs.close(_sjspawncount_s_vs);
                            }
                        }
                        user_vu.sendInt(
                          Integer.parseInt((String) http_resp.get("status")));
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
                if (user_vu != null && user_vu != _sjtryreturned_1)
                    user_vu.close(_sjspawncount_user_vu);
            }
        }
    }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369132443000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1XXWxURRSe7m633Xax3dIWLP2jFOUn3cVECdrEWGsJWxZa" +
       "uxSkSJa7d2fbW+7e\ne7kzd7tFJRATiphgDOBPouADCYnhwUDUB42agP+amD" +
       "6ALxAVY0wUIg8GYjB6Zubu391tS5OZzs6c\nOefMOd93Zu65G6iSmKjT0NXp" +
       "cVWnQTptYBIclkyCE/2qRMg2mIjJj624O/XdzOAyN6obQ3WKFqUS\nVeR+Xa" +
       "M4Q8eQP4VTcWySvkQCJ8ZQQMM4EcWmIqnKfhDUtTHUQJRxTaKWickIJrqaZo" +
       "INxDKwyW1m\nJyPIL+saoaYlU90kFNVHJqW0FLKoooYiCqG9EeRNKlhNkH3o" +
       "AKqIoMqkKo2DYHMke4oQ1xjayOZB\nvEYBN82kJOPsFs9eRUtQ1OHckTtx92" +
       "YQgK1VKUwn9JwpjybBBGoQLqmSNh6KUlPRxkG0UrfACkUt\ncyoFoWpDkvdK" +
       "4zhG0VKn3LBYAikfDwvbQlGTU4xrypioxZGzgmwNef3/Hh2+3eniPiewrDL/" +
       "K2FT\nu2PTCE5iE2syFhvvWMET4Z1WqwshEG5yCAuZvpUfjkZ+/7RDyCwrIz" +
       "MUn8Qyjcl317e2zfb96nMz\nN6oNnSgMCkUn51kdtld6MwZgsTmnkS0Gs4uf" +
       "jXyx8+C7+A8Xqg4jr6yrVkoLIx/WEv32uArGEUXD\nYnYomSSYhpFH5VNenf" +
       "+GcCQVFbNweGBsSHSCjzMGQqgKWgW0Z5H4W8w6iqr7Vd1KBMkkRfdTTCgJ\n" +
       "EVMO0QlMFJZcsZZhahZNVVTACVqdbFIBept0NYHNmHz2+jfPD2x+6Ygrhyfb" +
       "AYr8QmeQ60QVFVzZ\nkuJwsPgmGA3+PN9bf6yHfOBC7jHkU1Ipi0pxFQN9JF" +
       "XVp3AiRjl+AgVY5RABfPnjADVAbUwFRRza\ncP60ibqckMoTMQwjCXAye+C/" +
       "H27Gpi6w7LNsNTLtwjWI/V7hm391dPfgniNdbiY05WFhBdHuhbXH\n5JtHt1" +
       "y4/O3VVXnoUtRdwqjSnYwRTveHTV3GCag4efWv/7Ppr+OVj77vYun3QaGhEs" +
       "ADWNvutFHE\njN5slWHBckVQbVI3U5LKlrKloYZOmPpUfoYDopaP74MA+KBB" +
       "ONAuG1vrWMcW61kXEPBh8XScgdew\nOy961135uPZzV2G5qyuoi1FMBXkC+X" +
       "RsMzGG+atvDB8/eWNmF8+FnQyKvIYVVxU5w/1rqoDcLy5D\n5ODSxhOvrX7r" +
       "SjbZi/Pa+0xTmma5zhyabXvzS+ltIDmQjSj7MeeSm1tyk9KSM2wqKWB02i45" +
       "r7af\n+e3C9ZFGV0FdXlFSGgv3iNrMI1ZjZMDC8vkscOlLa5efOzByLS5qVk" +
       "MxpQY0K/XI6R/x6if8chlW\nuuH24GFqgLuIB4BxKSjqPpsPZaPI+jV8vJZF" +
       "2Qa+vVXETtGD4aGBjIwNVtP4GTrt7YyAzsqxkd1z\nWfSm4s/9ffFUTafIBt" +
       "vTwk14ygS5aGNM3v/J6Kk739Nr/Hh52DMdHZlSs9ulAkZuuJwOeN87nXKh\n" +
       "qjFUz+9mSaPbJdVi8BqD25X025MRtKhovfimFNdCb47Wrc4sF5h1Ei6fEhgz" +
       "aTaucnCsGdoD0Bpt\njjU6OMbraSCfwjA8C8ax2fDLO2duH5rZ4GIIrkwzxy" +
       "EmBanearHHzeFzJ9tqT/z0Mg8/yyxT+iQ3\n3sX7lYJdbgquK5rE79wHgWqE" +
       "v5UyFFVFR/v7B6JRDhpBeNY/XnSAVdCa7AM0lR6ADZ7KTkfKWGfj\nMDfNuk" +
       "Ew6xvdOodhAzQabDRSqsjFFYHThqmkJfbMQ/4JSo2YifdBM7K4biKTQdPSqJ" +
       "LCwegglFyq\nw+VczsjOuYywbhT0e4xY2mI/dvDtPLvdNjny3BKgR4z4bXM9" +
       "gTjpZ5655T8sXdrNEsY2PgShoLrR\no+I0VvOccyrZwl98WSDW7ej4eeP6sy" +
       "84SccqW8e8O2NyIL3safeE8hVc0TnQlzw5izf1FkO9xsTw\nYta2FQG+PYeX" +
       "ehsvS2y8LCl7qZSPug2PeUtX6SOTl31RuM+7u2+5Pmru5lepJy4R4aLzdV76" +
       "+C56\nU3MffbkTtUDrXOBEDxuGUd5vZEOD/Z4APKWgyvHFHnvDOphM64qwnc" +
       "xZrYHWDm2NbXXNvcWxQgB3\nvhByfxd2dgpqBvBM448xWsa7ILQe27uect6x" +
       "bvpe7qEG+5E5GB3augUTAl8cC/t3kKKaNHzPJadj\nKTLuDGlVXNdVLGlA4U" +
       "r+dmVvhaUln5Tiw0fumt2z6qIR+FrgJvtx4oUvhKSlqoV1vmDsNUycVLgv\n" +
       "XlH1Df7vGNRXcSD265VcVSqo3uLayfwPZp7greoOAAA=");
}
