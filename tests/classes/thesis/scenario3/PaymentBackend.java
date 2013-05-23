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
        try {
            new PaymentBackend(
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
                        this.new PaymentTransactionThread(
                          username,
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
    
    private class PaymentTransactionThread
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
        
        public PaymentTransactionThread(String uname,
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
                    int status =
                      -1;
                    Object obj =
                      new Object(
                      );
                    s_pu.
                      send(
                      userGoods);
                    CardDetails cardDetails =
                      null;
                    TransferDetails transferDetails =
                      null;
                    {
                        java.lang.String _sjbranch_0 =
                          s_pu.
                            inlabel();
                        if (_sjbranch_0.
                              equals(
                              "VISA_MASTER")) {
                                                  cardDetails =
                                                    (CardDetails)
                                                      s_pu.
                                                        receive();
                                              } else {
                            {
                                transferDetails =
                                  (TransferDetails)
                                    s_pu.
                                      receive();
                            }
                        }
                    }
                    int totalMoney =
                      this.
                        _totalForGoods(
                        userGoods);
                    if (cardDetails !=
                          null ||
                          transferDetails !=
                          null) {
                        if (totalMoney >
                              0) {
                            status =
                              PAYMENT_PAID;
                        } else
                                  if (totalMoney ==
                                        0) {
                                      status =
                                        PAYMENT_DECLINED;
                                  } else {
                                      status =
                                        PAYMENT_FAILED;
                                  }
                    }
                    if (status ==
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
                              if (status ==
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
          1369289175000L;
        final public static String
          jlc$ClassType$jl =
          ("H4sIAAAAAAAAAJ1XX2wURRifu7ZXWg7aK/8aKG0pJVKROxOEgPeg12sPrj3o" +
           "2SsIZ8gx3Ztrt+zt\nLruz1ytKEU0s8mBiwH+JwosJieHBSNQXoybgf01MH8" +
           "AXSAzGmChEH4zEYPSb2d27270rTWwy07mZ\n79983+/75ttLt1GDrqFuVZFm" +
           "JiSFBumMSvRgEms6yUYlrOtjsJERHt14b/rbuaF1dagljVpEOUUx\nFYWoIl" +
           "NSpGnkz5P8ONH0SDZLsmkUkAnJpogmYkk8DoSKnEZtujghY2poRB8luiIVGG" +
           "GbbqhE4zrt\nzQTyC4qsU80QqKLpFLUmpnABhwwqSqGEqNNwAvlyIpGy+jE0" +
           "izwJ1JCT8AQQrk7YtwhxiaEY2wfy\nZhHM1HJYIDZL/VFRzlLU5eYo3bh3GA" +
           "iAtTFP6KRSUlUvY9hAbaZJEpYnQimqifIEkDYoBmihaO2C\nQoFoiYqFo3iC" +
           "ZChqd9MlzSOgauJuYSwUrXKTcUlFDa11xawiWiM+/z9nkn91e7nNWSJIzP4G" +
           "YOp0\nMY2SHNGILBCT8a4RPBc/ZHR4EQLiVS5ikyay6cP9iV8+6TJp1tWgGR" +
           "mfIgLNCPd2dKyfj/zUVMfM\nWKIqusig4Lg5j2rSOgkXVcDi6pJEdhi0Dz8d" +
           "/fzQs++QX71oSRz5BEUy8nIcNRE5G7XWjbBOiDIx\nd0dyOZ3QOKqX+JZP4b" +
           "/BHTlRIswd9bBWMZ3k66KKEPLDaIAxh8y/CJsoCiTxTJ7ItB/iA4KD+hRF\n" +
           "D1GiUz2ka0KIThJdhKVAZKyJyrZQFXmRqVg27fHA7TrcmSYBLPcoUpZoGeHi" +
           "ra+fGRx+8bS3hDXL\nOIp2mmqCJTVBp5pe6+eYhmUdC8xjY5MawVnk8XDFa5" +
           "xuZXHKsnT67b1w60tb9Q+8qC6NmsR83qB4\nXCKQhliSlGmSzVCOw0AF5jnU" +
           "AKf+cVAO6M9IIIinCPixoKEeNzTLCR2HFQa8zc/++/2dzPRlhiIW\n9ZVMum" +
           "kaxPCoaZu/L3V46MjpnjpGNF0P0WA36V1ceka4c2bv5Wvf3NhcTgGKeqsys5" +
           "qTZZbb/KSm\nCCQLlass/rW/9/x+tmHX+14GoyYoWBQDzCD7O906HBkWtqsV" +
           "c5Y3gZbmFC2PJXZkl5hmOqkp0+Ud\nDp6lfL0cHNACowlG3MLobjaxw1Y2BU" +
           "yoMX+67sBr4d3nfQ9f/2jpZ97KstlSUV9ThJpJGCiHY0wj\nBPZvvJ48+8rt" +
           "uad4LKxgUORTjXFJFIrcvlUeiP2KGgUh2L7y3Kt9b163g72iLD2iaXiGxbp4" +
           "an79\nG1/gt6BYQNLq4nHCc9JjhZ3Jb4PHgHMyEAbNwmtrZvODfL2FeYRzIe" +
           "6NbouEAdOdfTH2jthRzY8/\n/eeV883dppWMZy0XU69X100HY0Y4/vH+83e/" +
           "oze5Y8twYDK6itVqD+AKpO68Vgj43r2Q96LGNGrl\nbx+W6QEsGcztaXi99K" +
           "i1mUDLHOfOl8gsu+ES3DvcUKxQ6wZiudjAmlGzdaMLe60wNsHot7DX78Ke\n" +
           "B6lssYsz9PB5UwkpjaomFjBrF5A/GTm0d3DfWCYZiQ/UcG5SE/NQ8wvWo/Ry" +
           "59s/X741utJb8XJv\nrHo8K3nM15tb36wWQcOG+2ng1Fe3bLg0O3pz3HzV2p" +
           "zFclA28tsv/ED6HvcLNWpzHfQXZt6xebvD\nX30wopa/orX9FWNTGLBtu2Vg" +
           "MJqI7xscYPuRhQQ/AGPAEjxQW3DcErzcFhyLxBOLiO2AEbPExmqL\nTVhi6w" +
           "3dhPhWLoy7O2zlWjkd11qpCFFYv1DHwiMwd/AP/wv46mGvlbdRqC5WW1nKX7" +
           "eEvbw7s0Hd\n8mTXj7EdF0+4E7gOdHfdlzMjBArrnqibFL+EZ7CUQFXtoZMp" +
           "7EybZo1AdyuPOZKn01G4N8MYtpw7\nXKtws6m3ZkVz1cE1+lRQM2Qq5klQJj" +
           "SYGkop0AfQ2uXQy5m9NnN7BXNqKD4yWBSIyjoGm6C7XGV5\njPYpNKYYcrZE" +
           "yK1NA/JBDGd6TDU19wMsCopoNswHHch6hKHAunxxocuH73d5jrXFCz60Z4EJ" +
           "QiMC\nS3CrLdLtq62u6qN2K9Df17B3G4yTlr0n/7e9xxa3F97g5RmqUCzFFI" +
           "1bwzMUCmX7Qk2dfZuuRbpC\nAH571aed+QEi9Mwf2XxFDXzFW5jSR4IPOvWc" +
           "IUmV70HF2qdqJCdys33m66Dyf7NQvty2UPiOsdfc\n4BMm7SlIbJOW/XpOtS" +
           "+zwgFL86LF/wCpjsXKoQ4AAA==");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369289175000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVXXWxURRSevbvddtuFdgtFAqUtpSg/sosxErSJWpo2tCx2" +
       "bQvKGrLM3jvb3nL/\nuHfudotKNCby82BiAH8ShRcTEsODoVEfNGoC/mti+g" +
       "C+QGIwxkQh8mAkBqNnZvbuz92lNrl3586c\nOefMOd/55vT8DdTg2KjHMrW5" +
       "Kc2kcTpnESeewrZDlEENO84kTGTkR9bdmf3u6OjqIGpNo1bVmKCY\nqvKgaV" +
       "BSoGkU1YmeJbYzoChESaOYQYgyQWwVa+phEDSNNGp31CkDU9cmzjhxTC3PBN" +
       "sd1yI2t+lN\nJlFUNg2H2q5MTduhqC05g/M44VJVSyRVh/YnUTinEk1xDqEj" +
       "KJBEDTkNT4HgiqR3igTXmBhm8yDe\nrIKbdg7LxNsSOqgaCkXd/h2lE/ftAg" +
       "HY2qgTOm2WTIUMDBOoXbikYWMqMUFt1ZgC0QbTBSsUrbqr\nUhBqsrB8EE+R" +
       "DEUr/XIpsQRSER4WtoWiDr8Y11Sw0SpfziqyNRaO/nMi9VePxH1WiKwx/xtg" +
       "U5dv\n0zjJEZsYMhEbb7vxUyP73E4JIRDu8AkLmYH1H+5J/vppt5BZXUdmLD" +
       "tDZJqR72zrXLMw8HMkyNxo\nskxHZVCoOjnPaqq40l+wAIsrShrZYtxb/Gz8" +
       "i30vvEt+k1DTCArLpubqxgiKEEMZLI4bYZxUDSJm\nx3I5h9ARFNL4VNjk3x" +
       "COnKoRFo4QjC1Mp/m4YCGEGuEJwHMcib8we1EUS+E5nRh0B+QHFMedGYru\n" +
       "p8ShTsKx5QSdJo4KQ5kY2FbNBxM14gVmYslsIACn6/RXmgaw3GlqCrEz8rnr" +
       "3zw3tOv4MamEtaJz\nAFVhJl4yE682gwIBrv+e6uixdCisan6/0N/2yhbnAw" +
       "kF0yii6rpLcVYjUG1Y08xZomQoh1usAtoc\nUQDHaBZsAMgzGijilQDhytuo" +
       "14/Act2OwAgDrBaO/PvDzczsPAMLS+5ypl24Bqk6KHyLbpzYP3rg\nWG+QCc" +
       "2GWBZAtO//tWfkmyd2z1/+9uqGMtIp6qspwNqdrID87qdsUyYKEFRZ/et/7/" +
       "zjZMPD70sM\nLRHgJYoBTVDkXX4bVYXU75ESC5aURC0509axxpY8Jmmm07Y5" +
       "W57hGGnh46UQgBZ4GuB5rAjFe9mL\nLbaxV0wgisXTdwZOebdfCm+98nHL51" +
       "IlO7ZW0OgEoaLWYuV0TNqEwPzVN1InT984+gzPRTEZFIUt\nN6upcoH71xGA" +
       "3C+rU/fxlctPvbbxrStespeVtQ/YNp5juS68uLDmzS/x28AJUJuOepjw0guU" +
       "0u5n\nqJSt6kAA+SJDvdr1zi/z18eXSxU0vq6GSSv3CCrnEWu2CmBh7WIWuP" +
       "SlzWvPHxm/lhUU115dUkOG\nqz909key8fGoXKdQg3DZeHFi7018vBlOJ/Ez" +
       "Svy7naIeHh1WaIK6nzDpsOkaylBBJhZjPE9QhFE1\n4yNjpTV+nJ6iHVaLfl" +
       "4ZZjekB2Q9++yfF88094jEsD2rir7UxrtqY0Y+/MmeM7e/p9f4ScsVwHR0\n" +
       "F2rN7sUVxbn9cj4Wfu+sLqHGNGrjtzo26F6suQxpabiXncHiZBItqVqvvmPF" +
       "hdJfqvBOf8IrzPpr\nr5wdGDNpNm4U5WYVAgGLjXZw6V7+Xi9QL1HQoxoYzD" +
       "VatprHrNNBEStjCd71stPhzMRt16CqTuIT\no8Ah1ITLSdQnez9aMjJaxwgb" +
       "D7HXMCgPgfI8+9jJt3Mf+4opLkNJpA4xJK+5WwvAUXz06VvRl/Gl\n/SzrbO" +
       "MD4D41rS0ayROtjBy/kt284/HC2fpU90/D284974cOK9XuRXdm5Fh+9ZPBaf" +
       "UruHNKqatp\nuao39VcnrNkm0DEak1Vp6yqxZDs8m+BpKrJkU12WrB/1+4DV" +
       "HN7F1q/WMiP5Gy3OZYKNLgT7bkkf\nrejj90Moix3hpr9DrW1Aq/pK7mekdK" +
       "pOeHoXOZWHvLYygYgm1LKsRc/CPrdzY/sAbDoUMpfYUty1\nFSbzpqoAEpdW" +
       "NxeMzFfW/IsgGlm5d+HAhotW7GsRA6/ZDEPHl3M1rbL6KsZhyyY5lfsS9mqR" +
       "/ehw\nLH+nA7AtjbmjmpAFsg0LWfZ1yKoTF0Echf8APIV4meYMAAA=");
}
