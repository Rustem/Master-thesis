package thesis;

import sj.runtime.*;
import sj.runtime.net.*;
import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;
import java.util.Date;
import java.sql.Timestamp;

public class User {
    final private static java.lang.String _sjprotocol_p_uv =
      ("H4sIAAAAAAAAAIWSv2/TQBTHX5yGplCphaoViCIm1AFkb1060FQiatIrqTDM" +
       "4XI52Y6u5+PuUVyp\nYm7/EhZ2RoTY2GBkhYGF/4CB+xECRJVsybbO3/d9n/" +
       "d98tuf0DIaHphJjKeKG/8sRxPO0MSGGxO+\npv09nhXyqT0MGYSrEQFUGrZq" +
       "rfOuiECL5YUYI2wRM0l8XfKPO5m5k+DeIXBFUc0lvoDXEFnquirF\naSZKnL" +
       "IDo3Pv3TPy4/3dMNntS2oGnjBkv7Y373zpfF9qQoNAW5WmwKKUCDfJH1PyEg" +
       "uRHE2VnUqp\nyi7qfm3alMvxfGLLuHZsa2jGnYSw/hcTcvqUlUvX8JykltOT" +
       "I00lyy9htRi1lQhrZEJPaAiyT01+\nSNWMoZSlXHd67PR4qrcWv374uPH8cx" +
       "OiLlwVJR13KcNS92AJc81NXopxpR7uetryq7Z9rto7ss1W\n7Mi+VdondMTF" +
       "fyM1BR0h3AgDCSqzJEVdyMzuFSEaHFh/XBv5CWe8OOE123UB27NVuvfaNO7m" +
       "3A9x\nJCjj+zYR10P25tuns0cHF+e+34Kkx77RqpsvrMlNHfck8oxrJy373h" +
       "s2FebcFCbup4PHh2EOL60g\nLHQ7PWLp7nhL/QaQE/LkbQMAAA==");
    
    public static void main(String[] argv) {
        try {
            new User(argv[0], Integer.parseInt(argv[1]));
        }
        catch (SJIOException sjioe) { sjioe.printStackTrace(); }
    }
    
    final private static SJProtocol p_uv =
      new sj.runtime.SJProtocol(thesis.User._sjprotocol_p_uv);
    
    private Map buildConnectionRequest() {
        long curTime = new Timestamp(new Date().getTime()).getTime();
        Map msg = new LinkedHashMap();
        msg.put("action", "CONNECTION");
        msg.put("client_email", "r.kamun@gmail.com");
        msg.put("ts", curTime + "");
        return msg;
    }
    
    private void print(String s) { System.out.println(s); }
    
    public User(String hname, int port) throws SJIOException {
        super();
        SJServerAddress v3na_addr = SJServerAddress.create(p_uv, hname, port);
        SJSocket s_uv = SJRSocket.create(v3na_addr);
        {
            sj.runtime.net.SJSocket _sjtryreturned_0 = null;
            int _sjspawncount_s_uv = -1;
            try {
                s_uv.request();
                Map msg = this.buildConnectionRequest();
                s_uv.send(JSONMessage.create(JSONValue.toJSONString(msg)));
                msg = null;
                {
                    java.lang.String _sjbranch_0 = s_uv.inlabel();
                    if (_sjbranch_0.equals("OK")) {
                                                      msg =
                                                        ((JSONMessage)
                                                           s_uv.receive()).
                                                          parse();
                                                      print(
                                                        "Status: " +
                                                        msg.get(
                                                          "message"));
                                                      int status =
                                                        (Integer)
                                                          s_uv.receive();
                                                      print("Status: " +
                                                            status);
                                                  } else {
                        { print("FAILED"); }
                    }
                }
            }
            catch (SJIOException sjioe) { sjioe.printStackTrace(); }
            catch (Exception e) { e.printStackTrace(); }
            finally {
                if (s_uv != null && s_uv != _sjtryreturned_0)
                    s_uv.close(_sjspawncount_s_uv);
            }
        }
    }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369120728000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVXW2xURRiePdvusu1iuy2tTSltKUVBwi7xQtS+WBsqhSVd" +
       "24KyhiyzZ2e3p5wb\nZ+Zst1WJxkSQBxOD10ThxYTE8GAg6oNGTcC7JqYP4A" +
       "skBmNMFCIPRmIw+s+cc/ZydmmbzOycmf82\n/+Wbv2euoWZqoUHTUBcKqsHi" +
       "bMEkNJ7CFiW5MRVTOgMbGfnhDbfmvz+6a20QtaVRm6JPM8wUeczQ\nGSmxNI" +
       "pqRMsSi47mciSXRjGdkNw0sRSsKotAaOhp1EGVgo6ZbRE6RaihFjlhB7VNYg" +
       "md3mYSRWVD\np8yyZWZYlKH25Bwu4oTNFDWRVCgbSaJQXiFqjh5GR1AgiZrz" +
       "Ki4AYXfSu0VCSEyM830gb1HATCuP\nZeKxNB1S9BxDA36O8o2HdwMBsIY1wm" +
       "aNsqomHcMG6nBMUrFeSEwzS9ELQNps2KCFod7bCgWiVSaW\nD+ECyTDU46dL" +
       "OUdAFRFu4SwMdfnJhKSShXp9MauK1mQo+u/x1N+DkrA5R2SV298MTP0+pimS" +
       "JxbR\nZeIw3rTjr07st/skhIC4y0fs0Ixu/Ghv8rfPBhyatQ1oJrNzRGYZ+d" +
       "b2vnVLo79EgtyMVaZBFZ4K\nNTcXUU25JyMlE3KxuyyRH8a9w8+nvtz/3Hvk" +
       "dwmtmkAh2VBtTZ9AEaLnxtx1GNZJRSfO7mQ+Twmb\nQE2q2AoZ4hvckVdUwt" +
       "3RBGsTs1mxLpkIoTCMAIwUcv5ifGIovJcSK07nwHBGKKMJaskJNkuoQhPu\n" +
       "UYkLWT0fCID9ff5aUiHxdhpqjlgZ+fTVb5/ZsfulY1I5m1z1DLU6IuNcJAoE" +
       "hKw7a33BnZvjNfDH\n2ZH2l7fSDyUUTKOIomk2w1mVQO1gVTXmSS7DRPLEqh" +
       "JV5AckVzQLeQYpm1FBkMhruHzRQkP+fKpU\n4QSsMCTJ0pH/fryemT/HQ89D" +
       "tYZLd0wDxx9ybItunj6w6+CxoSAnmm/iPgXS4ZWlZ+Trx/ecu/jd\n5U2VvG" +
       "VouK6c6jl5OfjNT1mGTHIANxXxb/yz888TzQ99IPHYRwBlGIbcgJLt9+uoKY" +
       "sRD2K4s6Qk\nas0bloZVfuThQgubtYz5yo7Ih1axvgMcEIEB7kCTbmLdzyd+" +
       "2M6nmJM93J++OwgAu/lCaNulT1q/\nkKqxrq0KFKcJcyonVgnHjEUI7F9+M3" +
       "XitWtHnxKxcIPBUMi0s6oil4R9XQGIfWeDKo73rHn19c1v\nX/KC3VmRPmpZ" +
       "eIHHuvT80rq3vsLvQIVDpVFlkYhCkoQmScjvAAQXnDwJ4w5a0nogSlmKBnVe" +
       "dIHo\nlf53fz13dWqNVIXWG+oAs5rHQWzhyhazBBrWL6dBUF/Ysv7MkakrWQ" +
       "fJOmprbYduaw+c+olsfiQq\nN6jWILwpngP5fI9Yb+EOdnPevXwPnYtbts4U" +
       "jcSnd01M7ijJxOSAJkwddGXwAvQDxzh/5Lzs1bJP\n/3X+ZMugEw3O01uuLb" +
       "8vaxgz8uKne0/e/IFdEbeopD2XMVCqV7sPV1XkgxeLsdD7pzQJhdOoXTzM\n" +
       "WGf7sGrz9ErD00rH3M0kWl1zXvtMOm/CSLms+/zBrFLrL7iK52HNqfk67NSY" +
       "WQoETL56VFAPiXmj\nk+pBBnIUHYO6sGkpRczAqBAVrUuJAfpn7KIXpq6aMA" +
       "F4MAPeGFGYQtGwG6dKrB3/I55q6273FIs0\nO/rkjeiL+MIBHjrOeB9DEWaY" +
       "W1VSJGol/H4he0Tn4fmk7YmBn8e3n37WH/8gqB9YljMjx4prHw/O\nKl/Da1" +
       "H2f13rU8s0Uuv1FotA56bP1Pi+v4xv7TA2weh08a2zIb7VxUfi67v59NjypV" +
       "Tf7AgEcqDi\nbHD4hvRx97BA9aYspo6J/i6xvgms6e2EjZHyjXphDK5wo62m" +
       "aTa2G7mpwb/3QaJpUHDiMOEy3Aub\nRUNxdM+UtbbAuMv1JfJ+V/aj0D6+vC" +
       "kr2gml0Z21FRXaKV2HUgWEmiKHbd7wuCWyuvIA7MFmA9P7\nYWxzTd/WyHQ+" +
       "FZaLtHDryrYC/jZDQeuifcnyUuZNE3+keur+kXHabXlo6eCm82bsGydLvJY4" +
       "BH1p\n3lbVaoCpWodMi+QVoTLkwQ3/WQAYcbo1/rVoNnjoHLwr/Q9r4QM3YA" +
       "0AAA==");
}
