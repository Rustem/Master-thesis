package thesis.scenario3;

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
      _sjprotocol_wallet =
      ("H4sIAAAAAAAAAIVRv2/TQBj9YhNI+dUUlAqJABPqgGQPSCwZ2ggS1a0TR3WC" +
       "xGQul5Pt6Ho+fEdx\nJcQMfwkLOyNCbGwwssLAwn/AwN3ZaWkVKZb8nXzf+9" +
       "573/OHP1AXOThi7shjToSp2XROsBSOIEKU\nt+HeAcEkPSJj9RlhKJ+aBTUf" +
       "rhwqGIpNS0LL5xk9jmkmXTPq6utOkcPWSonz3JYPdZykdCZhyxfz\niu+/af" +
       "dk2i2nOz5c5CgnTL6AN2Ar1dbCTaVdanTvf5z4vz/dswAU5vYSTGAUIvz3Uf" +
       "vO9+6vNVtv\n2uCZSGWaMQm3Ttd8KVPqjqpOp+C8UIE+WLltSNhsRZp6iVqh" +
       "q6VI9dkw5O5Kco9Nc8RwskSgjpFC\nSrjpz9ERKt3vIpEMEO8stDhXKhu67+" +
       "i+U/Xrl358/rL5/JsNVh8u0wzN+gjLLPdgTSY5EUlGZwXf\n3jFqV181VG2q" +
       "11Zk68qyoQr3fDQl9Iwlm6KphBulIYpY7IYyT1mswpRwfRL2DqJhMI76wWT4" +
       "xMQA\nyqI+rynm9rm/N6IIk13lhOQRfv/z6+ve/ru3RuYCQ4cm0w3N25YJEa" +
       "mKDROG8jR76AThYDQo0zcq\nTQlWsH9WUJfNRbc56j4b9IbjyBt2H4+9p70l" +
       "2IKby5as8tTrOR6TJCa5gd09ATRPAeX+/wD5m/qd\nnQMAAA==");
    final private static java.lang.String
      _sjprotocol_payment =
      ("H4sIAAAAAAAAAIWTz2/TMBSAX9N1a7ehlR+dkChiF7QDUoKEtEsPEK0ty8i2" +
       "qilci+uYJlUWB9sb\nmYQ4w1/ChTtHhLhxgyNXOHDhP+CA7aQF2kqJFFux3/" +
       "u+92zl3S+ocAYmn5jiIiFcj3Q0IVhwkxPO\ns1XvsE8wCc/JQH4OMWRPyYCS" +
       "CxunMgyN9ZaAhpvQ6GIcUWHpVEstt1IGu4WKebbhQgUHYeQL2HX5\nJOf9k2" +
       "3Nsq0su+XCaoIYicVzeAVlaW1Mq8ndmcO+/f6x+/PDLQNAxtxYEnOiDUP8e6" +
       "9586v9o1ZW\nnVYTykMR0ljA9b9tnokwsnr5TitNklQe6N3Cbk/OxIihGAdL" +
       "jrSCkQwVcNWdoHOUGQ4QD45Q0kpV\na4aWWIUSJy5wKFhtikwSCb2slKZSmr" +
       "mysvbt46ftp1/KYHRhPaLI7yIsKHOgJgJGeEAjP03uP9Dw\nzRdVOdblW5aw" +
       "LVmhRnmHLhqR6L8KyhEaCbiS9RiheGx5goXxWJ6hgJWe7bR1eSALU/Om5DXn" +
       "rqoX\nIUwOpJ+wIX77/fPLzqM3rzV8JUanRKXVFa2um1IOM3No8paAaruz7z" +
       "rHnTmVGhrTmNWu7bhLI9JE\nL15a6N2Y8Qd9+9jrdvqy+DuF1+WR2C/4wxS3" +
       "NLswNa9r1zUBOyIgPJRETGLEQnrPHMjL588IaxOB\nwohPi9p44nj28Mj2Br" +
       "IutbYzj2ouoPYR83NM3rUM214Ie0ipz/8AUQ1rzFUEAAA=");
    final private static java.lang.String
      _sjprotocol_p_uv =
      ("H4sIAAAAAAAAAI1TO2/TUBS+TZo0barSh1oqWgQdUAcqGwmJpUhgEoe6dZwo" +
       "dos6mRv7kjhybeN7\n26YSYoZfwsLOiBAbG4ysMLDwDxi4DzttUldplJwb33" +
       "PO933n4Y9/QQHHYAv3JHIWIcxt2O4hh2AJ\nI4zFrbn7DHW8wKIPtgPEZyIH" +
       "QD8Gm2NTR7NyOig4Xc93CdjUcU/mcfKFbHmQLYvsbR0UIxijgLwG\nb0GOsi" +
       "5HoX/W8UOScAsO5d6nff3P5ztC2VpGTIMz2M6/R+u3fyi/p/NgQgelKMQe8c" +
       "KAgFU9TZKP\niefLzcSz3Y+iPm2UNLZaLTiltaHRoinNZDt0z0QBzE5wQPka" +
       "gO0YBk43A7HgQBpJwJLegydQKN6B\nuFuH0XbKEUWUZYH5JeaXEn9h6ueXry" +
       "svv+dBrgZm/BC6NeiQMNbANOnGCHdD3+1HT55yttnTErXz\n9JejYDeoZA5l" +
       "7uqwjfwhSXkftglYFIJ8GHRkk8Re0KENJKCoVCqqaVKMB2PLbhyTMXWzAmcG" +
       "ZbKz\nzO9mM1Sz+zkCpprKYV01rGtNsoUc5J1kTbJ8RMNgh7sIWD7fGbG0fG" +
       "UHM2bnYnJO83lki8ynIieb\nilblDzeTutao3vWRbW760EE7dEootp0Pv769" +
       "UffevxN7FsAjxNJusJ7P89GzSUhiEilNqapWdM1Q\nR6iY2UhjijVF0zMj+l" +
       "eVMeh1yWophllTW1T8/bHNNlHgjuk0w10dmvctznWX0G8XYY8iOiiAsRc+\n" +
       "lCy6O/gViquIQM/HqajygWYqdl0xLaqL3W2NQq1fgqrA2E1gOPtSGrpyKfR5" +
       "GLoDruILRddVK21e\nSjd0Xmsh5vZNtWUbDcuuNfaN4Wk8vlp3w6w366J9KV" +
       "KusTeczYySeueTt8PWDKViaQdqRmwyd0q4\ncL5YWkBQB8U8TOMtEjsy2Oiq" +
       "ahwOgZUvLtGFpkTcu8FMif+L/gMmubfCogYAAA==");
    
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
      payment =
      new sj.runtime.SJProtocol(
      thesis.scenario3.User.
        _sjprotocol_payment);
    final private static SJProtocol
      wallet =
      new sj.runtime.SJProtocol(
      thesis.scenario3.User.
        _sjprotocol_wallet);
    final private static SJProtocol
      p_uv =
      new sj.runtime.SJProtocol(
      thesis.scenario3.User.
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
    private String
      cardNumber =
      "1111111111111111";
    private int
      walletNumber =
      78;
    private int
      txn_number =
      172;
    Scanner
      sc =
      new Scanner(
      new InputStreamReader(
        System.
          in));
    
    private int
      get_operation(
      ) {
        Random rnd =
          new Random(
          );
        return rnd.
                 nextInt(
                 2);
    }
    
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
                    java.lang.String _sjbranch_2 =
                      s_uv.
                        inlabel();
                    if (_sjbranch_2.
                          equals(
                          "ACCESS")) {
                                         int op =
                                           this.
                                             get_operation();
                                         if (op ==
                                               1) {
                                             {
                                                 s_uv.
                                                   outlabel(
                                                   "PAYMENT");
                                                 Goods myGoodsLst =
                                                   (Goods)
                                                     s_uv.
                                                       receive();
                                                 op =
                                                   this.
                                                     get_operation();
                                                 if (op ==
                                                       1) {
                                                     {
                                                         s_uv.
                                                           outlabel(
                                                           "VISA_MASTER");
                                                         CardDetails c =
                                                           new CardDetails(
                                                           this.
                                                             cardNumber);
                                                         s_uv.
                                                           send(
                                                           c);
                                                     }
                                                 } else {
                                                     {
                                                         s_uv.
                                                           outlabel(
                                                           "TRANSFER");
                                                         TransferDetails t =
                                                           new TransferDetails(
                                                           "Kazakhstan, 050000, c. Almaty, str. Zharokov, 167/65");
                                                         s_uv.
                                                           send(
                                                           t);
                                                     }
                                                 }
                                                 String msg =
                                                   "";
                                                 {
                                                     java.lang.String _sjbranch_0 =
                                                       s_uv.
                                                         inlabel();
                                                     if (_sjbranch_0.
                                                           equals(
                                                           "PAID")) {
                                                                        msg =
                                                                          (String)
                                                                            s_uv.
                                                                              receive();
                                                                    } else
                                                                              if (_sjbranch_0.
                                                                                    equals(
                                                                                    "DECLINED")) {
                                                                                                     msg =
                                                                                                       (String)
                                                                                                         s_uv.
                                                                                                           receive();
                                                                                                 } else {
                                                                                  {
                                                                                      msg =
                                                                                        (String)
                                                                                          s_uv.
                                                                                            receive();
                                                                                  }
                                                                              }
                                                 }
                                                 print(
                                                   "PAYMENT STATUS: " +
                                                   msg);
                                             }
                                         } else {
                                             {
                                                 s_uv.
                                                   outlabel(
                                                   "WALLET");
                                                 System.
                                                   out.
                                                   println(
                                                   "Wallet transaction: " +
                                                   (String)
                                                     s_uv.
                                                       receive());
                                                 s_uv.
                                                   send(
                                                   new Integer(
                                                     this.
                                                       txn_number));
                                                 s_uv.
                                                   send(
                                                   new Integer(
                                                     this.
                                                       walletNumber));
                                                 print(
                                                   "User sended data");
                                                 OSMPMessage msg =
                                                   null;
                                                 {
                                                     java.lang.String _sjbranch_1 =
                                                       s_uv.
                                                         inlabel();
                                                     if (_sjbranch_1.
                                                           equals(
                                                           "OK")) {
                                                                      msg =
                                                                        (OSMPMessage)
                                                                          s_uv.
                                                                            receive();
                                                                  } else
                                                                            if (_sjbranch_1.
                                                                                  equals(
                                                                                  "PAYMENT_INACTIVE")) {
                                                                                                           msg =
                                                                                                             (OSMPMessage)
                                                                                                               s_uv.
                                                                                                                 receive();
                                                                                                       } else {
                                                                                {
                                                                                    msg =
                                                                                      (OSMPMessage)
                                                                                        s_uv.
                                                                                          receive();
                                                                                }
                                                                            }
                                                 }
                                                 print(
                                                   "WALLET RECHARGE STATUS: " +
                                                   msg.
                                                     comment);
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
      1369295269000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVXW2xURRievXTLlq29QKEpvVGKgqS7IpGoRWOF1m67tbUX" +
       "hBJcZs/Obk85e87x\nnDm7W1TiJQryQGIAL4lAVBISw4OBqA8aNQHvmpg+gC" +
       "+QGIwxUYg8GInB6D9zzt7Oni76YJOZzs75\n5/v/+S/fzJy6gqp0DXWqijSX" +
       "lBQapHMq0YNjWNNJfLOEdX0SJqLCvatuZL7ZN7TCg+qmUZ0oT1BM\nRWGzIl" +
       "OSpdMokCKpGNH0vnicxKdRg0xIfIJoIpbEPSCoyNOoUReTMqaGRvRxoitSmg" +
       "k26oZKNK4z\nNxlBAUGRdaoZAlU0naL6yCxO45BBRSkUEXXaG0G+hEikuP44" +
       "2otcEVSVkHASBJdFcrsIccTQAJsH\n8RoRzNQSWCC5Jd7dohynqMO+Ir/j7m" +
       "EQgKXVKUJnlLwqr4xhAjWaJklYToYmqCbKSRCtUgzQQlHL\ngqAgtEjFwm6c" +
       "JFGKmu1yY+YnkPJzt7AlFDXZxThSVkMttpgVRWvUF/jrwNgfnW5uc5wIErO/" +
       "Cha1\n2xaNkwTRiCwQc+F1I3g4vN1odSMEwk02YVOmb/X7U5GfP+4wZVY4yI" +
       "zGZolAo8KNja1t830/+j3M\njEWqoossFUp2zqM6Zn3pzaqQi8vyiOxjMPfx" +
       "k/HPtj/9NvnFjRaFkU9QJCMlh5GfyPHN1rgaxhFR\nJubsaCKhExpGXolP+R" +
       "T+G9yRECXC3OGFsYrpDB9nVYRQNTQXtBPI/KtlHUXVUzrRgvosRV2U6FQP\n" +
       "6ZoQojNEF2EoEBlrorIhZAllGVxtxuWCnbTaq0qCFBxUpDjRosLJy1892T/8" +
       "4n53Pq8sQyDkJngw\nDx5k4Mjl4qjLS/3DHB5ndfHr6d76gz36e27kmUZ+MZ" +
       "UyKI5JBOoJS5KSIfEo5QnVUJS8PGcg4QIx\nyD1I46gEQDzXwSFpDXXZc6xQ" +
       "mWEYYUic+b1/f3c1mjnD0oGFbylDN02DYOw2bQusndg5tGt/l4cJ\nZbzMzy" +
       "DafXP0qHD1wMiZ819fXFPIZYq6y0qsfCUrEbv5Y5oikDhQUAH+lT8HfztUdc" +
       "+7bpYPfmAe\niiFfoIzb7TpKSqU3RzvMWe4IWpxQtBSW2KccV9TQGU3JFGZ4" +
       "Zizm41vAAX5o4A70lpVsk6xjH+tZ\n12DmEfOnbQ+c1K4/57vjwoeLP3UX81" +
       "9dEVFOEGpWU0MhHJMaITB/8dWxQ0eu7NvBY2EFgyKfasQk\nUchy+5pcEPsl" +
       "DpUdbF56+OW1r1/IBXtJAb1P0/Aci3X2mfm21z7HR6Hqofp0cQ/hxeXmmtwc" +
       "vxFY\nna9kSRg0GVQvJ6cxTUxB7actcnqp/cRPZy6PL3UXMfiqMhItXmOyOH" +
       "dljZoFDSsraeDS59atPLV3\n/FLMZLfG0lrrl43UXce/J2sfCAgOdeuBcybn" +
       "QNbfzsfrmIOtnLc236zPBjVDpmKKBCeGwqP9WYGo\njOS4qZ0WBitAO4UMsI" +
       "Mvl72p2BO/nz1W02lGg61p4Xr8Dr4sWRgV9nw0dez6t/QS30Uh7RlGR7Zc\n" +
       "7VZcVJF3n083+N45nnKj6mlUzw9rLNOtWDJYek3DcatvtiYjqLbke+nRaZ4T" +
       "vfmybrUHs0itveAK\nnocxk2bjarPG1KzLpbLRg1y6i/erzVT3UMARZQzqql" +
       "VNTGMKRvl0fp3Jsjk8lyIyzUWqqSRSwB9U\ngaPHrE3W35/XNeygi437WTfA" +
       "uocA35cBMiacYsNOKKP/CsWrRo20HSPPLDXQlkMbtJhl0MYsLsRV\nTZSr4l" +
       "k7AAqqJCUpyuxXz0IaWqCFLQ1hZw3bWDdF2aVH1zOKFq8IuB7akAU45Ay4ww" +
       "KsEbAWf9hg\nV86KkJ3Qhi3IYWfIxyzIgBmYAuj6hUA7oEUs0IgzKM7ZSbNy" +
       "VK4MCcWL7oM2YkGOOEPGy6OFIFBu\nXcilahHTTwhYtqq5lpdEt8UoBVZqsS" +
       "CAKtoWukhyQty37VrgBXxuJyMZtnADRX6qqD0SSROpQFR2\nkBF+b85Vb92j" +
       "HT8MbDz5lJ2pvKC+o+LKqNCQXvGIZ0b8Au41eaYou7iXLuot5YcajcC7Q54s" +
       "YYn2\nfATqoa2BVmdFoM7xJC5zv5uNbzNLsiLpl1/V+VlpHmqnPd3X3B8s6+" +
       "b3D28M66aJ9jdO+ROm5GXC\nbfTnd9Ri5X6lHfWoqupsN7JSg/1OA9mk4Gjg" +
       "H0PWgjthMq2Ipm5aUhy3Qttkad3k5EdeGRXV3tSm\n5+GpFzNECS7+kOUCOz" +
       "fHyeMGu5pbpVBbKIURrDqY2Q5ti2Xmlv9mpqvAlD03t/UgcCkcMzJn/Gcd\n" +
       "LGmDNmpZMvo/OewIeCRJaFSBRyV/jXMyYucIe1ewe1xz2fvffKUKXfO71pxV" +
       "G7400zP3kvTBcy5h\nSFLxGVw09qkaSYhctS93IrN/x+DaZ3/aAJvkx9z4o6" +
       "bsG3BWmrLs15uqw73RvD5k/wEhFC2wwxAA\nAA==");
}
