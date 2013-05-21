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
    final private static java.lang.String
      _sjprotocol_p_uv =
      ("H4sIAAAAAAAAAI1Sv2/TQBR+cZqSkIqWVEGgBrGAOlDZEgNLBgglUZO6TYVh" +
       "YArn88l2dLUP39E6\nEmKGv4SFnREhNjYYWWFg4T9g4H4koY0spZb87td73/" +
       "fe996HP1DhGezwsS0mjHBtU39MsOA2J5yb\nW2/wiIRx8lQeRhjMV7IA8gy2" +
       "l4YuRlkuVHAU00DAtsvHjvZzzkQ782jHRLddWGUoI4l4CW/AkqxN\nltJJSF" +
       "Mx5TYcnTsfn7m/P90ymW0V+Aw1wwj/vd+6+b3zq1aGkgtVlvJYxGki4Lo7C3" +
       "JeiZg6R9OX\nds5YLoWyl1bbT05lbWSxaEmz4qfBxBSgbEkDOhcA9DOU4KgA" +
       "sYKR9BSw6Y7RCTIZ7yEeHSDWnnEw\nJlmuqndbvdvT98qlH5+/XHvxrQxWDy" +
       "7TFAU9hEWa9aEmoozwKKVBzh481Gxrp1VpN+RvSbB1mbKG\n8gYu8gk9l1KZ" +
       "Il9AwyREURI6nsjiJJQCCljt7O52PU9i3F1atkeSoKDk+rH0QaHWV0Dzf7vM" +
       "vOhp\nmcur1pqWQO3WCqpR91cEWMP9CzX3CcEkPilq7tm8FOjmXH+1NiV6a2" +
       "EcjyjCZE/KTLIRfv/z6+vu\n/ru3ZlASdKxB1pVoLRERHss8MElQFqf37IE3" +
       "PDwwdLMCVnqdvqsPN2aUyrR0FnW9nbs+7h4+P+da\n16ctARt6TFTXbNO13C" +
       "jXmGrZUFqqzW1lqnrH/gEaGkh/QwQAAA==");
    
    public static void
      main(
      String[] argv) {
        try {
            new User(
              argv[0],
              Integer.
                parseInt(
                argv[1]));
        }
        catch (SJIOException sjioe) {
            sjioe.
              printStackTrace();
        }
    }
    
    final private static SJProtocol
      p_uv =
      new sj.runtime.SJProtocol(
      thesis.scenario2.User.
        _sjprotocol_p_uv);
    
    private Map
      buildConnectionRequest(
      ) {
        long curTime =
          new Timestamp(
            new Date(
              ).
              getTime()).
            getTime();
        Map msg =
          new LinkedHashMap(
          );
        msg.
          put(
          "action",
          "CONNECTION");
        msg.
          put(
          "client_email",
          "r.kamun@gmail.com");
        msg.
          put(
          "ts",
          curTime +
          "");
        return msg;
    }
    
    private void
      print(
      String s) {
        System.
          out.
          println(
          s);
    }
    
    private String
      login;
    private String
      password;
    Scanner
      sc =
      new Scanner(
      new InputStreamReader(
        System.
          in));
    
    public User(String hname,
                int port)
          throws SJIOException {
        super();
        SJServerAddress v3na_addr =
          SJServerAddress.
            create(
            p_uv,
            hname,
            port);
        SJSocket s_uv =
          SJRSocket.
            create(
            v3na_addr);
        {
            sj.runtime.net.SJSocket _sjtryreturned_0 =
              null;
            int _sjspawncount_s_uv =
              -1;
            try {
                s_uv.
                  request();
                while (s_uv.
                         insync()) {
                    System.
                      out.
                      println(
                      "Enter your login:");
                    this.
                      login =
                      sc.
                        nextLine();
                    System.
                      out.
                      println(
                      "Enter your password:");
                    this.
                      password =
                      sc.
                        nextLine();
                    s_uv.
                      send(
                      this.
                        login);
                    s_uv.
                      send(
                      this.
                        password);
                }
                {
                    java.lang.String _sjbranch_1 =
                      s_uv.
                        inlabel();
                    if (_sjbranch_1.
                          equals(
                          "ACCESS")) {
                                         s_uv.
                                           send(
                                           JSONMessage.
                                             create(
                                             JSONValue.
                                               toJSONString(
                                               this.
                                                 buildConnectionRequest())));
                                         {
                                             java.lang.String _sjbranch_0 =
                                               s_uv.
                                                 inlabel();
                                             if (_sjbranch_0.
                                                   equals(
                                                   "OK")) {
                                                              Map msg =
                                                                ((JSONMessage)
                                                                   s_uv.
                                                                     receive()).
                                                                  parse();
                                                              print(
                                                                "Result: " +
                                                                msg.
                                                                  get(
                                                                  "message"));
                                                          } else {
                                                 {
                                                     Map msg =
                                                       ((JSONMessage)
                                                          s_uv.
                                                            receive()).
                                                         parse();
                                                     print(
                                                       "Reason: " +
                                                       msg.
                                                         get(
                                                         "message"));
                                                 }
                                             }
                                         }
                                     } else {
                        {
                            print(
                              (String)
                                s_uv.
                                  receive());
                        }
                    }
                }
            }
            catch (SJIOException sjioe) {
                sjioe.
                  printStackTrace();
            }
            catch (Exception e) {
                e.
                  printStackTrace();
            }
            finally {
                if (s_uv !=
                      null &&
                      s_uv !=
                      _sjtryreturned_0)
                    s_uv.
                      close(
                      _sjspawncount_s_uv);
            }
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369152885000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJVXXWxURRSevbvdsqW1P1BoSmlLKUol3RUMBW00VkKlsE3X" +
       "LqDUkGX27mx7y917\nLzNztwsK0Rj5ezAx4F+i8GJCYngwEPVBoybgvyamD+" +
       "ALJAZjTBQiD0ZiMHpm7t2/u9s2Npnb2bln\nzjlzzvedOff8TVTDKOq2TP3g" +
       "pG7yMD9oERaOYcpIaouOGdsJCwn14dV3Z747tn2FHzVOoEbNiHPM\nNXWLaX" +
       "CS4xOoPkMySULZUCpFUhOo2SAkFSdUw7p2CARNYwK1MG3SwNymhI0TZupZId" +
       "jCbItQaTO/\nGEX1qmkwTm2Vm5Rx1BSdxlkcsbmmR6Ia44NRFExrRE+xA+gI" +
       "8kVRTVrHkyC4LJo/RURqjAyLdRCv\n08BNmsYqyW8J7NeMFEdd3h2FE/fuAA" +
       "HYWpshfMosmAoYGBZQi+OSjo3JSJxTzZgE0RrTBisctc+p\nFIQWWVjdjydJ" +
       "gqM2r1zMeQVSIRkWsYWjVq+Y1JSjqN2Ts5JsjQXr/zkZ+6tbkT6niKoL/2tg" +
       "U6dn\n0zhJE0oMlTgb79jh0yN77A4FIRBu9Qg7MkNrPtwV/fXTLkdmRRWZse" +
       "Q0UXlCvTvQsXJ26OeQX7ix\nyDKZJqBQdnKZ1Zj7ZjBnARaXFTSKl+H8y8/G" +
       "v9jz/LvkNwUtGkFB1dTtjDGCQsRIbXHntTCPagZx\nVsfSaUb4CArociloyt" +
       "8QjrSmExGOAMwtzKfkPGchhGph+GCoyPlrEA+OancxQsNsmqMeThhnEUbV\n" +
       "CJ8iTIOpSgxMNXNDxBXKCXUNMz4fnKTDyyodILjN1FOEJtRzN755buuOE8eV" +
       "Aq5cRyDljvJwQXlY\nKEc+n9S6vDw+IuApwYvfLww2vdzPPlCQfwKFtEzG5j" +
       "ipE+AT1nVzhqQSXAKquQS8EjMAuPokYA9g\nnNBBkcQ6BCRLUY8XY0VmjsAM" +
       "A3Bmj/z7w63EzEUBB5G+pUK74xokY7/jW31ffO/2fcd7/EJoJiDi\nDKK9C2" +
       "tPqLdOjl688u21tUUsc9RbQbHKnYIiXvdj1FRJCkpQUf3rf2/741TNQ+8rAg" +
       "8hqDwcA16A\nxp1eG2VUGcyXHREsJYoWp02awbp4la8VdXyKmjPFFYmMxXJ+" +
       "DwQgBAPCgZIu2DaLh3jZJB7NDo5E\nPD1nkEXtzovBB65+vPhzpbT+NZYUyj" +
       "jhDpuai+nYSQmB9WtvxE69evPYMzIXbjI4Clp2UtfUnPSv\n1Qe5X1KF2eG2" +
       "padf63vraj7ZS4rahyjFB0Wucy/MrnzzS/w2sB7Yx7RDRJJLkZYUqb8Fqrrc" +
       "KUAY\ndiooqyxOMaplgPtZtzi90vnOLxdvjC9VSir46ooiWrrHqeIylHVWDi" +
       "ysms+ClL68btX5I+PXk051\naynn2lbDzmw8+yPpe6xercJbP9wz+QCK5/1y" +
       "vk4E2MW8e/g2Nh2mtsG1DAnHt4+Mbc2pxBJFTrra\n7eoQBPSWkGFx8eXRm0" +
       "k+++elM3XdTjbEnnZpJ1AllmUbE+qhT3adufM9vy5PUYS90NGVqzS7G5cw\n" +
       "cvOVbHPwvbMZBdVOoCZ5WWOD78a6LeA1Adct2+IuRlFD2fvyq9O5JwYLtO7w" +
       "JrPErJdwxcjDXEiL\nea3DMSvn81li9riU7pHPNQ7U/Rz0aAYGc7UW1bKYg1" +
       "NBJtuZHIcbIWFn82lqLUsTFA9uwr3jEFM8\nHy2QuQ7GchgbXTJv9JDZh6Q/" +
       "Oyr9kUAZBss1ujmpGeJX/1wW2mEMuBYGqluIiccoF30GYzMmTc2p\nEECDHo" +
       "GxyVW4qbrCeKXLCLxVmJqPUkmFiavYcFHUIFPR6yK5yIZ2VwVAdOVcDYwk4r" +
       "Gnb9cfxZf3\nCnCLjQ9yFOKm1a+TLNGLBPEqGZX9Wh41jU91/TQ8cO6wlyF+" +
       "MN81786E2pxd8aR/SvsK7tMCQisa\nxvJNg+W4rKME+l1jZxk6OwsZaIKxFk" +
       "ajm4HGqjdARfgVMb9PPJ6Yv9hUtoiyRjvF9IK/97by0bJe\nee8Fkpg5Lnp7" +
       "68rWuawjlj6GCicSAO1e4ET9lmVV9xu50BC/gZSBDJQk+TLibtgAi1lTc2yr" +
       "ZdS4\nF0afa7WvWhwlL+Y1u6BPHD4xkramQ8MJKFdFvR4nB2zRErpUaChSYR" +
       "RbVdzshLHedXP9/3PTVywX\n/Qv7ehgKCpQ3QzZzB0RhEy2kuLLbKj71nA8S" +
       "tWd239pLVvPXDiLyHw1B6NzTtq6XltuSedCiJK1J\nk8F88RX/jsIN7+1igc" +
       "CFuXT6JUf2BBRgR1b8OmlVaRGcmyL3H9x1OOOuDgAA");
}
