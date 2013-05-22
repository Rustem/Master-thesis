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
      _sjprotocol_p_uv =
      ("H4sIAAAAAAAAAI1Tv2/TQBS+JE2aNlV/qqWiRdABdaCykZBYMlCTONSt40Sx" +
       "26qTudhH4si1je/a\nJhJihr+EhZ0RITY2GFlhYOE/YODubKdN6iqNknfxvf" +
       "e+73s//PEvyOMQ7OCeQAYBwtz67R6yCBYw\nwji61fefo47jGfTBtED0yWQB" +
       "6Idge2LqeFZWBXmr67g2Adsq7ok8TrySLQ6zxSi7rIJCAEPkkdfg\nLchS1t" +
       "XAdwcd1ycxd8QhPfx0qP75fD9StpES0+AMpvXv6ea9H9LvmRzIqKAY+Nghju" +
       "8RsK4mSeIZ\ncVyxGXvK/SDo00YJE6tVvAtaGxovmtJMtX17EBXAbIYDircA" +
       "bIfQs7opiHkL0kgCVtQePIeR4j2I\nu3UYlBOOIKAsS8wvML8Q+/PTP798XX" +
       "v5PQeyNTDr+tCuQYv4oQJmSDdEuOu7dj94tsvZ5i6K1C7S\nX5aCLVDJHErf" +
       "V2EbuSOSci5sE7AcCXKh1xF1EjpehzaQgIJUqci6TjEeTyy7cUYm1M0KnB2W" +
       "yc4S\nv5tLUc3u5wmYbkondVkzbjXJFrKQc542ydIpDYMd7iJg9XJnoqXlKz" +
       "ucMTuX43OGzyNdZC4ROdWU\nlCp/uBPXtUH1bo5tc9OFFtqjU0KhaX349e2N" +
       "fPD+XbRnHjxFLG2B9XyRj55NQogmkdAUq3JFVTR5\njIqZrSSmUJMUNTWif1" +
       "MZw14XjZak6TW5RcU/mthsHXn2hE4z3PWRed/lXA8I/XYRdiiihTwYOv4T\n" +
       "waC7g1+hsIoIdFyciCodKbpk1iXdoLrY3c441OY1qAoM7RiGs68koWvXQl/4" +
       "vj3kKhxLqiobCc3I\neatFmD/U5ZapNQyz1jjURqdQvllvQ68361HbEqRs42" +
       "A0m5ndxLsYvxWmokkVQzmSU2LjeVPCpcuF\nUjyCOijkTWFmrz/c4aqsnYzA" +
       "lK6uzZV2BNy7xUyR/wv+A8TOuzeUBgAA");
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
      _sjprotocol_wallet =
      ("H4sIAAAAAAAAAIVSQW/TMBR+TShsDG1jUIREJ05oB6TkMIlLD6yCVuuWNtXS" +
       "InEKrmslqTzHs83I\nJMQZfgkX7hwR4sYNjlzhwIV/wAHbSQdMlRopz9Z73/" +
       "u+99l+9wvqUsB9OfPUGSfSxnwyI1hJTxIp\ny2x0EBE2Hel9jKH8ag7UAlg7" +
       "1hiUEFNS0Ah4Ts8Smivf9vkm3SoE7Czlv8jtBFDHaUanCnYCOav4\n/un2z7" +
       "v9srsVwGWOBGHqBF6Bq1Ub82kq7VKjfe/9OPj54a4DoDF3FmBCqxDj3w+a21" +
       "/bP1Zd43SF\n5zJTWc4U3P5r87nKqD+sKq2C80IaddCrAH+p6x6bCMRwuuBk" +
       "6xhppIIbwQydolJoH8m0j3irMBoO\n13Ja5bqpe6buVfX6lW8fP9169sUFpw" +
       "tXaY6mXYRVLnqwqlJBZJrTacEf7lm1ay9WdNzUv6vJNvTI\nlio6CNCE0P9G" +
       "cimaKNgqB6KIJX6kRMYS7VvB+jjqHMWDcBR3w/Hgsebylto/Iphkp2TJuzJm" +
       "a+eW\nzbqm2ZsXLm5IESb72hkRMX77/fPLzuGb15brEkPHlmTDzNlUKZGZng" +
       "MThkSW73ph1B/2Szl7eesK\nnPDQbrfmgiY05tXNYftpvzMYxb1B+9Go96Sz" +
       "AFtwm7ypqvsxx+X1mCIJERa2/QfznlhUewMAAA==");
    
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
                                                                                  print(
                                                                                    "PAYMENT STATUS: " +
                                                                                    msg);
                                                                              }
                                                 }
                                             }
                                         } else {
                                             {
                                                 s_uv.
                                                   outlabel(
                                                   "WALLET");
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
                                                                                print(
                                                                                  "WALLET RECHARGE STATUS: " +
                                                                                  msg.
                                                                                    comment);
                                                                            }
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
      1369250246000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVXW2xURRievXTLlq29QKEpvVGKgqS7IpEojcbSULrt1tYu" +
       "RSjBZfbs7PaUs+cc\nzpmzu0UlXqIoDyQG8JIIqDEhMTwYiPqgURPwronpA/" +
       "gCicEYE4XIg5EYjP4z5+zt7OmiDzaZ6eyc\nf77/n//yzczpq6hG11C3qkhz" +
       "KUmhQTqnEj04gTWdJAYlrOvbYCImbFp1M/vNwZEVHtQwjRpEOUox\nFYVBRa" +
       "YkR6dRIE3ScaLpA4kESUyjJpmQRJRoIpbE/SCoyNOoWRdTMqaGRvRJoitShg" +
       "k264ZKNK4z\nPxlBAUGRdaoZAlU0naLGyCzO4JBBRSkUEXXaH0G+pEikhL4P" +
       "HUCuCKpJSjgFgssi+V2EOGJoiM2D\neJ0IZmpJLJD8Eu9eUU5Q1GVfUdhx7y" +
       "gIwNLaNKEzSkGVV8YwgZpNkyQsp0JRqolyCkRrFAO0UNS2\nICgILVKxsBen" +
       "SIyiVrvchPkJpPzcLWwJRS12MY6U01CbLWYl0Rr3Bf46NPFHt5vbnCCCxOyv" +
       "gUWd\ntkWTJEk0IgvEXHjDCB4N7zTa3QiBcItN2JQZWP3+VOTnj7tMmRUOMu" +
       "PxWSLQmHBzY3vH/MCPfg8z\nY5Gq6CJLhbKd86hOWF/6cyrk4rICIvsYzH/8" +
       "ZPKznU++TX5xo0Vh5BMUyUjLYeQncmLQGtfCOCLK\nxJwdTyZ1QsPIK/Epn8" +
       "J/gzuSokSYO7wwVjGd4eOcihCqheaC9joy/+pZR1HtlE60oD5LUQ8lOtVD\n" +
       "uiaE6AzRRRgKRMaaqGwIWUI5BlefdblgJ+32qpIgBYcVKUG0mHDqylePbxl9" +
       "4Xl3Ia8sQyDkJniw\nAB5k4Mjl4qjLy/3DHJ5gdfHrmf7Gw336e27kmUZ+MZ" +
       "02KI5LBOoJS5KSJYkY5QnVVJK8PGcg4QJx\nyD1I45gEQDzXwSEZDfXYc6xY" +
       "mWEYYUic+QN/f3ctlj3L0oGFbylDN02DYOw1bQusje4e2fN8j4cJ\nZb3Mzy" +
       "Dae2v0mHDt0NjZC19fWlPMZYp6K0qsciUrEbv5E5oikARQUBH+5T+HfztSc9" +
       "+7bpYPfmAe\niiFfoIw77TrKSqU/TzvMWe4IWpxUtDSW2Kc8V9TRGU3JFmd4" +
       "Zizm49vAAX5o4A500kq2Sdaxj42s\nazLziPnTtgdOajee8d118cPFn7pL+a" +
       "+hhCijhJrV1FQMxzaNEJi/9MrEkWNXD+7isbCCQZFPNeKS\nKOS4fS0uiP0S" +
       "h8oOti49+tLa1y7mg72kiD6gaXiOxTr31HzHq5/j41D1UH26uJ/w4nJzTW6O" +
       "3wys\nzleyJAyaDKpXktOEJqah9jMWOb3Y+dZPZ69MLnWXMPiqChItXWOyOH" +
       "dlnZoDDSuraeDS59etPH1g\n8nLcZLfm8lrbIhvpe05+T9Y+GBAc6tYD50ze" +
       "gay/k4/XMQdbOW9tvlWfDWqGTMU0CUZHwuNbcgJR\nGclxU7stDFaAdgoZYg" +
       "dfPnvT8cd+P3eirtuMBlvTxvX4HXxZtjAm7P9o6sSNb+llvoti2jOMrlyl\n" +
       "2u24pCLvvZBp8r1zMu1GtdOokR/WWKbbsWSw9JqG41YftCYjqL7se/nRaZ4T" +
       "/YWybrcHs0StveCK\nnocxk2bjWrPG1JzLpbLRZi7dw/vVZqp7KOCIMgZ1ta" +
       "omZjAFo3w6v87k2ByeSxOZ5iPVUhYp4A+q\nwNFj1ibrHyjoGnXQxcZbWDfE" +
       "uq2A78sCGRNOsWEnlPF/heJVY0bGjlFgljpoy6ENWcwyZGMWF+Kq\nopWqeN" +
       "YOgYIaSUmJMvvVt5CGNmhbLQ1bnTXsYN0UZZceXc8qWqIq4HpowxbgsDPgLg" +
       "uwTsBa4iGD\nXTmrQnZDC1uQYWfIRy3IgBmYIuj6hUC7oI1YoCPOoDhvJ83J" +
       "Mbk6JBQvuh/aqAU56gyZqIwWgkC5\ndSGfqiVMHxWwbFVzPS+JXotRiqzUZk" +
       "EAVXQsdJHkhHhwx/XAc/j8bkYybOEGivxUUfskkiFSkajs\nIGP83pyv3oZH" +
       "un4Y2njqCTtTeUF9V9WVMaEps+Jhz4z4BdxrCkxRcXEvX9Rfzg91GoF3h7yt" +
       "jCU6\nCxFohLYGWoMVgQbHk7jC/W42vsMsyaqkX3lV52eleaid8fRed3+wrJ" +
       "ffP7xxrJsm2t84lU+YspcJ\nt9Ff2FGblfvVdtSnqqqz3chKDfY7A2SThqOB" +
       "fwxZC+6GyYwimrppWXHcDm2TpXWTkx95ZVRVe0ub\nnoWnXtwQJbj4Q5YL7N" +
       "ycJPsMdjW3SqG+WApjWHUwsxPaZsvMzf/NTFeRKftubeth4FI4ZmTO+E87\n" +
       "WNIBbcyyZOx/ctgx8EiK0JgCj0r+GudkxM4R9q5g97jWive/+UoVeub3rDmn" +
       "Nn1ppmf+JemD51zS\nkKTSM7hk7FM1khS5al/+RGb/TsC1z/60ATYpjLnxx0" +
       "3ZN+CsNGXZrzdVh3ujeX3I/QPZj7n5wxAA\nAA==");
}
