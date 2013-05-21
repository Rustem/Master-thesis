package thesis.scenario2;

import sj.runtime.*;
import sj.runtime.net.*;
import java.io.IOException;
import java.util.*;
import java.net.UnknownHostException;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

public class Cloud
{
    final private java.lang.String
      _sjprotocol_p_vu =
      ("H4sIAAAAAAAAAI1SPW/TQBh+4zRtQipaUgWBGsQC6kBlow4sGSCURG3qNhWG" +
       "gSmczyfb0dU+fNfW\nkRAz/BIWdkaE2NhgZIWBhX/AwH0kgUaRjCW/9/F+PM" +
       "/73PvuF1R4Btt8ZIsxI1zb1B8RLLjNCefm\n1us/JGGcPJGHIQbzlSyAPIOt" +
       "wtT5LMuFCo5iGgjYcvnI0XHOP9nOLNsx2W0XlhnKSCJewCuwJGqT\npXQc0l" +
       "RMsA1G5/b7p+7PDzcNs80FMQONMMS/77VufO38qJWh5EKVpTwWcZoIuOZOk5" +
       "xTEVPneOJp\n54zlUiinsNvBqTiXzZH5riXOkp8GY9OBsiVd8e7/VPQzlOBo" +
       "QckKRjJUwIY7QmfIcN5DPDpErD0F\nYUzCXFF+W/ntib+y8u3jp6vPv5TB6s" +
       "ElmqKgh7BIs32oiSgjPEppkLP7DzTa6nlV2nX5W7LYmuSs\nS3l9F/mEXqBU" +
       "psgX0DCEKEpCxxNZnIRSQgHLnd3drufJGnZh348JJvHZIiHrJzIMhdoloPn3" +
       "zczQ\n6JGZSazWmlZB7VYXNKTuLwuwBgeS151CXh5JggJSquLGTH+1NmXp1t" +
       "xAHlOEyZ6UmWRD/Pb755fd\ngzevzaQk6EQXWVOitUREeCxJYJKgLE537L43" +
       "ODo0cFP2S73OvqsP16eQyrQ0i7rezkIfdY+eXQit\n69OmgHU9JurVbPNquZ" +
       "GtMRGyoYRUm1vKVPWO/QGbESRBRQQAAA==");
    final private java.lang.String
      _sjprotocol_p_vs =
      ("H4sIAAAAAAAAAIWQv28TMRTHXy4N/UERbaEIiSAm1AF0hxi6dIBUImpTl1Q6" +
       "mIPjWHcXubZrv5ar\nhJjLX8LCzogQGxsdu9KBhf+AAdsXAkSRctI9y/6+9z" +
       "7v+z78hIY18NAOYzzV3Iao+kPO0MaWW1u9\npp1tnhXyhbv0GFRfLQIoDWzM" +
       "LJ2sigg0WF6IAcIGscMk5CX/VCfj6qSq3iJwRVPDJR7BW4gcdV0r\ncZoJhS" +
       "N2xWjd//iS/Ph0r5rszpScbiD02K/N5t3z1uViHWoEFrSyBRZKItwmf4qSYy" +
       "xEcjBStkqt\nS7eoBzPdplwOJh07xtVDl0Mz7iWE9b+YymdwWXp3Ncfx57x2" +
       "SEdsTrg4EJTxHSUG3PTY++9f3zzb\ne3cWEHOSHrrea2RIT2giqMySFE0hMz" +
       "c8QhNzbgs3K+OSmkI9jjtp9/l+NZUHPZpprXuMfUMly6f4\nazDqUhFuVPSw" +
       "vB1q832qx76Cn1Wvx16PR3pj/uLzl1uvvtUhasOSUHTQpgyV2YVFzA23uTNb" +
       "6idP\nA2359YKLK+6PXLPrbubQKu0Q2ufiv5HqgvY9ednbj7p747X6c9WHa+" +
       "HpJsJcu7VLpuil/g1Ss/HS\nIQMAAA==");
    final public static int
      SUCCESS =
      1;
    final public static int
      UNSUCCESS =
      0;
    private Map
      database =
      new LinkedHashMap(
      );
    
    public static void
      main(
      String[] argv) {
        try {
            new Cloud(
              Integer.
                parseInt(
                argv[0]),
              argv[1],
              Integer.
                parseInt(
                argv[2]));
        }
        catch (IOException ioe) {
            ioe.
              printStackTrace();
        }
    }
    
    final private SJProtocol
      p_vs =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_vs);
    final private SJProtocol
      p_vu =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_vu);
    
    private void
      print(
      String s) {
        System.
          out.
          println(
          s);
    }
    
    private boolean
      verify_msg(
      JSONMessage info) {
        return true;
    }
    
    private boolean
      is_authenticated(
      String login,
      String password) {
        try {
            return this.
                     database.
                     get(
                     login).
                     equals(
                     password);
        }
        catch (NullPointerException exc) {
            return false;
        }
    }
    
    private void
      connectToDB(
      ) {
        this.
          database.
          put(
          "r.kamun@gmail.com",
          "00112358");
    }
    
    public Cloud(int portN,
                 String saas_hname,
                 int saas_port)
          throws IOException {
        super();
        this.
          connectToDB();
        SJServerSocket v3naS_vu =
          SJRServerSocket.
            create(
            p_vu,
            portN);
        SJSocket user_vu =
          null;
        {
            sj.runtime.net.SJSocket _sjtryreturned_1 =
              null;
            int _sjspawncount_user_vu =
              -1;
            try {
                user_vu =
                  v3naS_vu.
                    accept();
                boolean exit =
                  false;
                int counter =
                  0;
                int max_atempts =
                  5;
                while (user_vu.
                         outsync(
                         !exit)) {
                    String login =
                      (String)
                        user_vu.
                          receive();
                    String password =
                      (String)
                        user_vu.
                          receive();
                    counter++;
                    if (this.
                          is_authenticated(
                          login,
                          password) ||
                          counter >=
                          max_atempts) {
                        exit =
                          true;
                    }
                }
                if (counter <
                      max_atempts) {
                    {
                        user_vu.
                          outlabel(
                          "ACCESS");
                        JSONMessage req_info =
                          (JSONMessage)
                            user_vu.
                              receive();
                        SJServerAddress addr_vs =
                          SJServerAddress.
                            create(
                            p_vs,
                            saas_hname,
                            saas_port);
                        SJSocket s_vs =
                          SJRSocket.
                            create(
                            addr_vs);
                        {
                            sj.runtime.net.SJSocket _sjtryreturned_0 =
                              null;
                            int _sjspawncount_s_vs =
                              -1;
                            try {
                                s_vs.
                                  request();
                                s_vs.
                                  sendSession(
                                  user_vu,
                                  ("H4sIAAAAAAAAAIVRPU/jQBAdHMK3+MiJExI5USEKJBtR0KTgUlwEwRAkQx02" +
                                   "m1XsaOM1uwM40unq\nu19yDT0lQtddd5S0UNDwDyiYtcNxh5Cw7LG8M++9ec" +
                                   "/nD1A0GtZM18V+IkxWVasrOBrXCGPy06De\nOMGWZjEPD+igySG/hhwY8qHI" +
                                   "GY0ifPC77JR5JxhJb4uZcJcllVTDyrvkrzkdyxlGso2w4puul815\n/6C9v2" +
                                   "gvR1d8GEmYFjEewzcokOp8omS/IxUOtHON6vLFoX9/ueQA0MziGzONTKHJHz" +
                                   "fKn66rd+MF\n63AsUSbCSMUIC/4zKDe6P+hU0iShm8Kcsym4tukOUiiO3lz9" +
                                   "+nj0pwBODSakYu0a46j0NoxjqIUJ\nlWynyebnzP/U2RjVWXocIpuh8DKqoO" +
                                   "6zlpD/BV+QrIVQymOXLO54Aeoo7tAuCE5jh/Cr74YfiLj9\nxk+d7NEM6wjb" +
                                   "Qph/cZ3HnoWe2rAdsm3fo6RWfhXovmRcbJE7oZv85+3vr192fnzP6Idj1hMW" +
                                   "Nml3\nLWMoTER7cREzHal1tx409nbzDYwdm0AYrlW3/exj+lnSllL6BEirNi" +
                                   "fFAgAA"));
                                s_vs.
                                  send(
                                  req_info);
                            }
                            catch (UnknownHostException uhe) {
                                uhe.
                                  printStackTrace();
                            }
                            finally {
                                if (s_vs !=
                                      null &&
                                      s_vs !=
                                      _sjtryreturned_0)
                                    s_vs.
                                      close(
                                      _sjspawncount_s_vs);
                            }
                        }
                    }
                } else {
                    {
                        user_vu.
                          outlabel(
                          "DENY");
                        user_vu.
                          send(
                          "You have no permissions. BYE!");
                    }
                }
            }
            catch (SJIOException ioe) {
                ioe.
                  printStackTrace();
            }
            catch (SJIncompatibleSessionException stise) {
                stise.
                  printStackTrace();
            }
            catch (ClassNotFoundException cnfe) {
                cnfe.
                  printStackTrace();
            }
            finally {
                if (user_vu !=
                      null &&
                      user_vu !=
                      _sjtryreturned_1)
                    user_vu.
                      close(
                      _sjspawncount_user_vu);
            }
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369153763000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJ1Xb2wURRSf3rV3/YftlRZIKW0pRUHCHRpswBJjOdrQcqW1" +
       "V1DO4DHdm2u37O2u\nO7PXA5RIjICYkBBAMVHABENi+GAg6geNmoD/NTF8AL" +
       "9AVIwxUYh8MBCD0Tezu/dn76Bgk9nOzb55\n7817v997s6euogpqoHZdU7aN" +
       "KxoLsm06ocFhbFCSCCuY0lFYiEuPLrg19e2egbleVBdDdbIaZZjJ\nUlhTGc" +
       "mwGKpNkdQYMWhPIkESMRRQCUlEiSFjRd4OgpoaQw1UHlcxMw1CRwjVlDQXbK" +
       "CmTgxh01mM\noFpJUykzTIlpBmWoPjKJ0zhkMlkJRWTKuiPIl5SJkqDPop2o" +
       "LIIqkgoeB8FZEecUIaEx1MfXQbxa\nBjeNJJaIs6V8q6wmGGpz78ieuHMdCM" +
       "BWf4qwCS1rqlzFsIAaLJcUrI6HosyQ1XEQrdBMsMJQ822V\nglCljqWteJzE" +
       "GZrjlhu2XoFUlQgL38JQk1tMaMoYqNmVs7xsDflq/9k3fKPdI3xOEEnh/lfA" +
       "plbX\nphGSJAZRJWJtvGkGD/VvMls8CIFwk0vYkulZ+MGGyG+ftFkyc0vIDI" +
       "1NEonFpVtdLfPO9/xS5eVu\nVOoalTkUCk4usjpsv+nO6IDFWVmN/GXQefnp" +
       "yOebXniH/O5Blf3IJ2mKmVL7URVRE2F77od5RFaJ\ntTqUTFLC+lG5IpZ8mv" +
       "gN4UjKCuHhKIe5jtmEmGd0hJAfRhkMhqy/mUj8qAwrmpkI0kmGFjBCGQ1R\n" +
       "QwqxCUJlmEpExYasPRxypDJc4YypsjI4S4ubVwqAcK2mJIgRl05e+fq53nUv" +
       "7/VkkWW7AlC2tAez\n2oNCOyorE2pnF4aIxzzBqfHH6e76/Uvp+x7kjaEqOZ" +
       "UyGR5TCFAKK4o2RRJxJjAVyMOvgA1grnYM\n4AdIjiugSMAdYpI2UIcbZjly" +
       "9sMMA3bO7/z3+2vxqTMcETyDjVy75RrkY6vlW+3i6OaBLXs7vFxo\nqpyHGk" +
       "Q7p9cel67tGzxz4ZtLi3JwZqiziGXFOzlL3O4PG5pEElCFcupf+3vtnwcrVr" +
       "7n4ZCoguLD\nMEAGmNzqtlHAlm6n8vBgeSKoJqkZKazwV065qGYThjaVWxHQ" +
       "qBHz+yAAVTAgHIjaeOvjD/6ynj8C\nFpB4PF1nEHXt5ou+ZRc/qvnMk18C6/" +
       "JqZZQwi1CBXDpGDUJg/dKR4YOHr+55WuTCTgZDPt0cU2Qp\nI/xrKoPczyxB" +
       "7uCcxkOvLn7jopPsmTntPYaBt/FcZ3adn/f6F/hNID4QkMrbieCXV1jy0uIy" +
       "NGzI\nKWB52i5DB1pP/HrmykijJ69WLygql/l7rHotIlatZ8DC/DtZENLnls" +
       "w/tXPk8phVxxoKKdWrmqlH\njv1AFj9eK5Xgpxc6ighTA/QnEQDOpaDVC/h6" +
       "yIkifz4o5kt4lG3g21ut2MlasH+oNyMRndc5cYZ2\nezsnoLuG9PHe56A3Nb" +
       "bjr7NHq9utbPA9zcJERYkgF2yMS9s/3nD05nfssjheDvZcR1um2OxGnMfI\n" +
       "FRfSAd+7x1Ie5I+hetGvsco2YsXk8IpBx6VhezGCZhS8L+yeVqvoztK6xZ3l" +
       "PLNuwuVSAnMuzed+\nF8dmwbgfRqPNsUYXx0Q9DeRS2A9XhXFiNPx8/MSNXX" +
       "tWeDiCK9LccYhJXqrXm/zCs/vU4Xk1h358\nRYSfZ5YrXS2Md4jnQotdXgau" +
       "yyoWffgBoBoV96cMQ/7ohnC4NxoVoLEIz5+PFRxgEYwm+wBNxQfg\nkzXOcq" +
       "SEdT7vF6b5YwDMVm1YP53hahhLbQeQ8z/fMNL5ZKTYHtQSv27Iacwvh6gyga" +
       "ELYUoc1M/I\nVYxBrOeZ1uEw4nesWKcne4aNoLNcj6epo6+JTgYNU2VyigSj" +
       "A1DgmQbXg1J6t9yNXpP/eEZsF1jq\ntKmYY7JFMcTLzLzbXcJEidnz1PXa3f" +
       "jcZg4PvvEhCDzT9KUKSRMlx3C3kkFx53RgX/dk2099XSef\nL0XxtjvujEuB" +
       "9NwnvBPyl3AhyFKs6NJbuKm7kFjVBoE7uzpaQK/WLEjqbXTOtkEyu2QLKx11" +
       "G4x3\nLJTF11zRZKw2cdrbed3z4axO0bjLOcSEi+7vg+Lrf8GtXvhYlT1RM4" +
       "z2aU60XNf10n4jGxr8twZ4\nSkFNFS+X2huWwWJaky3bqQKytcLosq12lYoj" +
       "f4zeKVzCt+kd2wnVCPipimvejhKeBGGstD1Z+b88\ncbjZUnSRHYgOrR8klM" +
       "KXzvSevsRQdRq+I5Pb4ik67g6kf0zTFILVEifogbHKPsGqezuBJ4fQ5XcZ\n" +
       "0ANwC5BpHJtwWqhDEhS+BF/fX8KzFhhh27PwvXnmmJzWnyMM1UDTVaG1jmpr" +
       "Vos0Q3WrEB8R/NI2\np+h73/oqlTrOb1l0Vg98ZVHK+XL0wedb0lSU/IabN/" +
       "fpBknKwrLPar+6+PcWhMWdf6iA2bnw/bgl\newKaoiXLf72tl7hdWXeFzH8U" +
       "M+/GsxAAAA==");
}
