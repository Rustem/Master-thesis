package thesis.scenario3;

import sj.runtime.*;
import sj.runtime.net.*;
import java.util.*;
import java.io.*;

public class WalletBackend
{
    final private java.lang.String
      _sjprotocol_p_wv =
      ("H4sIAAAAAAAAAIVSMW/TQBR+cQhNAdHQqlURQYgBdQDZSEgsHSBAoqZ14qhO" +
       "kJjM5XKyHbnn4+5a\nXAkxwy9hYWdEiI0NRlYYWPgHDJzvEheiSLbke2e/77" +
       "3v+97d+99QExzuiKktTxkRek3HU4KlsAUR\nwvz19x+RMKZD9RFgME/FAsg4" +
       "7JSWLlZZLtRwFCcTCTuumDoa5/xT7RTVjqnedeE8Q5xQ+QJeg6VY\nN1manI" +
       "ZJKmfchqN168PI/fXxhlF2bQnG0wwB/nO/ef1b6+dqFSou1FkqYhmnVMK2Oy" +
       "9yjmWcOINZ\nZjdjLFODskvdHhJM4hOyaFrRXDxSMBTqlITNMyZjVRvNcoMV" +
       "RZXHFaZY57sicrhbKsI7lmOOKI6W\nyKhhpKASNtwpOkHG5h4SUQ+xgl7Rcr" +
       "iS5+08b8/ytZXvnz5vPf9aBasDF5IUTToIy5R3YVVGnIgo\nTSYZe/BQs116" +
       "WVdrQ71V1WxNadat/H0XjUnyn6RqgsYS1o2gBNHQ8SWPaaimLuHyyG8fBn1v" +
       "GHS8\nUf+J6nW71L9P6KTkBHKn9cJvHtdU6+bCnRkkCJM9ZYvwAL/78eVV++" +
       "DtG93rHEVHuslGLrIpIyJi\nJQITinic3rM9vzfoGTp9dOsSLO9Ab7fmhPly" +
       "dZ5tDFrPeu3+MOj2W4+H3aftJdjMXIdtOTucfFZ2\nl0oSEq5hNwtA4wxghs" +
       "n+AqrKJ6/sAwAA");
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
    
    public static void
      main(
      String[] argv) {
        
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
          session_wu =
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
                                        sj.runtime.net.SJSocket session_wu) {
            super();
            this.
              user =
              username;
            this.
              session_wu =
              session_wu;
        }
        
        final public java.lang.String
          _sjformal_run_session_wu =
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
        
        public void
          run(
          ) {
            {
                sj.runtime.net.SJSocket _sjtryreturned_1 =
                  null;
                int _sjspawncount_session_wu =
                  -1;
                try {
                    int txn_number =
                      (Integer)
                        session_wu.
                          receive();
                    int walletNumber =
                      (Integer)
                        session_wu.
                          receive();
                    int result =
                      this.
                        make_payment(
                        txn_number,
                        walletNumber);
                    if (result ==
                          WALLET_USERNOTFOUND) {
                        {
                            session_wu.
                              outlabel(
                              "USER_NOT_FOUND");
                            session_wu.
                              send(
                              new OSMPMessage(
                                WALLET_USERNOTFOUND,
                                "User not found."));
                        }
                    } else
                              if (result ==
                                    WALLET_PAYMENTINACTIVE) {
                                  {
                                      session_wu.
                                        outlabel(
                                        "PAYMENT_INACTIVE");
                                      session_wu.
                                        send(
                                        new OSMPMessage(
                                          WALLET_PAYMENTINACTIVE,
                                          "Payment inactive."));
                                  }
                              } else {
                                  {
                                      session_wu.
                                        outlabel(
                                        "OK");
                                      session_wu.
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
                    if (session_wu !=
                          null &&
                          session_wu !=
                          _sjtryreturned_1)
                        session_wu.
                          close(
                          _sjspawncount_session_wu);
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
          1369252818000L;
        final public static String
          jlc$ClassType$jl =
          ("H4sIAAAAAAAAAIVXW2wUVRg+u223FxZ749KU0pZSIhXZNQFKcYOh1K1s2bZr" +
           "dwu2isvpzNnutLMz\nw8yZ7RYQNSaCPJgY8JYovJiQGB6MRH0xagLeNTF9AF" +
           "8gMRhjohB9MBKD0f+cmdnLdFuanNOz5/y3\n8//f//9nLt5CVYaOOjVVnp+W" +
           "VRqg8xoxAjGsG0QckLFhJGAjKTy88e7cdyeH1lWg+klULylxiqkk\nDKgKJT" +
           "k6ifwZkpkiutEvikScRI0KIWKc6BKWpaNAqCqTqMmQphVMTZ0YY8RQ5SwjbD" +
           "JMjehcp7MZ\nRX5BVQyqmwJVdYOihugMzuKgSSU5GJUMGooiX0oismgcQSeQ" +
           "J4qqUjKeBsI1UecWQS4xOMj2gbxO\nAjP1FBaIw1I5KykiRR1ujvyNu/cDAb" +
           "BWZwhNq3lVlQqGDdRkmSRjZToYp7qkTANplWqCFopalxQK\nRDUaFmbxNElS" +
           "1OKmi1lHQFXL3cJYKFrtJuOScjpqdcWsKFqjPv+/p2N/d3q5zSIRZGZ/FTC1" +
           "u5jG\nSIroRBGIxXjHDJyNTJhtXoSAeLWL2KLp3/TRePTXTzssmnVlaEanZo" +
           "hAk8Ld3rb1C/0/11YwM2o0\n1ZAYFEpuzqMas09COQ2wuCYvkR0GnMPPxr6Y" +
           "eO5d8psX1USQT1BlM6NEUC1RxAF7XQ3rqKQQa3c0\nlTIIjaBKmW/5VP4b3J" +
           "GSZMLcUQlrDdM0X+c0hJAfRhWMCWT9bWMTAPAglmVC90J4QG7AmKFoCyUG\n" +
           "NYKGLgRpmhgSLAWiYF1StwXd1DmmYOWcxwN3a3PnmQyg3KfKItGTwoWb3xwP" +
           "73/plDePNNs0ih6x\ntATyWgIlWrqtX2NESGN9miR0rBhYYF5LpHWCReTxcP" +
           "VrS13LYiWylPr9/VDDy1uND72oYhLVSpmM\nSfGUTCAVQa46R8Qk5VhsLMI9" +
           "hxtg1T8FNkAGJGUQxNMEfJnVUZcbnoWkjsAKA+YWTvz3w+3k3CWG\nJBb5VU" +
           "y6ZRrEcdayzd8TPzR0+FRXBSOaq4SIsJt031t6Urh9evjS1W+vby6kAUXdi7" +
           "JzMSfLLrf5\nMV0ViAjVqyD+9X/2/XGmatcHXgalWihaFAPUoAK0u3WUZFnI" +
           "qVjMWd4oWpFS9QyW2ZFTZupoWlfn\nCjscQiv4+j5wQA2MWhghG6e72MQOG9" +
           "jUaAGO+dN1B14P77zge+jaxys+9xaXzvqiGhsn1ErExkI4\nEjohsH/9jdiZ" +
           "V2+dfJLHwgoGynGzVnsg5M1lakGgZdXZ13reuubEuLkgtF/X8TwLce75hfVv" +
           "fonf\nhjoB+WpIRwlPR48dbSa/CdKQczLsBaya62hmcw9fP8AMss1ivzttEo" +
           "ZHd+oNshbiBDMzdeyvy+fq\nOi0rGU8rF8N6o7tkljAmhaOfjJ+78z29wf1Z" +
           "QAGT0ZFbrPYALgJo39Vso++98xkvqp5EDbztYYUe\nwLLJvD0JjcsYsDejaG" +
           "XJeWkTsipuKI/yNjcCi9S68VeoNLBm1GxdXQZyq2BstyG33QU5D9LYoo9N\n" +
           "3RRVmoblggctLLJ5e4mw+2HssIXtKC8sZAurnePVLSIaDhTWugvFPmykh7G2" +
           "lLJuGL22st7yyvbY\nypoP9kej4URyPB4eGxlNDI6OjzxaBgQxXcpAW8raff" +
           "OV9nd+uXRzbJW36HGxcVF/L+axHhjcy3Va\nDjRsWE4Dp76yZcPFE2M3pqzG" +
           "21Ray8OKmdlx/kfSs8cvlGkgFfAEWi4UO23v7CzvnSHbO2ts78T6\nJ4bDI4" +
           "nISP9AInIgzE7DS4lvhdFni+8rL37YibQtfnR/QaKVwl183mQ3AIqqNV3KYn" +
           "h82gleqAGt\nTlnS0fqlXkjcnSef+NP/Ir5yyGsXi8co8tnP2HzRcEsY5q9B" +
           "J5PqD3b8NNh74Rl31fCC7o5lOZNC\nY3bd4xVp6StoufmsXfQcLWUKleZqnU" +
           "7gNa0kSjK2Pe/6ehhbYey2Xb+7bJMo51ufZk7JklC+vLqK\n8lpjJqCbCpUy" +
           "JKAQGogPxVV4ktDyzF7bPTZzZ6Gi89CMqHRQNRUxnBOIxl4vDmFLkZb4UGQ0" +
           "T8Bv\n8TTAG0458YBmaR6EGpRVJevh/lTeKQ0w9sJI2E5JlHMKm2LL2Z8HZ/" +
           "jeLegIhY8jPEuSGp7PECsJ\nwzmI9T2ebM7V25d/+QHSWhZ9u1lfGELXwuHN" +
           "l7XGr/n7JP8V4IOneMqU5eKqX7T2aTpJSdx0n9UD\nNP7vODRgtymQsPk1t/" +
           "eYRfssYMiiZb+e05y7NJeE0bpn7n+AaAokgg4AAA==");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369252818000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVXW2wUVRg+O7vddtvFdgtFhNKWUiKXsAsxErWJsTRtaFns" +
       "2nKRJWQ5O3O2nTI3\nZs7sLqhEYyLIg4nBa6LwYkJieDAQ9UGjJuBdE9MH8A" +
       "USgzEmCpEHIzEY/c85O7O7sws2mdkz5/y3\n8//f/53Ts9dRi2OjAcvUDs9q" +
       "Jk3SwxZxkhlsO0QZ1bDj7ISJnPzI6tul745NrgijzizqVI0Ziqkq\nj5oGJW" +
       "WaRXGd6HliOyOKQpQsShiEKDPEVrGmHgFB08iibkedNTB1beJME8fUikyw23" +
       "EtYnOf3mQa\nxWXTcKjtytS0HYq60vO4iFMuVbVUWnXocBpFCyrRFOcQOopC" +
       "adRS0PAsCC5Ne7tIcYupcTYP4u0q\nhGkXsEw8lchB1VAo6g9q+Dse2g4CoN" +
       "qqEzpn+q4iBoYJ1C1C0rAxm5qhtmrMgmiL6YIXipbf0SgI\ntVlYPohnSY6i" +
       "ZUG5jFgCqRhPC1OhqCcoxi2VbbQ8ULOaak1F4/+cyPw1IPGYFSJrLP4WUOoL" +
       "KE2T\nArGJIROheMtNvjKx1+2VEALhnoCwkBlZ8+Gu9K+f9guZFU1kpvLzRK" +
       "Y5+faW3pULIz/HwiyMNst0\nVAaFup3zqmYqK8NlC7C41LfIFpPe4mfTX+x9" +
       "9l3ym4TaJlBUNjVXNyZQjBjKaGXcCuO0ahAxO1Uo\nOIROoIjGp6Im/4Z0FF" +
       "SNsHREYGxhOsfHZQsh1ApPCJ59SPxF2QsAuAdrGqFboTxgN+nMU7SBEoc6\n" +
       "KceWU3SOOCoMZWJgWzUfSAWly8zBolIoBHvrDfaZBqDcZmoKsXPymWvfPD22" +
       "/cXjko+0SmgU9Qkv\nSd9Lss4LCoW4+XvrU8dqobCW+f3ccNdLG50PJBTOop" +
       "iq6y7FeY1Aq4EVs0SUHOVYS9TgmsMJsBjP\ngw9AeE4DQ7wNIFdFGw0G4Vdt" +
       "2gkYYcDUwtF/f7iRK51nSGGVXcKsi9CgTgdFbPF1M/snDxwfDDOh\nUoSVAE" +
       "SH/t96Tr5xYsf5S99eWVuFOUVDDd3XqMm6Jxh+xjZlogA7Vc2//ve2P062PP" +
       "y+xKASA1Ki\nGKAEHd4X9FHXRcMeI7FkSWnUUTBtHWtsyaORdjpnm6XqDIdI" +
       "Bx/fAwnogKcFns0VHN7HXmyxi70S\nAlAsn4E9cL679Xx00+WPOz6Xaqmxs4" +
       "ZDZwgVjZaolmOnTQjMX3kjc/LV68f28VpUikFR1HLzmiqX\neXw9Iaj94iZN" +
       "n1y25JXX1r112Sv24qr1EdvGh1mty88trHzzS/w2EAI0pqMeIbzvQn7Zg/SU" +
       "sVUd\nur9YoaeX+9755fy16SVSDYevbqDRWh3B4zxj7VYZPKy6mwcufXHDqr" +
       "NHp6/mBb9117fUmOHqD57+\nkax7LC436dMwnDRenth7PR9vgN1JfI8S/+6m" +
       "aIBnhzWa4O3HTTpuuoYyVpaJxejOExRpVM3kxJS/\nxrczUPHDejFIK+PseP" +
       "SArOef+vPCqfYBURims7wSS2O+6xRz8pFPdp269T29ynda7QBmo7/c6HY3\n" +
       "rmnOhy4VE9H3TusSas2iLn6kY4PuxprLkJaFQ9kZrUym0aK69foDVpwmw36H" +
       "9wYLXuM22HvV6sCY\nSbNxq2g3qxwKWWy0lUsP8vcagXqJgh3VwOCu1bLVIm" +
       "bXHDjCciVOu15xepz5pO0aVNVJcmYSKISa\ncDCJ9mTvR30fk018sPEYe42D" +
       "7QjYLrKPbVydhzhUqXAVSaJyiAF55Z2Ofw7iY0/ejL+AL+5nRWeK\nmymKUd" +
       "PaqJEi0arACRrZwW87XjY79/T/NL7lzDNB5LBO7b+rZk5OFFc8EZ5Tv4Ijx6" +
       "9cw3WrXmm4\nvl7tNoHborGzrmp9Pkl2w7MenrYKSbY1JcnmWb8fSM3hN9jm" +
       "zVolpOAli1OZIKNz4aGb0kdLh/jx\nEMljR4QZvJ02Xj7r7pQ8zpi/q154Bu" +
       "+yKw95XVX+EBdQy7Ka7wVVIMO+9wLOdGhhvrixorAJJoum\nqgAIF9XdKhiL" +
       "L2v4x0BcX+XBhQNrL1iJr8XuvStmFO55BVfTatuuZhy1bFJQeShRrwnZjw4b" +
       "Ct5w\nALD+mMepCVlg2aiQZV+HrCYZEYxR/g9HfQUJ3AwAAA==");
}
