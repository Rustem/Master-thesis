package thesis.scenario3;

import sj.runtime.*;
import sj.runtime.net.*;
import java.util.*;
import java.io.*;

public class WalletBackend
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
          1369290290000L;
        final public static String
          jlc$ClassType$jl =
          ("H4sIAAAAAAAAAIVXW2wUVRg+u223FxZ7BZpS2lJKpCK7JioWFpWlbmXLtl27" +
           "W5BVXE5nznannZ0Z\nZs60y0XEmAjyYGLAW6LwYkJieDAS9cWoCXjXxPQBfI" +
           "HEYIyJQvTBSAxG/3NmZi/TbWlyTs+e89/O\n/3///585fwPVGDrq0VT54JSs" +
           "0gA9qBEjEMe6QcRBGRtGEjbSwtZ1t+e+Oz68ugo1plCjpCQoppIw\nqCqU5G" +
           "kK+XMkN0l0IyyKREyhZoUQMUF0CcvSISBUlRRqMaQpBVNTJ8Y4MVR5lhG2GK" +
           "ZGdK7T2Ywh\nv6AqBtVNgaq6QVFTbBrP4qBJJTkYkwwaiiFfRiKyaBxAR5En" +
           "hmoyMp4CwpUx5xZBLjE4xPaBvEEC\nM/UMFojDUj0jKSJF3W6Owo37dgEBsN" +
           "bmCM2qBVXVCoYN1GKZJGNlKpiguqRMAWmNaoIWijoWFQpE\ndRoWZvAUSVPU" +
           "7qaLW0dAVc/dwlgoWuEm45LyOupwxawkWmM+/78n43/3eLnNIhFkZn8NMHW5" +
           "mMZJ\nhuhEEYjFeMsMnI7uNTu9CAHxChexRRNe/9FE7NdPuy2a1RVoxianiU" +
           "DTwu3NnWvmwz/XVzEz6jTV\nkBgUym7Ooxq3T0J5DbC4siCRHQacw8/Gv9h7" +
           "7F3ymxfVRZFPUGUzp0RRPVHEQXtdC+uYpBBrdyyT\nMQiNomqZb/lU/hvckZ" +
           "FkwtxRDWsN0yxf5zWEkB9GDYw0sv4eYhMAcA+WZUJ3QHhAbsCYpmgjJQY1\n" +
           "goYuBGmWGBIsBaJgXVLvD7qp80zB8jmPB+7W6c4zGUC5U5VFoqeFc9e/ORLZ" +
           "9dIJbwFptmkUPWJp\nCRS0BMq09Fm/xomQxfoUSepYMbDAvJbM6gSLyOPh6l" +
           "eVu5bFSmQp9fv7oaaXNxkfelFVCtVLuZxJ\n8aRMIBVBrjpHxDTlWGwuwT2H" +
           "G2DVPwk2QAakZRDE0wR8OaujXjc8i0kdhRUGzM0f/e+Hm+m5CwxJ\nLPJtTL" +
           "plGsRxxrLN35/YN7z/RG8VI5qrhoiwm/TdWXpauHly5MLlb69uKKYBRX0Lsn" +
           "MhJ8sut/lx\nXRWICNWrKP71f3b+capmywdeBqV6KFoUA9SgAnS5dZRlWcip" +
           "WMxZ3hhallH1HJbZkVNmGmhWV+eK\nOxxCy/j6LnBAHYx6GI/aOH2YTeywiU" +
           "3NFuCYP1134PXw1gu++658vOxzb2npbCypsQlCrURsLoYj\nqRMC+1ffiJ96" +
           "9cbxp3gsrGCgPDdrhQdC3lqhFgTa206/1v/WFSfGrUWhYV3HB1mI88/Pr3nz" +
           "S/w2\n1AnIV0M6RHg6euxoM/ktkIack2EvYNVcRzOb+/n6HmaQbRb73WOTMD" +
           "y6U2+ItRAnmLnJw39dPNPQ\nY1nJeDq4GNYb3SWzjDEtHPpk4syt7+k17s8i" +
           "CpiM7vxCtbtxCUAHLs82+947m/Oi2hRq4m0PK3Q3\nlk3m7RQ0LmPQ3oyh5W" +
           "Xn5U3IqrihAso73QgsUevGX7HSwJpRs3VtBci1wRiwITfggpwHaWwxwKY+\n" +
           "iqpNw3LBvRYW2fxAmbC7YWyxhW2pLCxkC6uf49UtKhoOFFa5C8VObGRHsLaY" +
           "sj4YW21lWysr224r\na90TjsUiyfREIjI+OpYcGpsYfawCCOK6lIO2NGv3zV" +
           "e63vnlwvXxNm/J42Ldgv5eymM9MLiXG7Q8\naFi7lAZOfWnj2vNHx69NWo23" +
           "pbyWRxQz9+DZH0n/dr9QoYFUwRNoqVCEbO+EKntn2PbOSts78fDe\nkchoMj" +
           "oaHkxGd0fYaWQx8R0wttnit1UWP+JE2hY/tqso0UrhXj6vtxsARbWaLs1ieH" +
           "zaCV6sAR1O\nWdLRmsVeSNydx5/80/8ivrTPaxeLxyny2c/YQtFwSxjhr0En" +
           "kxr3dP80tPncs+6q4QXd3UtypoXm\n2dVPVGWlr6DlFrJ2wXO0nClUnqsNOo" +
           "HXtJIsy9iugusbYWyCEbZdH67YJCr51qeZk7IkVC6vrqK8\nypgO6KZCpRwJ" +
           "KIQGEsMJFZ4ktDKz13aPzdxTrOg8NKMqHVJNRYzkBaKx14tD2F6iJTEcHSsQ" +
           "8Fs8\nA/CGU048qFmah6AGzaqS9XB/uuCUJhg7YKRsp6QqOYVN8aXsL4Azcu" +
           "cWdIDCxxGeIWkNH8wRKwkj\neYj1HZ5sztW7ln75AdLaF3y7WV8YQu/8/g0X" +
           "teav+fuk8BXgg6d4xpTl0qpfsvZpOslI3HSf1QM0\n/u8INGC3KZCwhTW397" +
           "BF+xxgyKJlv45pzl1ay8Jo3TP/Pwej312CDgAA");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369290290000L;
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
       "pGWDoiMLYwnePjsoUQaoUnBA9G4i/KXgDAPVjTCN0K5QG7SWeeog2UONRJ\n" +
       "ObaconPEUWEoEwPbqvlQKihdZg4WlUIh2FtvsM80AOU2U1OInZPPXv/m2bHt" +
       "Lx+TKkjzQqOoT3hJ\nVrwk67ygUIibv78+dawWCmuZ388Pd72y0flAQuEsiq" +
       "m67lKc1wi0GlgxS0TJUY61RA2uOZwAi/E8\n+ACE5zQwxNsAclW00WAQftWm" +
       "nYARBkwtHPn3h5u50gWGFFbZJcy6CA3qdEDEFl83s29y/7HBMBMq\nRVgJQH" +
       "To/63n5JvHd1y4/O3VtVWYUzTU0H2Nmqx7guFnbFMmCrBT1fzrf2/740TLI+" +
       "9LDCoxICWK\nAUrQ4X1BH3VdNOwzEkuWlEYdBdPWscaWfBppp3O2WarOcIh0" +
       "8PF9kIAOeFrg2ezhsJe92GIXeyUE\noFg+A3vgfHf7xeimKx93fC7VUmNnDY" +
       "fOECoaLVEtx06bEJi/+kbmxGs3jj7Na+EVg6Ko5eY1VS7z\n+HpCUPvFTZo+" +
       "uWzJyVPr3rriF3tx1fqIbeNDrNblFxZWvvklfhsIARrTUQ8T3nehStmD9JSx" +
       "VR26\nv+jR06t97/xy4fr0EqmGw1c30GitjuBxnrF2qwweVt3LA5e+tGHVuS" +
       "PT1/KC37rrW2rMcPXNZ34k\n6x6Py036NAwnjZ8n9l7PxxtgdxLfo8S/uyka" +
       "4NlhjSZ4+wmTjpuuoYyVZWIxuvMFRRpVMzkxVVnj\n2xnw/LBeDNLKODsefS" +
       "Dr+Wf+vHi6fUAUhuks92JpzHedYk4+/Mmu07e/p9f4TqsdwGz0lxvd7sY1\n" +
       "zfnw5WIi+t4ZXUKtWdTFj3Rs0N1YcxnSsnAoO6PeZBotqluvP2DFaTJc6fDe" +
       "YMFr3AZ7r1odGDNp\nNm4V7WaVQyGLjbZy6UH+XiNQL1GwoxoY3LVatlrE7J" +
       "oDR1iuxGnXL06PM5+0XYOqOknOTAKFUBMO\nJtGe7P1YxcdkEx9sPMZe42A7" +
       "AraL7GMbV+chDnkVriJJVA4xIK+82/HPQXz0qVvxl/ClfazoTPFB\nimLUtD" +
       "ZqpEi0KnCCRnbw246fzc49/T+Nbzn7XBA5rFP776mZkxPFFU+G59Sv4MipVK" +
       "7hulWvNFxf\nr3abwG3R2FlXtb4KSXbDsx6eNo8k25qSZPOsPwCk5vAbbPNm" +
       "rRJS8JLFqUyQ0fnw0C3po6VD/HiI\n5LEjwgzeThsvn3V3Sh5nrLIrRvWD99" +
       "iVj7yuKn+IC6hlWc33gjzIsO+9gDMdWpgvbvQUNsFk0VQV\nAOGiulsFY/Fl" +
       "Df8YiOurPLiwf+1FK/G12L1/xYzCPa/galpt29WMo5ZNCioPJeo3IfvRYUPB" +
       "Gw4A\ntjLmcWpCFlg2KmTZ10GrSUYEY5T/Ax2yMPvcDAAA");
}
