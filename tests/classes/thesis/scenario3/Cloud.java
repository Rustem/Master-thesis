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
       "sYMDuX43OWzyJdYTZRON2U\nlCp/uBMXtUHFbo7tctOFFtqjE0KhaX349e2N" +
       "fPD+XbRkHjxFLG2R9bvEx86mIERTSGgKVbmiKpo8\nRsXMVhKTr0mKmhrRv6" +
       "mMQaMLRkvS9JrcouKFiZ1uIQs552nvzHCzGfT6yLzvcroHhH67CDsU1EIe\n" +
       "DB3/iWDQ3cGvUFhFBDouTnQVjxRdMuuSblBp7G5nHGrzGlQFhnYMw9lXktC1" +
       "a6EvfN8ecOWPJVWV\njYRm5LzVLiwc6nLL1BqGWWscaqODKN+st6HXm/WobQ" +
       "lSpnEwms3MbuItxW+FqWhSxVCO5JTYeOSU\ncOlqpxSPoA4KeVOY2esP1rgq" +
       "aycjMMXhzRlqR8C9W8wU+L/gP2t/z5mVBgAA");
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
      1369289563000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALUYa2wURXh6ba9P7IMWSCltKUVAwp3GaNRqYqlUrh5w9loe" +
       "9XHM7c61W/Z2193Z\n64FKJCaAj5AYwEeiYgwJxEBCIMoPjY+Aiq9EiYJ/IL" +
       "5iTHxEfhiI0eg3M7v32Nu2+MMmM52d+V7z\nveeO/IoqLRN1Gbq6dUzVaYhu" +
       "NYgVimHTInK/ii1rGDYS0m2L/pr8dNfg/HLUMIoaFC1OMVWkfl2j\nJEtHUX" +
       "2apJPEtPpkmcijqEkjRI4TU8Gqsg0AdW0UNVvKmIapbRJriFi6mmGAzZZtEJ" +
       "PzdDejqF7S\nNYuatkR106KoMTqBMzhsU0UNRxWL9kZRMKUQVbYeQttRWRRV" +
       "plQ8BoBzou4twpxieIDtA3itAmKa\nKSwRF6Vii6LJFHV6MXI37rkHAAC1Kk" +
       "3ouJ5jVaFh2EDNQiQVa2PhODUVbQxAK3UbuFDUNiVRAKo2\nsLQFj5EERfO8" +
       "cDFxBFA1XC0MhaJWLxinlDVRm8dmBdZaF6z/+8nY5a4Al1kmksrkrwSkDg/S" +
       "EEkR\nk2gSEYhX7NC+yCa7PYAQALd6gAVM3+KTI9Gf3ukUMPN9YNYlJ4hEE9" +
       "JfN7cvONv3Q005E6Pa0C2F\nuULRzblVY85Jb9YAX5yTo8gOQ+7hu0MfbHrs" +
       "NfJzAFVHUFDSVTutRVAN0eR+Z10F66iiEbG7LpWy\nCI2gCpVvBXX+DepIKS" +
       "ph6qiAtYHpOF9nDYRQFYwyGIeR+JvNJoqq+1XdlkPWBEWLKLGoFbZMKUzH\n" +
       "iaXAUiIaNhX9xrALlWUEZ02WlcFd2r1xpYITrtZVmZgJ6dD3Hz+y6p4ndgdy" +
       "nuWIAq4sqIdy1EOc\nOior42TnFquI6VxmofHL8d7GPSusNwKofBTVKOm0TX" +
       "FSJRBSWFX1SSInKPeppgL/5W4DPlefBPcD\nT06oQIi7O+gkY6Jur5vlgzMC" +
       "Kwy+c3b7P5//lpg8wTyCWbCFUReigT22CNnql8UfGNy8u7ucAU1W\nMFUDaM" +
       "/M1BPSb0+uOXHukwtL8+5MUU9JlJVisijxih8zdYnIkIXy5J/7c/XveytvfT" +
       "3AXKIGkg/F\n4DIQyR1eHkXR0utmHqasQBTVpXQzjVV25KaLWjpu6pP5He4a" +
       "dXx9DSigBgaoAx1y/I2wiR02sqlJ\nOBLTp+cOPK9deTx4/fm36t4PFKbAho" +
       "JcGSdUBFRT3hzDJiGwf+H52N79v+66j9vCMQZFQcNOqoqU\n5fK1loHtZ/sE" +
       "d2hey75nl7143jX27Dz1PtPEW5mtszvOLnjhQ/wSBD4EoKVsIzy+ynJm96ah" +
       "mKmk\nIcozThp6puPgjye+H2oJFOTqRSXpshBH5GuusVojCxwWTseBQ59evv" +
       "DI9qGLSZHHmotDapVmp286\n8DVZdme95BOf5VBRXD2x+Tq+Xl5wR/bdTB3t" +
       "KHoosm5VViIGy2Rcyi4HnYWYN0sMsOrm+mc6+fAf\np16u7RL6ZjhtnMUsHz" +
       "UWISakbW+PvHzlM3qRXyDv2IxGZ7aU7XpcEHO3nMs0BY8dSAdQ1Shq5BUZ\n" +
       "a3Q9Vm3mQKNQU61+ZzOKZhWdF9dHUQx6c4Hb7rVjAVtvSOWVDmsGzdZVniia" +
       "A+NaGC1OFLV4oohn\nTBEDTKBQBJqBMWI2f/fKwcs7dt0SYD5amWGCg04a83" +
       "BrbdbS7Dyyf0Hdvm+e4upnlmVE7+TMu/m8\nWMRPOQXRFQ3zSrsEgsniHVKW" +
       "oqr4SH//qnicHYRFSLP59qILLIXR6lygtfQCbLHS3R704c7Wd3PW\nbFoNbG" +
       "tG1s7EuBbGCkcA5P4vZIwMtoiV8oNsUWWYSgaz9g9VyxjqDLaI6/Wz8jlhDT" +
       "YKWBtwGf69\nsZRmIHeHYSa+kTDw1jTRqEu01ZoImbZGlTQJxQchj1MdugA/" +
       "4g/ORLzaSExCRSS8zt3vRyI5E4kK\nI5ExpkRPXQ365JToE1eDbnvRc3YFX0" +
       "V3wIg7do3721Ur5YKAdsCSXJUXVI64hDUnd/i5UTeMYYfd\nsD87Lu8Q9POO" +
       "XRPjukXXQoC73ApiTzTVUzGbD2PEYTbiz2ybw6zeZWboJp02EBbCWO8QXe9P" +
       "9FGH\naINwntwF2HZ2KrptMDY4dDf4033MoVvn0C2WlVPucapFvti0OQaD5L" +
       "ZgqpcAr3O7Nl6q34lPP8Ay\nGEO8AYKL6sYKlWSImi9CXiJr+MPHzcwNGzq/" +
       "Hbj50KPeKsQej53TYiakpsz8e8vHlTPQleaqQMnL\nqxiptzj315oEHo7acF" +
       "EF6MipudFJoHMdNc/17aP8Q8rJl9PW8tK3Fu90RK9yvLznUuDNOT28e6xg\n" +
       "WZCL6H2klr5Bi56WXMaa3I2Y03TNcKOsb89xO5uedT3r+ekSyRII9qBKtDHx" +
       "BuLetj9PNSDAizsZ\nHp3wFtEIe1i4Zy1ul5N788Ohv3xPC/k4rwLH9mgeuc" +
       "493SH7fhXKrsTE8UkiovPIzkxkDyTUNLRG\n/HCFIRCuh82Mrgj7PF0U0h0w" +
       "BhzLDPj5Go/n6VyK229mwY7B7aDMajwbHPWRpA9GxJEk8t8kCeS9\nIXuV4p" +
       "wE9SpWAtvwOoU6LEH1l706q0rqukqw5iNsO4yYI2zsvwl71f7wHmRRaEY1MP" +
       "ywftfKqfS2\nGMYmR5RN/5MoZyAuLMjm7F1NNBn0JssmsTjsUQi9Sv6kZ0+o" +
       "eSW/vonfiKTus5uXnjKaPhK5xf0d\nJxhF1SlbVQub44J10DBJSuEiBEWrbP" +
       "B/X4D1vD8rQCnIrblgnwvYLyEzCFj29RXPJYez/wJNcygz\nLRQAAA==");
}
