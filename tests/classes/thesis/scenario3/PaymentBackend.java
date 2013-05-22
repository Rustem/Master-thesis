package thesis.scenario3;

import sj.runtime.*;
import sj.runtime.net.*;
import java.util.*;
import java.io.*;

public class PaymentBackend
{
    final private java.lang.String
      _sjprotocol_p_pv =
      ("H4sIAAAAAAAAAIWSz2/TMBSAX9t16yhiP6ATjCK4oB1ACRISlx4grC3LyLaq" +
       "KVw71zFJKi8xtjcy\nCXGGv4QLd44IceMGR65w4MJ/wAHHactoixIptpy893" +
       "3v2X73C8qCw20xNOQpI0KP8WBIsBSGIEJk\nX93dh8QPo55a9DFkT6EIkHDY" +
       "yk2dzio6UMZBSD0JW44YmjrOPJNtTrLNLLvhwCJDnETyObyCorLW\nWExPfR" +
       "rLkTtzWDffP3F+frieVXZ1TsyBNvTx73v1a1+tH8slKDhQYbEIZRhHEi474y" +
       "TzWIbU7Iz+\nNBLGErVRRm63XYJJeEKmm1aa6pEKQ77+JaH215S1qhtN0gYL" +
       "SpXOS0xZlfRWrtQlkZdjTIGVCZ6D\nmQu1owFHEQ7mgMsYqUgJF50hOkHZVu" +
       "0gEewh1jjjuJPrODiWOZKUdmHM1NuxljqN1GmMnOWlbx8/\nbRx+KUGxDedo" +
       "jLw2wjLmNizLgBMRxNRL2P0HGn7+RUWNq+otKdiKKlGj3F0HDQj9p4ISRQMJ" +
       "61mT\nFEW+6UoeRr66DRIWOpbd1OVVVWHpvKZ49alL16EIkx3lJ7yP337//L" +
       "L1+M1rDV+I0JE+lVpKW9VN\npQ4jc2jyJQmVZmvbsfdbU6p02BzHLLYt25kb" +
       "kTD9cX2m9+KE3+ta+2671Z1cuXRe0asrEm7IgIhQ\nHRomEeJhfNfoqfMSzw" +
       "hvEolCKsac6lPbtfp7ltv7H6o+g9pG3BthRoWqsI2ZsEdx7AnN2mR/AJjv\n" +
       "RgSxBAAA");
    final private java.lang.String
      _sjprotocol_p_payment =
      ("H4sIAAAAAAAAAIWTv2/TQBTHX5ymTdqihh+pkAiiC+qAZCMhdckAVpNQF7eN" +
       "4sAaLucjduT6zN21\nuBJihr+EhZ0RITY2GFlhYOE/YODu7ARIItmS76x373" +
       "2+73tPfvcLKpzBHT4xxUVCuF7paEKw4CYn\nnGdR79AjsT+Q30MM2VMyoOTC" +
       "xqnMQWOijgQ03IRGF+OICkvXWSrcShnsFvLn2YYLFRyEkS9g1+WT\nnPdPtT" +
       "WrtrLqlgurCWIkFs/hFZSlamPaTa6dadi33z92f364ZQDInBtLck60whD/3m" +
       "ve/Gr/qJWV\n02pCeShCGgu4/tfmmQgjq5eftNIkSeVtWoVunXjEUIyDJTda" +
       "wUhmCrjqTtA5ygQOEA+OUNJKlTND\na9wt1Dg5EwUiilabMpNEUi8rTVNpmr" +
       "lmZe3bx0/bT7+UwejCekSR30VYUOZATQSM8IBGfprcf6Dh\nmy+qcq3Ltyxh" +
       "W7JFjfIOXTQi0X8dlCM0EnAlMxmheGx5goXxWN6hgJWe7bR1eyAbU/um5DXn" +
       "RtWL\nECYHUp+wIX77/fPLzqM3rzV8JUanRJXVFa2uTSkNM9PQ5C0B1XZn33" +
       "WOO3NSamlMc1a7tuMuzUgT\nHby04N2Y8Qd9+9jrdvqyebNwXn2CSXhOCn4y" +
       "hS7NZqb2dS13TcCOCAgPJRSTGLGQ3jMHcv78GWFt\nIlAY8WlfG08czx4e2d" +
       "5AtqZiO/Oo5gJqHzE/x+TGZdr2QtpDSn3+B+9U16NVBAAA");
    
    public static void
      main(
      String[] argv)
          throws IOException {
        
    }
    
    final private SJProtocol
      p_payment =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_payment);
    final private SJProtocol
      p_pv =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_pv);
    
    public PaymentBackend(int portNumber)
          throws ClassNotFoundException,
        IOException {
        super();
        String username =
          "";
        SJServerSocket ss_pv =
          null;
        try {
            ss_pv =
              SJRServerSocket.
                create(
                p_pv,
                portNumber);
            SJSocket s_pv =
              null;
            SJSocket s_pu =
              null;
            {
                sj.runtime.net.SJSocket _sjtryreturned_0 =
                  null;
                int _sjspawncount_s_pv =
                  -1;
                int _sjspawncount_s_pu =
                  -1;
                try {
                    s_pv =
                      ss_pv.
                        accept();
                    username =
                      (String)
                        s_pv.
                          receive();
                    s_pu =
                      s_pv.
                        receiveSession(
                        ("H4sIAAAAAAAAAIWTP2/TQBjG3zhNm7RFDX9SIRFEF9QByUZC6pIBrCahLm4b" +
                         "xYE1XM5H7Mj1mbtr\ncSXEDJ+EhZ0RITY2GFlhYOEbMHB3dgIkkWzJd9b5eX" +
                         "/P+9zZ735BhTO4wyemuEgI1yMdTQgW3OSE\n82zVO/RI7A/k8xBDdpUMKLmw" +
                         "cSo1aEzUKwENN6HRxTiiwtJ1llpupQx2C/nzbMOFCg7CyBew6/JJ\nzvun2p" +
                         "pVW1l1y4XVBDESi+fwCsrStTHtJvfOPOzb7x+7Pz/cMgCk5sYSzYl2GOLfe8" +
                         "2bX+0ftbJK\nWk0oD0VIYwHX/8Y8E2Fk9fI3rTRJUrmbVmFaJx4xFONgyY5W" +
                         "MJJKAVfdCTpHmcEB4sERSlqpSmZo\nj7uFHidnosBE0WpTZpJI6mXlaSpPM/" +
                         "esrH37+Gn76ZcyGF1YjyjyuwgLyhyoiYARHtDIT5P7DzR8\n80VVjnV5lyVs" +
                         "S7aoUd6hi0Yk+q+DcoRGAq5kISMUjy1PsDAeyz0UsNKznbZuD2Rjat6UvObc" +
                         "UfUi\nhMmB9CdsiN9+//yy8+jNaw1fidEpUWV1RavrUMrDzDw0eUtAtd3Zd5" +
                         "3jzpyVGhpTzWrXdtylijTR\ni5cWshvT2o0njmcPj2xv0OnL/s3CI+sTTMJz" +
                         "UvCfKXppdmxqXteO1wQ0RUB4KKGYxIiF9J65j5jf\nJgKFEZ/FHvTtY68re1" +
                         "ILO/OMnQXGQH5G/BlhOScPLqXbC9KHlPr8D0+LNUJVBAAA"));
                    {
                        this.new PTThread(
                          username,
                          s_pu,
                          s_pu).
                          _sjstart();
                        s_pu.
                          incrementSpawnCount();
                        s_pu =
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
                    if (s_pv !=
                          null &&
                          s_pv !=
                          _sjtryreturned_0)
                        s_pv.
                          close(
                          _sjspawncount_s_pv);
                    if (s_pu !=
                          null &&
                          s_pu !=
                          _sjtryreturned_0)
                        s_pu.
                          close(
                          _sjspawncount_s_pu);
                }
            }
        }
        finally {
            if (ss_pv !=
                  null)
                ss_pv.
                  close();
        }
    }
    
    private class PTThread
    extends SJThread
    {
        private sj.runtime.net.SJSocket
          s_pu =
          null;
        private int
          PAYMENT_PAID =
          1;
        private int
          PAYMENT_DECLINED =
          2;
        private int
          PAYMENT_FAILED =
          0;
        private String
          user;
        
        public PTThread(String uname,
                        sj.runtime.net.SJSocket s_pu) {
            super();
            this.
              user =
              uname;
            this.
              s_pu =
              s_pu;
        }
        
        final public java.lang.String
          _sjformal_run_s_pu =
          ("H4sIAAAAAAAAAIWTv2/TQBTHX5ymTdqihh+pkAiiC+qAZCMhdckAVpNQF7eN" +
           "4sAaLucjduT6zN21\nuBJihr+EhZ0RITY2GFlhYOE/YODu7ARIItmS76x373" +
           "2+73tPfvcLKpzBHT4xxUVCuF7paEKw4CYn\nnGdR79AjsT+Q30MM2VMyoOTC" +
           "xqnMQWOijgQ03IRGF+OICkvXWSrcShnsFvLn2YYLFRyEkS9g1+WT\nnPdPtT" +
           "WrtrLqlgurCWIkFs/hFZSlamPaTa6dadi33z92f364ZQDInBtLck60whD/3m" +
           "ve/Gr/qJWV\n02pCeShCGgu4/tfmmQgjq5eftNIkSeVtWoVunXjEUIyDJTda" +
           "wUhmCrjqTtA5ygQOEA+OUNJKlTND\na9wt1Dg5EwUiilabMpNEUi8rTVNpmr" +
           "lmZe3bx0/bT7+UwejCekSR30VYUOZATQSM8IBGfprcf6Dh\nmy+qcq3Ltyxh" +
           "W7JFjfIOXTQi0X8dlCM0EnAlMxmheGx5goXxWN6hgJWe7bR1eyAbU/um5DXn" +
           "RtWL\nECYHUp+wIX77/fPLzqM3rzV8JUanRJXVFa2uTSkNM9PQ5C0B1XZn33" +
           "WOO3NSamlMc1a7tuMuzUgT\nHby04N2Y8Qd9+9jrdvqyebNwXn2CSXhOCn4y" +
           "hS7NZqb2dS13TcCOCAgPJRSTGLGQ3jMHcv78GWFt\nIlAY8WlfG08czx4e2d" +
           "5AtqZiO/Oo5gJqHzE/x+TGZdr2QtpDSn3+B+9U16NVBAAA");
        
        public void
          run(
          ) {
            {
                sj.runtime.net.SJSocket _sjtryreturned_1 =
                  null;
                int _sjspawncount_s_pu =
                  -1;
                try {
                    Goods userGoods =
                      this.
                        getActivePayments(
                        this.
                          user);
                    s_pu.
                      send(
                      userGoods);
                    int result =
                      -1;
                    {
                        java.lang.String _sjbranch_0 =
                          s_pu.
                            inlabel();
                        if (_sjbranch_0.
                              equals(
                              "VISA_MASTER")) {
                                                  CardDetails cd =
                                                    (CardDetails)
                                                      s_pu.
                                                        receive();
                                                  result =
                                                    this.
                                                      sendTransactionViaProcessing(
                                                      userGoods,
                                                      cd);
                                              } else {
                            {
                                TransferDetails td =
                                  (TransferDetails)
                                    s_pu.
                                      receive();
                                result =
                                  this.
                                    finishTransfer(
                                    userGoods,
                                    td);
                            }
                        }
                    }
                    if (result ==
                          PAYMENT_PAID) {
                        {
                            s_pu.
                              outlabel(
                              "PAID");
                            s_pu.
                              send(
                              "PAYMENT SUCCEED. Congratulation");
                        }
                    } else
                              if (result ==
                                    PAYMENT_DECLINED) {
                                  {
                                      s_pu.
                                        outlabel(
                                        "DECLINED");
                                      s_pu.
                                        send(
                                        "PAYMENT DECLINED. Payment object is already paid.");
                                  }
                              } else {
                                  {
                                      s_pu.
                                        outlabel(
                                        "FAILED");
                                      s_pu.
                                        send(
                                        "Dear, your request has been declined by bank.");
                                  }
                              }
                }
                catch (java.lang.Exception _sjx) {
                    
                }
                finally {
                    if (s_pu !=
                          null &&
                          s_pu !=
                          _sjtryreturned_1)
                        s_pu.
                          close(
                          _sjspawncount_s_pu);
                }
            }
        }
        
        private int
          sendTransactionViaProcessing(
          Goods userGoods,
          CardDetails cd) {
            int totalMoney =
              this.
                _totalForGoods(
                userGoods);
            if (totalMoney >
                  0) {
                return PAYMENT_PAID;
            } else
                      if (totalMoney ==
                            0) {
                          return PAYMENT_DECLINED;
                      } else {
                          return PAYMENT_FAILED;
                      }
        }
        
        private int
          finishTransfer(
          Goods userGoods,
          TransferDetails td) {
            return this.
                     sendTransactionViaProcessing(
                     userGoods,
                     null);
        }
        
        private Goods
          getActivePayments(
          String user) {
            LinkedList lst =
              new LinkedList(
              );
            lst.
              add(
              new Good(
                "Saas1",
                25000,
                2));
            lst.
              add(
              new Good(
                "Saas2",
                50000,
                3));
            return new Goods(
              lst);
        }
        
        private int
          _totalForGoods(
          Goods userGoods) {
            int total =
              0;
            for (int i =
                   0;
                 i <
                   userGoods.
                     lst.
                     size();
                 i++) {
                Good g =
                  (Good)
                    userGoods.
                      lst.
                      get(
                      i);
                total +=
                  g.
                    productPrice;
            }
            return total;
        }
        
        final public static String
          jlc$CompilerVersion$jl =
          "2.2.3";
        final public static long
          jlc$SourceLastModified$jl =
          1369253281000L;
        final public static String
          jlc$ClassType$jl =
          ("H4sIAAAAAAAAAJ1Xa2xURRSebtvtg4U+eDWltKWU2IpsTRAiLiBLH7BloUtb" +
           "EGrIMr07295y997r\nzNx2i0ogJoL8MEEeaqLwx4TE8MNI1D9GTcC3JqY/wD" +
           "+QGIwxUYj+MBKD0TNz793H3S1Vmsx0duac\nM2fO+c7jXrqNyhlFraahTY9p" +
           "Bg/yaZOwYAxTRhLdGmZsGDbiyhMr7019c7x/WSmqGUE1qj7EMVeV\nbkPnJM" +
           "1HUCBFUqOEsnAiQRIjqE4nJDFEqIo19TAQGvoIqmfqmI65RQkbJMzQJgVhPb" +
           "NMQuWd7mYU\nBRRDZ5xaCjco46g2OoEncZfFVa0rqjIeiiJ/UiVagj2DjqCS" +
           "KCpPangMCJdE3Vd0SYldfWIfyKtV\nUJMmsUJclrJDqp7gqMXLkXlx+w4gAN" +
           "aKFOHjRuaqMh3DBqq3VdKwPtY1xKmqjwFpuWHBLRw1zioU\niCpNrBzCYyTO" +
           "UYOXLmYfAVWVNItg4Wixl0xKSlPU6PFZjrcG/IG/T8b+bPVJnRNE0YT+5cDU" +
           "7GEa\nJElCia4Qm/GuFTwT2W81+RAC4sUeYpsmvOqDPdGfP26xaZYVoRkYnS" +
           "AKjyv31jctnwn/WFUq1Kg0\nDaYKKOS9XHo15pyE0iZgcUlGojgMuoefDH62" +
           "/+jb5Bcfqowgv2JoVkqPoCqiJ7qddQWso6pO7N2B\nZJIRHkFlmtzyG/I3mC" +
           "OpakSYowzWJubjcp02EUIBGOUwjiH7LyQmjupieDpFdL4V/AOCg2yCo0c4\n" +
           "YZx1Map08XHCVFgqRMdUNdZ2FZCnxRXzp0pK4HVN3kjTAJbbDS1BaFy5eOur" +
           "53p3vHTCl8GaoxxH\nHfY1wcw1wfxr2mPDw+OU4AQqKZEXLc03o/BLQoTPr+" +
           "+Gal9ew973odIRVKWmUhbHoxqBsMOaZkyR\nRJxL3NXlYFxCC3AZGIXLAO1x" +
           "DQTJkAC7TVLU5oViNoAjsMKAr5kj/3x3Jz51WaBGeHmRkG6rBj47\nZOsW6B" +
           "w60H/wRFupIJoqA+uLl7TPLT2u3Dm58/K1r290ZCHPUXtBJBZyikjyqh+jhk" +
           "ISkKmy4l/9\na/tvp8s3vOcTsKmCBMUxwAqivdl7R15EhdzsJIzli6J5SYOm" +
           "sCaO3JRSzcepMZXdkWCZJ9cLwAA1\nMKpgdDuYDItJHNaKqc6GlrCn5w0y99" +
           "19wf/o9Q/nferLTZM1Ofl0iHA76Oqy7himhMD+jddip8/e\nPv609IXjDI78" +
           "pjWqqUpa6re4BHy/sEgCCDYsOnOu843rrrMXZqWHKcXTwtfpYzPLX/8cvwnJ" +
           "AYKU\nqYeJjMESx+1Cfj0kf8kpQBi0E617s5gfluvVwiKSC0lrtDokApjeaO" +
           "sTdcP1amr02T+unK9utbUU\nPI1STBkrzJN5jHHl8Ed7zt/9lt+Uhs3CQcho" +
           "SRdeuxfnIPXxa5N1/ncupHyoYgTVylqHdb4Xa5Yw\n+whUK9btbEbR/Lzz/M" +
           "pjp9lQBu5NXijmXOsFYja5wFpQi3WFB3u1MFbB2Ohgb6MHeyXIFIsNkqFN\n" +
           "zqsySKkwqTqJRXuAArHw/p29u4bjsXCkp4hxY1RNQY6fdIrQqea3frp8a3CR" +
           "L6dSrywolrk8drWW\n2lebabhhxf1ukNRXV6+4dGTw5qhdxerzk2WvbqXWXf" +
           "iedG4JKEVycSn0E3bciXldnr06YWxy7LWp\nuL36xBQCbLtm6entjkZ29faI" +
           "/fBsgh+CsdkRvLm44IgjeIEruC8cic4htgnGFkfsluJio47YMovZ\nEF8jhU" +
           "lzh5xYy4ZjoxOK4IXls3Uo0gPH9/0eeBFfPeBz4rYbsovTRmbi1ythp+zGXF" +
           "DXPNXyQ9/6\ni897A1h0tC335YwrdZPLdpeOq19AGcwEUEE7mM8Uyg+bakqg" +
           "m9WH84KnOS9xd8DodYzbWyxxi6m9\naEbz5MGlbCJILZ2rKRLUCQ8O9Q8ZUP" +
           "d58XRYKplLXeaGHOah/shAb1ohpuipXILWbJaVPtpl8D7D\n0hMFhM1Zwojo" +
           "qallcpIlk48agQCB2yTLk6at4FZAz6Sh2n30vjwA7oZBHBuR2WwUKvpMn3ym" +
           "z1Vu\nSUGLtM2A1t09bio47sY00UMgdWts7rIiEiyDRmuYYp1hRTx3r4plq8" +
           "AYFCYZZUXetw2G4bzPeKD3\niZ9mxlUFr5AKQc/xn18yBRkiqeoqG3dZZ9P9" +
           "MRjU0Z3+P90d/Mp0MbdKR6HfHCM8rIgc7TS2LPvu\nfK3Wwph2tJp+YK3Mub" +
           "U6DoaKc4Njrc+gEkvSUFDRKt1u23VLyxztOWSkhoJvbPtLUGmbOdhxxaz7\n" +
           "UvaWma81P3wyJS1Nyy3UOWu/SUlSlWr67bJtyn+vQF3x6sLhg9JdS4VP2bRn" +
           "IePatOLXuQzGFubl\nC/uh6X8BmwD5jSoQAAA=");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369253281000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVXXWxURRSevbvddtuFdgtFAqUtpUQKdhdjJGATY2na0LLY" +
       "tQW0a8gye+9se8v9\n49652y0q0ZAI8mBiwL9E4cWExPBgIOqDRk3Af01MH8" +
       "AXSAzGmChEHozEYPTMzN79ubvUJvfu3Jkz\n55w55zvfnJ6/iRocG/VYprYw" +
       "o5k0Thcs4sRT2HaIMqxhx9kLExn5kQ135787Pr42iFrTqFU1piim\nqjxsGp" +
       "QUaBpFdaJnie0MKQpR0ihmEKJMEVvFmnoEBE0jjdoddcbA1LWJM0kcU8szwX" +
       "bHtYjNbXqT\nSRSVTcOhtitT03YoakvO4TxOuFTVEknVoYNJFM6pRFOcw+go" +
       "CiRRQ07DMyC4KumdIsE1JkbZPIg3\nq+CmncMy8baEDqmGQlG3f0fpxH27QQ" +
       "C2NuqEzpolUyEDwwRqFy5p2JhJTFFbNWZAtMF0wQpFa+6p\nFISaLCwfwjMk" +
       "Q9Fqv1xKLIFUhIeFbaGowy/GNRVstMaXs4psTYSj/5xM/dUjcZ8VImvM/wbY" +
       "1OXb\nNElyxCaGTMTGO2789Ni02ykhBMIdPmEhM7Txw33JXz/tFjJr68hMZO" +
       "eITDPy3W2d6xaHfo4EmRtN\nlumoDApVJ+dZTRVXBgsWYHFVSSNbjHuLn01+" +
       "Mf38u+Q3CTWNobBsaq5ujKEIMZTh4rgRxknVIGJ2\nIpdzCB1DIY1PhU3+De" +
       "HIqRph4QjB2MJ0lo8LFkKoEZ4APMeQ+AuzF0WxFF7QiUF3Qn5AcdyZo+gB\n" +
       "ShzqJBxbTtBZ4qgwlImBbdV8KFEjXmAmls0HAnC6Tn+laQDLXaamEDsjn7vx" +
       "zbMju186IZWwVnQO\noCrMxEtm4tVmUCDA9d9XHT2WDoVVze8XBtteHnA+kF" +
       "AwjSKqrrsUZzUC1YY1zZwnSoZyuMUqoM0R\nBXCMZsEGgDyjgSJeCRCuvI16" +
       "/Qgs1+0YjDDAavHovz/cysxfZGBhyV3JtAvXIFWHhG/R/qkD4wdP\n9AaZ0H" +
       "yIZQFE+/5fe0a+dXLPxSvfXttURjpFfTUFWLuTFZDf/ZRtykQBgiqrf/3vXX" +
       "+catjxvsTQ\nEgFeohjQBEXe5bdRVUiDHimxYElJ1JIzbR1rbMljkmY6a5vz" +
       "5RmOkRY+Xg4BaIGnAZ4dRSj2sBdb\nbGOvmEAUi6fvDJzy7hwLb736ccvnUi" +
       "U7tlbQ6BShotZi5XTstQmB+WtvpE69evP40zwXxWRQFLbc\nrKbKBe5fRwBy" +
       "v6JO3cdXrzz9Wv9bV71kryhrH7JtvMByXXhhcd2bX+K3gROgNh31COGlFyil" +
       "3c9Q\nKVvVgQDyRYZ6peudXy7emFwpVdD4hhomrdwjqJxHrNkqgIX1S1ng0p" +
       "e3rD9/dPJ6VlBce3VJjRiu\n/vDZH0n/Y1G5TqEG4bLx4sTem/l4C5xO4meU" +
       "+Hc7RT08OqzQBHU/btJR0zWUkYJMLMZ4nqAIo2rG\nxyZKa/w4PUU7rBb9vD" +
       "LKbkgPyHr2mT8vnWnuEYlhe9YUfamNd9XGjHzkk31n7nxPr/OTliuA6egu\n" +
       "1JrdjyuKc/uVfCz83lldQo1p1MZvdWzQ/VhzGdLScC87w8XJJFpWtV59x4oL" +
       "ZbBU4Z3+hFeY9dde\nOTswZtJs3CjKzSoEAhYb7eTSvfy9UaBeoqBHNTCYa7" +
       "RsNY9Zp4MiVsYSvOtlp8OZi9uuQVWdxKfG\ngUOoCZeTqE/2frRkZLyOETYe" +
       "Ya9RUB4C5Xn2sYtv5z72FVNchpJIHWJIXnevFoCj+PhTt6Mv4ssH\nWNbZxg" +
       "fBfWpaAxrJE62MHL+SPbzj8cLZ+mT3T6Pbzj3nhw4r1e4ld2bkWH7tE8FZ9S" +
       "u4c0qpq2m5\nqjcNVies2SbQMRp7q9LWVWLJdng2w9NUZMmmuixZP+r3A6s5" +
       "vIutX61lRvI3WpzLBBtdCPbdlj5a\n1cfvh1AWO8JNf4da24BW9ZXcz0jpVJ" +
       "3w9C5xKg95bWUCEU2oZVlLnoV9bufGpgFsOhQylxgo7toK\nk3lTVQCJy6ub" +
       "C0bmq2v+RRCNrNy7eHDTJSv2tYiB12yGoePLuZpWWX0V47Blk5zKfQl7tch+" +
       "dDiW\nv9MB2JbG3FFNyALZhoUs+zps1YmLII7Cf42uoBHmDAAA");
}
