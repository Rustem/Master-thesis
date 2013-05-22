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
      _sjprotocol_p_payment =
      ("H4sIAAAAAAAAAIVTv2/TQBR+cZqSNhUtlFZIBJUFdUCyBySWDGC1CXVxSxQH" +
       "1nA5H7Ej12fujuJK\niBn+EhZ2RoTY2GBkhYGF/4CBd2enQBIplnxnvfve9+" +
       "Pu/O4X1KSAW3Jsq7OMSTPy4ZhRJW3JpCyq\nwWHA0rCP3wMKxVOxoOJD4wQx" +
       "ZMT0koItP+PJ2SjhyjF9ji63cgG7C/mnuS0fajSKk1DBri/HJd8/\n3c55t1" +
       "N0t3xYzohgqXoGr6CKqlsTN6V2oeHefP/I//lhxwJAzLU5mIdGYUB/32le/+" +
       "r+WKnqpPWM\ny1jFPFVw9W/M5ypOnG650sqzLMfddBam9dKhICmN5uxojRJE" +
       "Ktj0x+SUFAIHREZHJGvlOpmFGnqu\nZyiHapc0ztY4u8TVLnz7+Gn7yZcqWB" +
       "1YTTgJO4QqLjxYUZFgMuJJmGd37xnVtRd1HDfwrSLZOlo3\nVMGhT4Ys+c9a" +
       "NSFDBZcLYwlJR06gRJyOMLeCpa7r7RtjgMb03EC+5tT2dhNC2QHqMzGgb79/" +
       "ftl+\n8Oa1IV9KyQnTbeuabcOE0hp2oWGYLyqo77f3fO+4PSWlhysTzHLH9f" +
       "y5iDwzxbWZ7NY5f7/nHged\ndg/N2wvPsccoi0/Zgh9DU1cmZ2fcrBq5TQU3" +
       "VMRkjKSUpUTE/Lbdx4shnzKxzxSJEznx1XjsBe7g\nyA36aE3XdqapmjNUe0" +
       "SEJU0ZHGHbM7D7nIfyD1oSTSoJBAAA");
    final private java.lang.String
      _sjprotocol_p_wallet =
      ("H4sIAAAAAAAAAIWSMW/TQBTHX2wCLUVtKQQhkYoJdUCyKyGxZIAIEjWtE0d1" +
       "gsRkLpeT7ci1j7vX\n4kqIGT4JCzsjQmxsMLLCwMI3YODu7BSoIsWS7+x77/" +
       "1/7393735BXQpw5MzBU86kGfPJjFGUjmRS\nlqvB/iGjLDlhI/UbUiifmgU1" +
       "D9aOVBqJTAih4fE8PY3SHF1T6urlViFgZynivLblQZ3GSTpF2PHk\nrNL7p9" +
       "o9q3bL6pYHFzkRLMPn8ApsRW3Mu6nYJaN95/3Y+/nhtgWgcm4tyPENIaS/7z" +
       "e3v7Z/rNra\n6QrPZYJJniHc/GvzGJPUHVaRVsF5ITUd1Cxgd6lr/xgngmQ0" +
       "XrC1dUpUKsI1b0ZOSEnaIzLuE94q\nNMTiiqcwV3Xc0XGnitcvffv46cazLz" +
       "ZYXbic5mTaJRRz0YNVjAWTcZ5OC/7goaFdebGixk312kps\nQ/VspIJ9j0xY" +
       "+l9LdkomCFtlQynJIjdAkWSRMo6wPg46h+HAH4Vdfzx4rLTuLvUfsGy65FZp" +
       "p7Uz\nv3peU9LNc8c2TAlle8oWEyF9+/3zy87Bm9dG60JGjozIhm6yiTGTiW" +
       "qCsoyIJL/n+EF/2C9x5ujW\nESz/wHxuzYF6aMyjm8P2035nMAp7g/ajUe9J" +
       "Z0Fuwc3idawOR++V08uQRUyYtO0/9kUsfXwDAAA=");
    final private java.lang.String
      _sjprotocol_p_vw =
      ("H4sIAAAAAAAAAIWSv2/TQBTHXxJCU4ogUIqKCEIMqAPIRkJi6QABEjWtE0d1" +
       "gsRkLpeT7ehqH3fX\n4kqIGf4SFnZGhNjYYGSFgYX/gIH7kaYkimRLvpPvfd" +
       "/7vO/zffgDVcHhrpg48pgRYdZsNCFYCkcQ\nIexpsPuYREk6UB8hBvuUygA5" +
       "h63C1MWssgdVHCd0LGHLExPX6Nz/st1Ztmuztz04yxAnqXwJb6Cs\nqBsso8" +
       "cRzeSUbRnN2x+H3u9PN21n15dofEMI8d8HjRvfm79WK1DyoMYykcgkSyVsei" +
       "dJ7qFMqNuf\nRrZzxnI1qDuFbgOSjhcdK8bagdKgiOiQhI1TjPVpXObaXUlx" +
       "9L7CFFIRnULiPsEkOSIFUF2zNkdY\nM47uFdb3D+WIoxTHSwhVjJRUwro3QU" +
       "fIzmwHibiL2MyOsXFJxx0dd6bx6sqPz1+uvvhWgXIbztEM\njdsIy4x3YFXG" +
       "nIg4o+OcPXxkaOdf1dRaV29FFbuoejalgl0PjQida6lC0UjCZdsQRWnkBpIn" +
       "aaR+\noYQLw6C1H/b8Qdj2h72ns0nrva4qNxbuTJ8iTHZUJ4SH+P3Pr69be+" +
       "/eGsyZFB2YoV7RdRsyJiJR\nc8MkRTzJ7jt+0O137fgNZV1C2d+bB+rl2km0" +
       "3m8+77Z6g7DTaz4ZdJ61lmhzZg435XSe2p7TSSWJ\nCDeyWzNB/VRg/bN/9N" +
       "gOQ+wDAAA=");
    final private java.lang.String
      _sjprotocol_p_vu =
      ("H4sIAAAAAAAAAI1Tv0/bQBQ+EhICQRBAUFSoWoaKociuVKlLhuImTjE4ThQb" +
       "EJN7sa+JI2O7vgOC\nVHVu/5Iu3TtWVbdu7di1Hbr0P+jQu7MdkmAUouRdfO" +
       "+97/veD3/8C3I4BDu4J5DLAGFu/XYPWQQL\nGGEc3er7z1HH8Qz6YFog+kxl" +
       "AOiHYHti6nhWRgU5q+u4NgHbKu6JPE4cyhYH2WKUXVZBPoAh8shr\n8BZkKO" +
       "tq4LuXHdcnMXfEIT38dKj++Xw/UraREtPgDKb17+nmvR/S79ksmFJBIfCxQx" +
       "zfI2BdTZLE\nM+K4YjP2lPtB0KeNEidW2zgjF7Q4NF415Zlu+/ZlVAGzUxzx" +
       "8W0Q2yH0rG4KZM6CNJSAFbUHz2Gk\neQ/ibh0G5YQkCCjNEvMLzC/E/tzMzy" +
       "9f115+z4JMDcy5PrRr0CJ+qIBZ0g0R7vqu3Q+e7XK2+YsC\ntSX6y1CwRaqZ" +
       "Q+n7Kmwjd0RS1oVtApYjQS70OqJOQsfr0BYSkJcqFVnXb9VJxZtQNqtvblAl" +
       "O4v8\nbj5FNLtfIGCmKZ3UZc2gAh5NFKAjz04hL57SGNjhEyZg9WpjopXlCz" +
       "sYMDuXr046i3SF2UThdFNS\nqvzhTlzUBhW7ObbLTRdaaI9OCIWm9eHXtzfy" +
       "wft30ZJ58BSxtEXW7xIfO5uCEE0hoSlU5YqqaPIY\nFTNbSUy+JilqakT/pj" +
       "IGjS4YLUnTa3KLihcmdrqFLOScp70zw81m0Osj877L6R4Q+u0i7FBQC3kw\n" +
       "dPwngkF3B79CYRUR6Lg40VU8UnTJrEu6QaWxu51xqM1rUBUY2jEMZ19JQteu" +
       "hb7wfXvAlT+WVFU2\nEpqRc/Y2u7BwqMstU2sYZq1xqI0Oonyz3oZeb9ajti" +
       "VImcbBaDYzu4m3FL8VpqJJFUM5klNi45FT\nwqWrnVI8gjoo5E1hZq8/WOOq" +
       "rJ2MwBSHN2eoHQH3bjFT4P+C/15ZSkCVBgAA");
    final private java.lang.String
      _sjprotocol_p_vp =
      ("H4sIAAAAAAAAAIWSQW/TMBiGv7br1rGJlU0blSgCCaEdhpID0i47QFhblpGN" +
       "qilci+uYJJUXZ7YZ\nmYQ4wy/hwp0jQty4wZErHLjwDzhgO21hbaVGipM47/" +
       "c+32v7/W8oCw53xMCS5ykRZmT9AcFSWIII\nkc/6hw9IGCdd9dHDkF+FIkDG" +
       "YXtu6WRV0YMyjmIaSNj2xMA2Ovu/antcbefVex4spoiTRJ7Caygq\n6mbK6H" +
       "lImRyyc4Zz+8MT79fHG3ln12ZoHhtCD//ZrV//5vxcLkHBg0rKRCxjlkioea" +
       "Mi+4WMqd0e\n/tnL0jRTC7UzN61PkmAysWKsnCgNCon+JWHzHybPaVJmOl1B" +
       "cfRzKVXI0Zsi23PJbtLnKMHRDHoZ\nI6WUsOEN0BnKox0gER2h9CJ11VA5XN" +
       "E6S+usoa689P3T561nX0tQbMElylDQQlgy7sKyjDgREaNB\nlt67b6irLytq" +
       "rKq7pMzWVOvGyj/0UJ/QC62VKOpLWM8boygJbV/yOAnViktYaDtuY7wc+rmm" +
       "/OoT\nG9umCJMDxSe8h9/9+PKq+ejtG2O+kKAToss2tFvVhNIMK2cY53UJlU" +
       "Zz33OPmxMoPdRGmsWW43oz\nFVm+TdWp7MWxf7fjHPutZkc1b83dxw7BJD4j" +
       "cw6Rtq6M9s50c9ngrkq4KSMiYmWKSYJ4zO5aXXUw\nxHPCG0SimIpRXytPXd" +
       "/pHTl+V7Wm525NWtWnrPYRD4Y2w+BKtjUle8hYIIxXLf0LlfhVSWUEAAA=");
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
            nextLine().
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
            nextLine().
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
                                                            ("H4sIAAAAAAAAAIVTv2/TQBR+cZqSNhUtlFZIBJUFdUCyBySWDGC1CXVxSxQH" +
                                                             "1nA5H7Ej12fujuJK\niBn+EhZ2RoTY2GBkhYGF/4CBd2enQBIplnxnvfve9+" +
                                                             "Pu/O4X1KSAW3Jsq7OMSTPy4ZhRJW3JpCyq\nwWHA0rCP3wMKxVOxoOJD4wQx" +
                                                             "ZMT0koItP+PJ2SjhyjF9ji63cgG7C/mnuS0fajSKk1DBri/HJd8/\n3c55t1" +
                                                             "N0t3xYzohgqXoGr6CKqlsTN6V2oeHefP/I//lhxwJAzLU5mIdGYUB/32le/+" +
                                                             "r+WKnqpPWM\ny1jFPFVw9W/M5ypOnG650sqzLMfddBam9dKhICmN5uxojRJE" +
                                                             "Ktj0x+SUFAIHREZHJGvlOpmFGnqu\nZyiHapc0ztY4u8TVLnz7+Gn7yZcqWB" +
                                                             "1YTTgJO4QqLjxYUZFgMuJJmGd37xnVtRd1HDfwrSLZOlo3\nVMGhT4Ys+c9a" +
                                                             "NSFDBZcLYwlJR06gRJyOMLeCpa7r7RtjgMb03EC+5tT2dhNC2QHqMzGgb79/" +
                                                             "ftl+\n8Oa1IV9KyQnTbeuabcOE0hp2oWGYLyqo77f3fO+4PSWlhysTzHLH9f" +
                                                             "y5iDwzxbWZ7NY5f7/nHged\ndg/N2wvPsccoi0/Zgh9DU1cmZ2fcrBq5TQU3" +
                                                             "VMRkjKSUpUTE/Lbdx4shnzKxzxSJEznx1XjsBe7g\nyA36aE3XdqapmjNUe0" +
                                                             "SEJU0ZHGHbM7D7nIfyD1oSTSoJBAAA"));
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
                                              ("H4sIAAAAAAAAAIWSMW/TQBTHX2wCLUVtKQQhkYoJdUCyKyGxZIAIEjWtE0d1" +
                                               "gsRkLpeT7ci1j7vX\n4kqIGT4JCzsjQmxsMLLCwMI3YODu7BSoIsWS7+x77/" +
                                               "1/7393735BXQpw5MzBU86kGfPJjFGUjmRS\nlqvB/iGjLDlhI/UbUiifmgU1" +
                                               "D9aOVBqJTAih4fE8PY3SHF1T6urlViFgZynivLblQZ3GSTpF2PHk\nrNL7p9" +
                                               "o9q3bL6pYHFzkRLMPn8ApsRW3Mu6nYJaN95/3Y+/nhtgWgcm4tyPENIaS/7z" +
                                               "e3v7Z/rNra\n6QrPZYJJniHc/GvzGJPUHVaRVsF5ITUd1Cxgd6lr/xgngmQ0" +
                                               "XrC1dUpUKsI1b0ZOSEnaIzLuE94q\nNMTiiqcwV3Xc0XGnitcvffv46cazLz" +
                                               "ZYXbic5mTaJRRz0YNVjAWTcZ5OC/7goaFdebGixk312kps\nQ/VspIJ9j0xY" +
                                               "+l9LdkomCFtlQynJIjdAkWSRMo6wPg46h+HAH4Vdfzx4rLTuLvUfsGy65FZp" +
                                               "p7Uz\nv3peU9LNc8c2TAlle8oWEyF9+/3zy87Bm9dG60JGjozIhm6yiTGTiW" +
                                               "qCsoyIJL/n+EF/2C9x5ujW\nESz/wHxuzYF6aMyjm8P2035nMAp7g/ajUe9J" +
                                               "Z0Fuwc3idawOR++V08uQRUyYtO0/9kUsfXwDAAA="));
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
      1369248901000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALUYa2wURXh6ba9P7IMWSCltKUVBwh3GaNBiYq1Urhxw9tpi" +
       "q3jO7c61W/Z2193Z\n64FKNCaASEiMoJgoGGPEGEwIRP2h8RHfr0SJgn8gKs" +
       "aY+Ij+MBKj0W9mdu+xt23xh01mOjvzveZ7\nzx3/GVVaJuoydHXHhKrTEN1h" +
       "ECsUw6ZF5H4VW9YwbCSk65f9Nf3JnsHF5ahhHDUoWpxiqkj9ukZJ\nlo6j+j" +
       "RJJ4lp9ckykcdRk0aIHCemglVlJwDq2jhqtpQJDVPbJNYQsXQ1wwCbLdsgJu" +
       "fpbkZRvaRr\nFjVtieqmRVFjdApncNimihqOKhbtjaJgSiGqbN2NdqGyKKpM" +
       "qXgCABdE3VuEOcXwANsH8FoFxDRT\nWCIuSsV2RZMp6vRi5G7csxEAALUqTe" +
       "iknmNVoWHYQM1CJBVrE+E4NRVtAkArdRu4UNQ2I1EAqjaw\ntB1PkARFi7xw" +
       "MXEEUDVcLQyFolYvGKeUNVGbx2YF1toSrP97X+yPrgCXWSaSyuSvBKQOD9IQ" +
       "SRGT\naBIRiBft0MHImN0eQAiAWz3AAqZv+Ssj0R/e6BQwi31gtiSniEQT0l" +
       "/Xti853fddTTkTo9rQLYW5\nQtHNuVVjzklv1gBfXJCjyA5D7uGbQ++N3f8C" +
       "+TGAqiMoKOmqndYiqIZocr+zroJ1VNGI2N2SSlmE\nRlCFyreCOv8GdaQUlT" +
       "B1VMDawHSSr7MGQqgKRhmMY0j8zWcTRdX9qm7LIWuKomWUWNQKW6YUppPE\n" +
       "UmApEQ2bin512IXKMoLzpsvK4C7t3rhSwQk36KpMzIR07MJH967f+NDeQM6z" +
       "HFHAlQX1UI56iFNH\nZWWc7MJiFTGdyyw0fjrZ23hgtfVyAJWPoxolnbYpTq" +
       "oEQgqrqj5N5ATlPtVU4L/cbcDn6pPgfuDJ\nCRUIcXcHnWRM1O11s3xwRmCF" +
       "wXdO7/rns18S06eYRzALtjDqQjSwx3YhW/3K+LbBu/Z2lzOg6Qqm\nagDtmZ" +
       "t6Qvpl36ZTZz4+tyLvzhT1lERZKSaLEq/4MVOXiAxZKE/+8T83/Ppo5XUvBZ" +
       "hL1EDyoRhc\nBiK5w8ujKFp63czDlBWIorqUbqaxyo7cdFFLJ019Or/DXaOO" +
       "ry8DBdTAAHWg5xx/I2xih41sahKO\nxPTpuQPPaxcfDK45+1rdu4HCFNhQkC" +
       "vjhIqAasqbY9gkBPbPHY49eujnPbdzWzjGoCho2ElVkbJc\nvtYysP18n+AO" +
       "LWo5+NjKJ8+6xp6fp95nmngHs3X2gdNLnngfPwWBDwFoKTsJj6+ynNm9aShm" +
       "KmmI\n8oyThh7pePb7UxeGWgIFuXpZSbosxBH5mmus1sgCh6WzceDQ76xaen" +
       "zX0PmkyGPNxSG1XrPT1xz9\niqy8sV7yic9yqCiunth8JV+vKrgj+26mjnYU" +
       "PRTZsj4rEYNlMi5ll4POQsybJQZYdXP9M5285/e3\nj9R2CX0znDbOYp6PGo" +
       "sQE9LO10eOXPyUnucXyDs2o9GZLWU7igtibu2ZTFPwxNF0AFWNo0ZekbFG\n" +
       "R7FqMwcah5pq9TubUTSv6Ly4Popi0JsL3HavHQvYekMqr3RYM2i2rvJE0QIY" +
       "l8NocaKoxRNFPGOK\nGGAChSLQDEwQs/nbp5/944E9awPMRyszTHDQSWMebr" +
       "PNWprdxw8tqTv49cNc/cyyjOiNnHk3n5eL\n+CmnILqiYV5pr4BgsniHlKWo" +
       "Kj7S378+HmcHYRHSbF5XdIEVMFqdC7SWXoAtbnK3B324s/UtnDWb\nNgDbmp" +
       "HNczGuhbHaEQC5/wsZI4MtYqX8IFtUGaaSwaz9Q9UyhjqDLeJ6/bx8TtiEjQ" +
       "LWBlyGf99W\nSjOQu8MwE99IGHhHmmjUJdpqTYVMW6NKmoTig5DHqQ5dgB/x" +
       "O+ciXm0kpqEiEl7n7vAjkZyLRIWR\nyBgzoqcuBX16RvSpS0G3veg5u4Kvoh" +
       "tgxB27xv3tqpVyQUA7YEmuygsqR1zCmpM7/NyoG8aww27Y\nnx2Xdwj6eceu" +
       "iUndopshwF1uBbEnmuqZmC2GMeIwG/FnttNhVu8yM3STzhoIS2GMOkRH/Yne" +
       "5xBt\nEM6TuwDbzs5Etw3GVofuVn+69zt06xy6xbJyyj1OtcgXmzbHYJDcls" +
       "z0EuB1bs9tv9Xvxu9sYxmM\nIV4FwUV1Y7VKMkTNFyEvkU384eNm5oatnd8M" +
       "XHvsPm8VYo/HzlkxE1JTZvGt5ZPKB9CV5qpAycur\nGKm3OPfXmgQejtpwUQ" +
       "XoyKm50UmgCx01L/Tto/xDysmXs9by0rcW73REr3KyvOe3wKsLenj3WMGy\n" +
       "IBfR+0gtfYMWPS25jDW5GzGn6ZrjRlnfnmMdmx5zPevwbInkCgj2oEq0CfEG" +
       "4t52KE81IMCLOxke\nnfAW0Qh7WLhnLW6Xk3vzw6G/fPuFfJxXgWN7NI9c55" +
       "7tkH0/A2VXYuL4JBHReWTnJnIAEmoaWiN+\nuNoQCGtgM6Mrwj77i0K6A8aA" +
       "Y5kBP1/j8TybS3H7zS3YCbgdlFmNZ4MXfSTpgxFxJIn8N0kCeW/I\nXqI4r4" +
       "B6FSuBbXidQh2WoPrLXp1VJXVdJVjzEbYdRswRNvbfhL1kf3gLsig0oxoYfl" +
       "i/+aaZ9LYc\nxpgjytj/JMoHEBcWZHP2riaaDHqTZZNYHPZFCL1K/qRnT6hF" +
       "Jb++id+IpO7Td61422j6UOQW93ec\nYBRVp2xVLWyOC9ZBwyQphYsQFK2ywf" +
       "99Dtbz/qwApSC35oJ9JmC/gMwgYNnXlzyXPJ/9F9o5QrUt\nFAAA");
}
