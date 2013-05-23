package thesis.scenario3;

import sj.runtime.*;
import sj.runtime.net.*;
import java.io.IOException;
import java.util.*;
import java.net.UnknownHostException;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;
import java.io.*;

public class Cloud
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
    final private java.lang.String
      _sjprotocol_p_vw =
      ("H4sIAAAAAAAAAIWSv2/TQBTHXxJCU6ggLQTxIwgJgTqA7EpILB0gQKKmdeKo" +
       "TpA6mcvlZDu62sfd\ntbgSYoa/hIWdESE2NhhZYWDhP2DgfJekJIpkS76z/b" +
       "7vfd73+T78gbLgcF+MLXnCiNBrMhwTLIUl\niBDmq7f7hARR3FcvPgZzFYoA" +
       "KYfN3NTFrKIDZRxGdCRh0xFjW+vs/7LtWbZtsrcdOMsQJ7F8CW+g\nqKg1lt" +
       "CTgCZywjaMxt2PA+f3p1umsxtLNK4m+Pjvw/rN741fqyUoOFBhiYhklMQSrj" +
       "rTJPtIRtTu\nTSLbKWOpGtS9XLceiUeLjhXj/KHSoIBkIQm1U4zxqV2mmbuC" +
       "4mT7ClPI6ZMiW7nkfYJJdExy4FnF\nyhxpTdffyq3vHskhRzEOlxDKGCmphE" +
       "vOGB0jM7sdJMIOYjNbyg6H9SxuZXFrEi+v/Pj85cqLbyUo\ntuAcTdCohbBM" +
       "eBtWZciJCBM6Stmjx5q29qqi1qq6S6rYRdWzLuXtOmhI6FxLJYqGEjZMQxTF" +
       "ge1J\nHsWB+pUSLgy85r7fdft+yx10n80mnu3rqnJ94ez0KMJkR3VCuI/f//" +
       "z6urn37q3GnInRoR5qLatb\nlyERkZobJjHiUfLAcr1Or2PGrymXJRTdvXlg" +
       "tlyfRqu9xkGn2e377W7jab/9vLlEm5qTcU1O5pnZ\ns9qxJAHhWnZ7JqieCo" +
       "x/Hb/D/gE15Q5v+gMAAA==");
    final private java.lang.String
      _sjprotocol_p_vp =
      ("H4sIAAAAAAAAAIWSz2/TMBTHX9t16xg/OsamTRTBAbQDKEFC4rIDhLVlGdlW" +
       "NWXX4jqmSeXFwfZG\nJiHO8Jdw4c4RIW7c4MgVDlz4DzhgO20HbaVEip3Y73" +
       "0/7+vn97+hLDjcEQNLniZEmJH1BgRLYQki\nRLbq7z4i/SjuqJ8uhuwpFAFS" +
       "Dpu5qZNZRQ/KOIxoIGHTEwPbxNn/ZNvjbDvL3vJgPkGcxPIFvIai\noq4mjJ" +
       "72KZNDdsZwbn146v36eD2r7OqMmAND6OI/92vXvjk/F0tQ8KCSMBHJiMUS1r" +
       "1Rkn0sI2q3\nhjtbaZKk6qBu57r1SRxMOlaMpSMVg/pEb0lYPcNkPo3LVLsr" +
       "KI6eFxKFHH0psp1LduMeRzEOZ9DL\nGKlICSveAJ2gzNoOEuEeSs6oHO7mMg" +
       "6OZQ5Eq10YaSoHHJY109JMa8gsL3z/9Hnt2dcSFJtwjjIU\nNBGWjLuwKENO" +
       "RMhokCYPHhrx8y8raqyqt6TELqkSjZS/66Eeof9VUKKoJ+FyZpKiuG/7kkdx" +
       "X3VP\nwlzLcevjo9VzVenVJi5JiyJMdhSf8C5+9+PLq8aTt2+M+FyMjohOu6" +
       "LVqsaUZlgZwyivSKjUG9ue\nu9+YQOlhYxQz33Rcb2ZEmrV8ecp7cazfaTv7" +
       "frPRVsVbuf1qE0yiE5JzIbV0ZdwzPV80uHUJN2RI\nRKREMYkRj9g9q6P6L5" +
       "4TXicSRVSM6lo6dH2nu+f4HVWaXrs5KVWbktpGPBjKDI2rsLWpsMeMBcJo\n" +
       "bSR/AQAKghGxBAAA");
    final private java.lang.String
      _sjprotocol_p_vu =
      ("H4sIAAAAAAAAAI1Tv2/TQBS+Jk2aNFV/qqWiRdABdaCykZBYigQmcahbx4li" +
       "t1Unc7GPxJFrG9+1\nTSTEDH8JCzsjQmxsMLLCwMJ/wMDd2U6T1FUaJe/ie+" +
       "993/d++ONfkMMh2MFdgfQDhLn1W11kESxg\nhHF0q+8/R23HM+iDaYHoM5UB" +
       "oBeC7Ymp41kZFeSsjuPaBGyruCvyOHEoWxxki1H2rgryAQyRR16D\ntyBDWV" +
       "cD3+23XZ/E3BGHdP/Tofrn891I2UZKTJ0zmNa/x5t3fki/i1kwpYJC4GOHOL" +
       "5HwLqaJIln\nxHHFRuzZ7QVBjzZKnFht/Yxc0OLQeNWUZ7rl2/2oAmanOOLD" +
       "myC2QuhZnRTInAVpKAEraheew0jz\nHsSdGgx2E5IgoDRLzC8wvxD7czM/v3" +
       "xde/k9CzJVMOv60K5Ci/ihAoqkEyLc8V27Fzx9xtnmLgrU\nLtJfhoItUM0c" +
       "St9XYQu5I5KyLmwRsBwJcqHXFnUSOl6btpCAvFQuy7p+o04q3oSyWX2zgyrZ" +
       "WeJ3\ncymi2f08ATMN6aQmawYV8GCiAB15dgp56ZTGwDafMAGrlxsTrSxf2M" +
       "GA2bkcn0U+i3SF2UThdENS\nKvzhVlzUBhW7ObbLDRdaaI9OCIWm9eHXtzfy" +
       "wft30ZJ58BSxtAXW70U+djYFIZpCQlOoyGVV0eQx\nKma2kph8VVLU1IjedW" +
       "UMGl0wmpKmV+UmFS9M7HQTWcg5T3tnhpvNoNdH5n2b090j9NtB2KGgFvJg\n" +
       "6PiPBIPuDn6Fwgoi0HFxoqt0pOiSWZN0g0pjdzvjUJtXoMowtGMYzr6ShK5d" +
       "CX3h+/aAK38sqaps\nJP1L6EbOG+3E/KEuN02tbpjV+qE2OpAn1+uu67VGLW" +
       "pfgpSpH4xmMyMl3sX47TAVTSobypGcEhuP\nnhIuXe6W4hHURiEPU3iLojUZ" +
       "LHVF1k5GwErDezTUlIB7t5gp8H/Bf5Kg9iSjBgAA");
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
                argv[0]));
        }
        catch (IOException ioe) {
            ioe.
              printStackTrace();
        }
    }
    
    final private SJProtocol
      p_payment =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_payment);
    final private SJProtocol
      p_wallet =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_wallet);
    final private SJProtocol
      p_vp =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_vp);
    final private SJProtocol
      p_vw =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_vw);
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
    
    Scanner
      sc =
      new Scanner(
      new InputStreamReader(
        System.
          in));
    private String
      payment_hostName;
    private int
      payment_port;
    private String
      wallet_hostName;
    private int
      wallet_port;
    
    private void
      set_backends_address(
      ) {
        System.
          out.
          println(
          "Enter payment hostname and port. For ex.: localhost:8000");
        String[] address =
          sc.
            next().
            split(
            ":");
        this.
          payment_hostName =
          address[0];
        this.
          payment_port =
          Integer.
            parseInt(
            address[1]);
        System.
          out.
          println(
          "Enter wallet hostname and port. For ex.: localhost:8001");
        address =
          sc.
            next().
            split(
            ":");
        this.
          wallet_hostName =
          address[0];
        this.
          wallet_port =
          Integer.
            parseInt(
            address[1]);
    }
    
    public Cloud(int portN)
          throws IOException {
        super();
        this.
          connectToDB();
        this.
          set_backends_address();
        SJServerSocket v3naS_vu =
          SJRServerSocket.
            create(
            p_vu,
            portN);
        SJSocket user_vu =
          null;
        String cur_user =
          null;
        {
            sj.runtime.net.SJSocket _sjtryreturned_2 =
              null;
            int _sjspawncount_user_vu =
              -1;
            try {
                user_vu =
                  v3naS_vu.
                    accept();
                print(
                  "Session with user initiated.");
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
                      cur_user =
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
                        print(
                          "User is allowed to proceed.");
                        {
                            java.lang.String _sjbranch_0 =
                              user_vu.
                                inlabel();
                            if (_sjbranch_0.
                                  equals(
                                  "PAYMENT")) {
                                                  print(
                                                    "User chosen PAYMENT op.");
                                                  SJServerAddress addr_vp =
                                                    SJServerAddress.
                                                      create(
                                                      p_vp,
                                                      this.
                                                        payment_hostName,
                                                      this.
                                                        payment_port);
                                                  SJSocket s_vp =
                                                    SJRSocket.
                                                      create(
                                                      addr_vp);
                                                  {
                                                      sj.runtime.net.SJSocket _sjtryreturned_0 =
                                                        null;
                                                      int _sjspawncount_s_vp =
                                                        -1;
                                                      try {
                                                          s_vp.
                                                            request();
                                                          s_vp.
                                                            send(
                                                            cur_user);
                                                          s_vp.
                                                            sendSession(
                                                            user_vu,
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
                                                             "5AtqZiO/Oo5gJqHzE/x+TGZdr2QtpDSn3+B+9U16NVBAAA"));
                                                      }
                                                      catch (UnknownHostException uhe) {
                                                          uhe.
                                                            printStackTrace();
                                                      }
                                                      finally {
                                                          if (s_vp !=
                                                                null &&
                                                                s_vp !=
                                                                _sjtryreturned_0)
                                                              s_vp.
                                                                close(
                                                                _sjspawncount_s_vp);
                                                      }
                                                  }
                                              } else {
                                {
                                    print(
                                      "User chosen WALLET op.");
                                    SJServerAddress addr_vw =
                                      SJServerAddress.
                                        create(
                                        p_vw,
                                        this.
                                          wallet_hostName,
                                        this.
                                          wallet_port);
                                    SJSocket s_vw =
                                      SJRSocket.
                                        create(
                                        addr_vw);
                                    {
                                        sj.runtime.net.SJSocket _sjtryreturned_1 =
                                          null;
                                        int _sjspawncount_s_vw =
                                          -1;
                                        try {
                                            s_vw.
                                              request();
                                            s_vw.
                                              send(
                                              cur_user);
                                            s_vw.
                                              sendSession(
                                              user_vu,
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
                                        }
                                        catch (UnknownHostException uhe) {
                                            uhe.
                                              printStackTrace();
                                        }
                                        finally {
                                            if (s_vw !=
                                                  null &&
                                                  s_vw !=
                                                  _sjtryreturned_1)
                                                s_vw.
                                                  close(
                                                  _sjspawncount_s_vw);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    {
                        user_vu.
                          outlabel(
                          "DENY");
                        print(
                          "User is canceled to proceed.");
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
                      _sjtryreturned_2)
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
      1369295211000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALUYa2wURXh6ba9P7IMWSCltKUVAwh3GaNRqYq1gCwfUXsuj" +
       "iMfc7tx1y97uujt7\nPVCJxgQQjYnhISYKxpCgBBICUX5ofARUfCVIFPwDUT" +
       "HGxEf0h5EYjX4zs3uPvW2LP2wy09mZ7zXf\ne+7Yz6jcMlGHoatbk6pOQ3Sr" +
       "QazQADYtIveq2LKGYCMm3Tnvr/FPd66YXYrqRlCdokUpporUq2uU\nZOgIqk" +
       "2RVJyYVo8sE3kENWiEyFFiKlhVtgGgro2gRktJapjaJrEGiaWraQbYaNkGMT" +
       "lPdzOCaiVd\ns6hpS1Q3LYrqI2M4jcM2VdRwRLFodwQFEwpRZethtB2VRFB5" +
       "QsVJAJwRcW8R5hTDy9k+gFcrIKaZ\nwBJxUcq2KJpMUbsXI3vjrpUAAKgVKU" +
       "JH9SyrMg3DBmoUIqlYS4aj1FS0JICW6zZwoahlQqIAVGlg\naQtOkhhFs7xw" +
       "A+IIoKq4WhgKRc1eME4pY6IWj83yrLUmWPv37oE/OgJcZplIKpO/HJDaPEiD" +
       "JEFM\noklEIF6zQ3v7N9itAYQAuNkDLGB65p8ejvzwTruAme0DsyY+RiQak/" +
       "66rXXOhZ7vqkqZGJWGbinM\nFQpuzq064Jx0ZwzwxRlZiuww5B6+O/jBhseP" +
       "kh8DqLIfBSVdtVNaP6oimtzrrCtgHVE0InbXJBIW\nof2oTOVbQZ1/gzoSik" +
       "qYOspgbWA6ytcZAyFUAaMExlEk/qaziaLKXlW35ZA1RtE8SixqhS1TCtNR\n" +
       "YimwlIiGTUW/JexCZRjBaeMlJXCXVm9cqeCEfboqEzMmHbn68aPLVj61K5D1" +
       "LEcUcGVBPZSlHuLU\nUUkJJzuzUEVM5zILjZ9Odtc/u8R6I4BKR1CVkkrZFM" +
       "dVAiGFVVUfJ3KMcp9qyPNf7jbgc7VxcD/w\n5JgKhLi7g07SJur0ulkuOPth" +
       "hcF3Lmz/5/wvsfFTzCOYBZsYdSEa2GOLkK12UXTTis27OksZ0HgZ\nUzWAdk" +
       "1NPSb9snvVqYufXF6Yc2eKuoqirBiTRYlX/AFTl4gMWShH/vk/+37dU37H6w" +
       "HmElWQfCgG\nl4FIbvPyKIiWbjfzMGUFIqgmoZsprLIjN11U01FTH8/tcNeo" +
       "4esbQAFVMEAd6DXH35JsYof1bGoQ\njsT06bkDz2vXngwuvfRWzfuB/BRYl5" +
       "cro4SKgGrImWPIJAT2Lx8Y2LPv550buS0cY1AUNOy4qkgZ\nLl9zCdh+uk9w" +
       "h2Y17d2/6MVLrrGn56j3mCbeymydeeLCnBc+xC9B4EMAWso2wuOrJGt2bxoa" +
       "MJUU\nRHnaSUPPtR3+/tTVwaZAXq6eV5Qu83FEvuYaqzYywGHuZBw49NnFc4" +
       "9tH7wSF3mssTCklml26tZD\nX5FF99RKPvFZChXF1RObb+LrxXl3ZN+N1NGO" +
       "oof61yzLSMRgmYxL2eGgsxDzZonlrLq5/pmKP/L7\nmYPVHULfDKeFs5jmo8" +
       "YCxJi07e3hg9c+o1f4BXKOzWi0Z4rZrsV5MXf7xXRD8MShVABVjKB6XpGx\n" +
       "Rtdi1WYONAI11ep1NiNoWsF5YX0UxaA7G7itXjvmsfWGVE7psGbQbF3hiaIZ" +
       "MG6E0eREUZMninjG\nFDHABAr1QzOQJGbjty8f/uOJnbcHmI+Wp5ngoJP6HN" +
       "xqm7U0O47tm1Oz9+unufqZZRnRezjzTj7P\nF/FTSkF0RcO80i6AYLJ4h5Sh" +
       "qCI63Nu7LBplB2ER0my+q+ACC2E0OxdoLr4AW9zrbq/w4c7W93PW\nbOoDtl" +
       "XDq6diXA1jiSMAcv/nM0YGWwwU84NsUWGYShqz9g9VyhjqDLaI6/XTcjlhFT" +
       "byWBtwGf69\nvphmIHuHISa+ETPw1hTRqEu02RoLmbZGlRQJRVdAHqc6dAF+" +
       "xB+ainilERuHikh4nXvQj0R8KhJl\nRixtTIieuB708QnRx64H3faiZ+0Kvo" +
       "ruhjHs2HXY365aMRcEtAOW5Ko8r3JEJaw5ucPPjTphrHXY\nrfVnx+UdhH7e" +
       "sWtsVLfoaghwl1te7ImmeiJms2Gsc5it82e2zWFW6zIzdJNOGghzYax3iK73" +
       "J/qY\nQ7ROOE/2Amw7MxHdFhgbHLob/Ok+7tCtcegWysopdznVIldsWhyDQX" +
       "KbM9FLgNe5net/q92Bz25i\nGYwh3gzBRXVjiUrSRM0VIS+RVfzh42bmunXt" +
       "3yy/7chj3irEHo/tk2LGpIb07AdKR5Vz0JVmq0DR\ny6sQqbsw91ebBB6O2l" +
       "BBBWjLqrneSaAzHTXP9O2j/EPKyZeT1vLitxbvdESvcrK067fAmzO6ePdY\n" +
       "xrIgF9H7SC1+gxY8LbmMVdkbMafpmOJGGd+e4y427Xc968BkiWQBBHtQJVpS" +
       "vIG4t+3LUQ0I8MJO\nhkcnvEU0wh4W7lmT2+Vk3/xw6C/fM0I+zivPsT2aR6" +
       "5zT3bIvl+BsisxcXySiOg8MlMTeRYSagpa\nI364xBAIS2EzrSvCPs8UhHQb" +
       "jD7HMn1+vsbjeTKX4vabWrATcDsosxrPBsd9JOmBsdKRZOV/kySQ\n84bMdY" +
       "pzGtSrWDFsw+sU6rAE1V/26qwirusqwZqPsK0wBh1hB/+bsNftD+9BFoVmVA" +
       "PDD+n33TuR\n3ubD2OiIsvF/EuUcxIUF2Zy9q4kmg95k2SQWhz0OoVfOn/Ts" +
       "CTWr6Nc38RuR1Hlh88IzRsNHIre4\nv+MEI6gyYatqfnOctw4aJkkoXISgaJ" +
       "UN/u9zsJ73ZwUoBdk1F+y8gP0CMoOAZV9f8lzyauZfATI9\nEi0UAAA=");
}
