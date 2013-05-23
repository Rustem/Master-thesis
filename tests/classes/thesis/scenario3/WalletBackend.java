package thesis.scenario3;

import sj.runtime.*;
import sj.runtime.net.*;
import java.util.*;
import java.io.*;

public class WalletBackend
{
    final private java.lang.String
      _sjprotocol_p_wallet =
      ("H4sIAAAAAAAAAIVRv2/TQBR+sQmk/GoKSoVEgAl1QLKRkFgyQASJmtaJozpB" +
       "YjKXy8l2dLUP32tx\nJcQMfwkLOyNCbGwwssLAwn/AwN05aWkVKZb8zrr3ve" +
       "973+cPf6Aqc7gnZw4eCSZNzSYzRlE6kklZ\n3gY7AUunI/UdUiifigUVDy7t" +
       "KwyJmG4hNDyR8aOIZ+iaOVdft4octlbyn+W2PKjSOOFThC1PzuZ8\n/027x9" +
       "NuOd3y4LwgOUvxJbwBW6k2FtvMtUuN9t2PY+/3pzsWgMLcXILxjUJI/z5s3v" +
       "re/rVma6c1\nkckEkyxFuHFi8wAT7g7nnVYhRKHSdFa63WOUJYdsRaDaR6XQ" +
       "1VK8+qwZ/vsr+f0DnOQkpfEShSol\nCopw3ZuRQ1I62CYy7hPRWogJoWQ2dN" +
       "/RfWfer1748fnL5otvNlhduMgzMu0SilnegzWMcybjjE8L\n8eixUbv8qqZq" +
       "Xb22IltXOxuqYMcjE8ZPrWRzMkG4Vi7ESRq5AeZJGqlAEa6Og85eOPBHYdcf" +
       "D56a\nHECtqM8rirl55g8OOaFsW23C8pC+//n1dWf33Vsjcy4l+ybUDc3bxJ" +
       "jJROVGWUryJHvg+EF/2C/j\nNyp1BMvfPS2oy+aiWx+2n/c7g1HYG7SfjHrP" +
       "OkuwhTCXDZznqe05vRRZxHIDu30MqJ8ASv//ALyO\nL2+eAwAA");
    final private java.lang.String
      _sjprotocol_p_wv =
      ("H4sIAAAAAAAAAIWSv2/TQBTHXxxCU4ogLQTxIwgJgTqA7EpILB0gQKKmdeKo" +
       "TpA6mcvlZDu62sfd\ntbgSYoa/hIWdESE2NhhZYWDhP2DgfJemNIpkS76T73" +
       "3f+7zvO3/4AxXB4b6Y2PKIEaHXdDQhWApb\nECHMqb/9hIRxMlAfAQbzlCyA" +
       "jMN6Yep8luVCBUcxHUtYd8XE0Trnv2xnlu2Y7E0XzjLESSJfwhuw\nFLXOUn" +
       "oU0lRO2YbRvPtx6P7+dMt0dmOBxtOEAP992Lj5vflruQwlF6osFbGM00TCVf" +
       "c4yTmQMXX6\n08hmxlimBmUXut0lmMSHZN60wqzsKxkKdUhC/YRkrGqjWW6w" +
       "pFD5vsQUVUHvFUJ9kowLiHnB6nz5\n2c5hoxDiHcgRRwmOFpAqGCmphEvuBB" +
       "0iM7stJKIuYjNP2stqHrfzuD2NV5Z+fP5y5cW3MlhtOEdT\nNG4jLFPegWUZ" +
       "cSKilI4z9uixpp1/VVVrTb1lVeyi6lmX8rddNCL0VEtlikYS1kxDFCWh40se" +
       "J6G6\nSgkXhn5rN+h5g6DtDXvP9BxWVIv5vqoqN+b+nT5FmGypTggP8PufX1" +
       "+3dt691ZgzCdrXw63ndRsy\nIiJWc8MkQTxOH9ie3+13zTVoymUJlrdzGpgv" +
       "14+jtX5zr9vqDYJOr/l00HneWqDNmD68JqfzzO3Z\nnUSSkHAtuz0T1E4Exr" +
       "+O32H/AC7Zwsr6AwAA");
    
    public static void
      main(
      String[] argv) {
        try {
            new WalletBackend(
              Integer.
                parseInt(
                argv[0]));
        }
        catch (Exception e) {
            e.
              printStackTrace();
        }
    }
    
    final private SJProtocol
      p_wallet =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_wallet);
    final private SJProtocol
      p_wv =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_wv);
    
    public WalletBackend(int portNumber)
          throws ClassNotFoundException,
        IOException {
        super();
        String username =
          "";
        SJServerSocket ss_wv =
          null;
        try {
            ss_wv =
              SJRServerSocket.
                create(
                p_wv,
                portNumber);
            SJSocket s_wv =
              null;
            SJSocket s_wu =
              null;
            {
                sj.runtime.net.SJSocket _sjtryreturned_0 =
                  null;
                int _sjspawncount_s_wv =
                  -1;
                int _sjspawncount_s_wu =
                  -1;
                try {
                    s_wv =
                      ss_wv.
                        accept();
                    username =
                      (String)
                        s_wv.
                          receive();
                    s_wu =
                      s_wv.
                        receiveSession(
                        ("H4sIAAAAAAAAAIVRv2/TQBR+sQmk/GoKSoVEgAl1QLKRkFgyQASJmtaJozpB" +
                         "YjKXy8l2dLUP32tx\nJcQMfwkLOyNCbGwwssLAwn/AwN05aWkVKZb8zrr3ve" +
                         "973+cPf6Aqc7gnZw4eCSZNzSYzRlE6kklZ\n3gY7AUunI/UdUiifigUVDy7t" +
                         "KwyJmG4hNDyR8aOIZ+iaOVdft4octlbyn+W2PKjSOOFThC1PzuZ8\n/027x9" +
                         "NuOd3y4LwgOUvxJbwBW6k2FtvMtUuN9t2PY+/3pzsWgMLcXILxjUJI/z5s3v" +
                         "re/rVma6c1\nkckEkyxFuHFi8wAT7g7nnVYhRKHSdFa63WOUJYdsRaDaR6XQ" +
                         "1VK8+qwZ/vsr+f0DnOQkpfEShSol\nCopw3ZuRQ1I62CYy7hPRWogJoWQ2dN" +
                         "/RfWfer1748fnL5otvNlhduMgzMu0SilnegzWMcybjjE8L\n8eixUbv8qqZq" +
                         "Xb22IltXOxuqYMcjE8ZPrWRzMkG4Vi7ESRq5AeZJGqlAEa6Og85eOPBHYdcf" +
                         "D56a\nHECtqM8rirl55g8OOaFsW23C8pC+//n1dWf33Vsjcy4l+ybUDc3bxJ" +
                         "jJROVGWUryJHvg+EF/2C/j\nNyp1BMvfPS2oy+aiWx+2n/c7g1HYG7SfjHrP" +
                         "OkuwhTCXDZznqe05vRRZxHIDu30MqJ8ASv//ALyO\nL2+eAwAA"));
                    System.
                      out.
                      println(
                      "session accepted " +
                      s_wu.
                        toString());
                    {
                        this.new WalletRechargeTransactionThread(
                          username,
                          s_wu).
                          _sjstart();
                        s_wu.
                          incrementSpawnCount();
                        s_wu =
                          null;
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
                finally {
                    if (s_wv !=
                          null &&
                          s_wv !=
                          _sjtryreturned_0)
                        s_wv.
                          close(
                          _sjspawncount_s_wv);
                    if (s_wu !=
                          null &&
                          s_wu !=
                          _sjtryreturned_0)
                        s_wu.
                          close(
                          _sjspawncount_s_wu);
                }
            }
        }
        finally {
            if (ss_wv !=
                  null)
                ss_wv.
                  close();
        }
    }
    
    private class WalletRechargeTransactionThread
    extends SJThread
    {
        private sj.runtime.net.SJSocket
          s_wu =
          null;
        String
          user;
        LinkedHashMap
          walletIds =
          null;
        int
          WALLET_USERNOTFOUND =
          2;
        int
          WALLET_PAYMENTINACTIVE =
          0;
        int
          WALLET_OK =
          1;
        
        WalletRechargeTransactionThread(String username,
                                        sj.runtime.net.SJSocket s_wu) {
            super();
            this.
              user =
              username;
            this.
              s_wu =
              s_wu;
        }
        
        final public java.lang.String
          _sjformal_run_s_wu =
          ("H4sIAAAAAAAAAIVRv2/TQBR+sQmk/GoKSoVEgAl1QLKRkFgyQASJmtaJozpB" +
           "YjKXy8l2dLUP32tx\nJcQMfwkLOyNCbGwwssLAwn/AwN05aWkVKZb8zrr3ve" +
           "973+cPf6Aqc7gnZw4eCSZNzSYzRlE6kklZ\n3gY7AUunI/UdUiifigUVDy7t" +
           "KwyJmG4hNDyR8aOIZ+iaOVdft4octlbyn+W2PKjSOOFThC1PzuZ8\n/027x9" +
           "NuOd3y4LwgOUvxJbwBW6k2FtvMtUuN9t2PY+/3pzsWgMLcXILxjUJI/z5s3v" +
           "re/rVma6c1\nkckEkyxFuHFi8wAT7g7nnVYhRKHSdFa63WOUJYdsRaDaR6XQ" +
           "1VK8+qwZ/vsr+f0DnOQkpfEShSol\nCopw3ZuRQ1I62CYy7hPRWogJoWQ2dN" +
           "/RfWfer1748fnL5otvNlhduMgzMu0SilnegzWMcybjjE8L\n8eixUbv8qqZq" +
           "Xb22IltXOxuqYMcjE8ZPrWRzMkG4Vi7ESRq5AeZJGqlAEa6Og85eOPBHYdcf" +
           "D56a\nHECtqM8rirl55g8OOaFsW23C8pC+//n1dWf33Vsjcy4l+ybUDc3bxJ" +
           "jJROVGWUryJHvg+EF/2C/j\nNyp1BMvfPS2oy+aiWx+2n/c7g1HYG7SfjHrP" +
           "OkuwhTCXDZznqe05vRRZxHIDu30MqJ8ASv//ALyO\nL2+eAwAA");
        
        public void
          run(
          ) {
            {
                sj.runtime.net.SJSocket _sjtryreturned_1 =
                  null;
                int _sjspawncount_s_wu =
                  -1;
                try {
                    System.
                      out.
                      println(
                      "Thread invoked");
                    s_wu.
                      send(
                      "Start");
                    Integer txn_number =
                      (Integer)
                        s_wu.
                          receive();
                    System.
                      out.
                      println(
                      "received data");
                    Integer walletNumber =
                      (Integer)
                        s_wu.
                          receive();
                    System.
                      out.
                      println(
                      "received data");
                    System.
                      out.
                      println(
                      "Accepted txn: " +
                      txn_number +
                      " and walletNum: " +
                      walletNumber);
                    int result =
                      this.
                        make_payment(
                        txn_number.
                          intValue(),
                        walletNumber.
                          intValue());
                    if (result ==
                          WALLET_USERNOTFOUND) {
                        {
                            s_wu.
                              outlabel(
                              "USER_NOT_FOUND");
                            s_wu.
                              send(
                              new OSMPMessage(
                                WALLET_USERNOTFOUND,
                                "User not found."));
                        }
                    } else
                              if (result ==
                                    WALLET_PAYMENTINACTIVE) {
                                  {
                                      s_wu.
                                        outlabel(
                                        "PAYMENT_INACTIVE");
                                      s_wu.
                                        send(
                                        new OSMPMessage(
                                          WALLET_PAYMENTINACTIVE,
                                          "Payment inactive."));
                                  }
                              } else {
                                  {
                                      s_wu.
                                        outlabel(
                                        "OK");
                                      s_wu.
                                        send(
                                        new OSMPMessage(
                                          WALLET_OK,
                                          "Wallet recharged."));
                                  }
                              }
                }
                catch (java.lang.Exception _sjx) {
                    
                }
                finally {
                    if (s_wu !=
                          null &&
                          s_wu !=
                          _sjtryreturned_1)
                        s_wu.
                          close(
                          _sjspawncount_s_wu);
                }
            }
        }
        
        private int
          make_payment(
          int txn_number,
          int walletNumber) {
            if (txn_number >
                  100)
                return WALLET_USERNOTFOUND;
            else
                    if (txn_number <
                          0)
                        return WALLET_PAYMENTINACTIVE;
                    else
                            return WALLET_OK;
        }
        
        final public static String
          jlc$CompilerVersion$jl =
          "2.2.3";
        final public static long
          jlc$SourceLastModified$jl =
          1369295234000L;
        final public static String
          jlc$ClassType$jl =
          ("H4sIAAAAAAAAAIVXXWwUVRS+u223Pyz2F2hKaUspkYrumqhYWFTWupUt23bt" +
           "bkGquNzO3O1OOzsz\nzNzZbgERYyLIg4kB/xKFFxMSw4ORqC9GTcB/TUwfwB" +
           "dIDMaYKEQfjMRg9Nw7M/sz3ZYm9/buvefv\nnvOdc+6cu45qDB31aKo8Py2r" +
           "NEDnNWIE4lg3iDgoY8NIwkZK2Lbh1tx3x4bXVqHGSdQoKQmKqSQM\nqgoleT" +
           "qJ/FmSnSK6ERZFIk6iZoUQMUF0CcvSQSBUlUnUYkjTCqamToxxYqhyjhG2GK" +
           "ZGdK7T2Ywh\nv6AqBtVNgaq6QVFTbAbncNCkkhyMSQYNxZAvLRFZNA6gI8gT" +
           "QzVpGU8D4eqYc4sglxgcYvtA3iCB\nmXoaC8RhqZ6VFJGibjdH4cZ9u4AAWG" +
           "uzhGbUgqpqBcMGarFMkrEyHUxQXVKmgbRGNUELRR1LCgWi\nOg0Ls3iapChq" +
           "d9PFrSOgquduYSwUrXKTcUl5HXW4YlYSrTGf/98T8b97vNxmkQgys78GmLpc" +
           "TOMk\nTXSiCMRivGkGTkX3mp1ehIB4lYvYoglv/Ggi9uun3RbN2go0Y1MzRK" +
           "Ap4daWznUL4Z/rq5gZdZpq\nSAwKZTfnUY3bJ6G8BlhcXZDIDgPO4WfjX+w9" +
           "+i75zYvqosgnqLKZVaKonijioL2uhXVMUoi1O5ZO\nG4RGUbXMt3wq/w3uSE" +
           "syYe6ohrWGaYav8xpCyA+jBoaIrL8H2QQA3INlmdBHITwgN2DMULSZEoMa\n" +
           "QUMXgjRDDAmWAlGwLqn3Bd3UeaZg5ZzHA3frdOeZDKDcqcoi0VPC2WvfHI7s" +
           "eum4t4A02zSKHra0\nBApaAmVa+qxf40TIYH2aJHWsGFhgXktmdIJF5PFw9W" +
           "vKXctiJbKU+v39UNPL9xgfelHVJKqXslmT\n4imZQCqCXHWOiCnKsdhcgnsO" +
           "N8CqfwpsgAxIySCIpwn4MqejXjc8i0kdhRUGzC0c+e+HG6m58wxJ\nLPJtTL" +
           "plGsRx1rLN35/YN7z/eG8VI5qrhoiwm/TdXnpKuHFi5Pylb69sKqYBRX2Lsn" +
           "MxJ8sut/lx\nXRWICNWrKP71f3b+cbJm6wdeBqV6KFoUA9SgAnS5dZRlWcip" +
           "WMxZ3hhakVb1LJbZkVNmGmhGV+eK\nOxxCK/j6DnBAHYx6GI/YOH2ITeywiU" +
           "3NFuCYP1134PXw5gu+ey9/vOJzb2npbCypsQlCrURsLoYj\nqRMC+1feiJ98" +
           "9fqxp3gsrGCgPDdrlQdC3lqhFgTa20691v/WZSfGrUWhYV3H8yzE+ecX1r35" +
           "JX4b\n6gTkqyEdJDwdPXa0mfwWSEPOybAXsGquo5nN/Xx9FzPINov97rFJGB" +
           "7dqTfEWogTzOzUob8unG7o\nsaxkPB1cDOuN7pJZxpgSDn4ycfrm9/Qq92cR" +
           "BUxGd36x2t24BKADl3LNvvfOZL2odhI18baHFbob\nyybz9iQ0LmPQ3oyhlW" +
           "Xn5U3IqrihAso73QgsUevGX7HSwJpRs3VtBci1wRiwITfggpwHaWwxwKY+\n" +
           "iqpNw3LB3RYW2Xx/mbA7YWy1hW2tLCxkC6uf49UtKhoOFNa4C8VObGRGsLaU" +
           "sj4Y22xl2yor22Er\na90TjsUiydREIjI+OpYcGpsYfawCCOK6lIW2lLP75i" +
           "td7/xy/tp4m7fkcbFhUX8v5bEeGNzLDVoe\nNKxfTgOnvrh5/bkj41enrMbb" +
           "Ul7LI4qZfeDMj6R/h1+o0ECq4Am0XChCtndClb0zbHtnte2deHjv\nSGQ0GR" +
           "0NDyajuyPsNLKU+A4Y223x2yuLH3EibYsf21WUaKVwL5832g2AolpNl3IYHp" +
           "92ghdrQIdT\nlnS0bqkXEnfnsSf/9L+IL+7z2sXicYp89jO2UDTcEkb4a9DJ" +
           "pMY93T8NbTn7rLtqeEF397KcKaE5\nt/aJqoz0FbTcQtYueo6WM4XKc7VBJ/" +
           "CaVpJlGdtVcH2jHdmw7fpwxSZRybc+zZySJaFyeXUV5TXG\nTEA3FSplSUAh" +
           "NJAYTqjwJKGVmb22e2zmnmJF56EZVemQaipiJC8Qjb1eHML2Ei2J4ehYgYDf" +
           "4hmA\nN5xy4kHN0jwENSinStbD/emCU5pgPAojZTslVckpbIovZ38BnJHbt6" +
           "ADFD6O8CxJaXg+S6wkjOQh\n1rd5sjlX71r+5QdIa1/07WZ9YQi9C/s3XdCa" +
           "v+bvk8JXgA+e4mlTlkurfsnap+kkLXHTfVYP0Pi/\nw9CA3aZAwhbW3N5DFu" +
           "1zgCGLlv06qjl3aS0Lo3XP/P+XfIrcgg4AAA==");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369295234000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVXW2wUVRg+O7vddtvFdgtFAqUtpUQuYRdjIGoTY2na0LLY" +
       "teUia8hyduZsO2Vu\nzJzZXVCJxkSQBxMDoiYKLyYkhgcDUR80agLeNTF9AF" +
       "8gMRhjohB5MBKD0f+cM7OX2QWbzOyZc/7b\n+f/v/87puRuoxbHRgGVqh2Y1" +
       "kybpIYs4yQy2HaKMathxdsJETn509Z3Sd0cnV4RRZxZ1qsYMxVSV\nR02Dkj" +
       "LNorhO9DyxnRFFIUoWJQxClBliq1hTD4OgaWRRt6POGpi6NnGmiWNqRSbY7b" +
       "gWsblPfzKN\n4rJpONR2ZWraDkVd6XlcxCmXqloqrTp0OI2iBZVoinMQHUGh" +
       "NGopaHgWBJem/V2kuMXUOJsH8XYV\nwrQLWCa+SuSAaigU9Qc1Kjse2g4CoN" +
       "qqEzpnVlxFDAwTqFuEpGFjNjVDbdWYBdEW0wUvFC2/q1EQ\narOwfADPkhxF" +
       "y4JyGbEEUjGeFqZCUU9QjFsq22h5oGY11ZqKxv85nvlrQOIxK0TWWPwtoNQX" +
       "UJom\nBWITQyZC8babPDmx1+2VEALhnoCwkBlZ8+Gu9K+f9guZFU1kpvLzRK" +
       "Y5+c6W3pULIz/HwiyMNst0\nVAaFup3zqma8leGyBVhcWrHIFpP+4mfTX+x9" +
       "/l3ym4TaJlBUNjVXNyZQjBjKqDduhXFaNYiYnSoU\nHEInUETjU1GTf0M6Cq" +
       "pGWDoiMLYwnePjsoUQaoUnBE8Bib8oewEA92BNI3QrlAfsJp15ijZQ4lAn\n" +
       "5dhyis4RR4WhTAxsq+ZDqaB0mTlYVAqFYG+9wT7TAJTbTE0hdk4+e/2bZ8e2" +
       "v3xMqiDNC42iPuEl\nWfGSrPOCQiFu/v761LFaKKxlfj8/3PXKRucDCYWzKK" +
       "bquktxXiPQamDFLBElRznWEjW45nACLMbz\n4AMQntPAEG8DyFXRRoNB+FWb" +
       "dgJGGDC1cOTfH27mShcYUlhllzDrIjSo0wERW3zdzL7J/ccGw0yo\nFGElAN" +
       "Gh/7eek28e33Hh8rdX11ZhTtFQQ/c1arLuCYafsU2ZKMBOVfOv/73tjxMtj7" +
       "wvMajEgJQo\nBihBh/cFfdR10bDPSCxZUhp1FExbxxpb8mmknc7ZZqk6wyHS" +
       "wcf3QQI64GmBZ7OHw172Yotd7JUQ\ngGL5DOyB893tF6Obrnzc8blUS42dNR" +
       "w6Q6hotES1HDttQmD+6huZE6/dOPo0r4VXDIqilpvXVLnM\n4+sJQe0XN2n6" +
       "5LIlJ0+te+uKX+zFVesjto0PsVqXX1hY+eaX+G0gBGhMRz1MeN+FKmUP0lPG" +
       "VnXo\n/qJHT6/2vfPLhevTS6QaDl/dQKO1OoLHecbarTJ4WHUvD1z60oZV54" +
       "5MX8sLfuuub6kxw9U3n/mR\nrHs8Ljfp0zCcNH6e2Hs9H2+A3Ul8jxL/7qZo" +
       "gGeHNZrg7SdMOm66hjJWlonF6M4XFGlUzeTEVGWN\nb2fA88N6MUgr4+x49I" +
       "Gs55/58+Lp9gFRGKaz3IulMd91ijn58Ce7Tt/+nl7jO612ALPRX250uxvX\n" +
       "NOfDl4uJ6HtndAm1ZlEXP9KxQXdjzWVIy8Kh7Ix6k2m0qG69/oAVp8lwpcN7" +
       "gwWvcRvsvWp1YMyk\n2bhVtJtVDoUsNtrKpQf5e41AvUTBjmpgcNdq2WoRs2" +
       "sOHGG5Eqddvzg9znzSdg2q6iQ5MwkUQk04\nmER7svdjFR+TTXyw8Rh7jYPt" +
       "CNguso9tXJ2HOORVuIokUTnEgLzybsc/B/HRp27FX8KX9rGiM8UH\nKYpR09" +
       "qokSLRqsAJGtnBbzt+Njv39P80vuXsc0HksE7tv6dmTk4UVzwZnlO/giOnUr" +
       "mG61a90nB9\nvdptArdFY2dd1foqJNkNz3p42jySbGtKks2z/gCQmsNvsM2b" +
       "tUpIwUsWpzJBRufDQ7ekj5YO8eMh\nkseOCDN4O228fNbdKXmcscquGNUP3m" +
       "NXPvK6qvwhLqCWZTXfC/Igw773As50aGG+uNFT2ASTRVNV\nAISL6m4VjMWX" +
       "NfxjIK6v8uDC/rUXrcTXYvf+FTMK97yCq2m1bVczjlo2Kag8lKjfhOxHhw0F" +
       "bzgA\n2MqYx6kJWWDZqJBlXwetJhkRjFH+D+3HnejcDAAA");
}
