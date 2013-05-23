package thesis.scenario3;
import sj.runtime.*;
import sj.runtime.net.*;
import java.util.*;
import java.io.*;
public class WalletBackend {

    public static void main(String []argv) {
        try {
            new WalletBackend(Integer.parseInt(argv[0]));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private protocol p_wallet {
      !<String>.?(Integer).?(Integer).!{
          PAYMENT_INACTIVE: !<OSMPMessage>,
          USER_NOT_FOUND: !<OSMPMessage>,
          OK: !<OSMPMessage>
      }
    }

    private protocol p_wv {
        begin.?(String).?( @p_wallet )
    }

    public WalletBackend(int portNumber) throws ClassNotFoundException, IOException{
        String username = "";
        SJServerSocket ss_wv = null;
        try {
            ss_wv = SJRServerSocket.create(p_wv, portNumber);
            SJSocket s_wv = null;
            SJSocket s_wu = null;

            try(s_wv, s_wu) {

                s_wv = ss_wv.accept();
                username = s_wv.receive();
                s_wu = (@p_wallet) s_wv.receive();
                System.out.println("session accepted " + s_wu.toString());
                // Need a session type parallel construct
                <s_wu>.spawn(new WalletRechargeTransactionThread(username));
            } catch (SJIOException ioe) {
                ioe.printStackTrace();
            } catch(SJIncompatibleSessionException stise) {
                stise.printStackTrace();
            }
        } finally {
            if(ss_wv != null)
                ss_wv.close();
        }
    }

    private class WalletRechargeTransactionThread extends SJThread {
        String user;
        LinkedHashMap walletIds = null;
        int WALLET_USERNOTFOUND = 2;
        int WALLET_PAYMENTINACTIVE = 0;
        int WALLET_OK = 1;
        WalletRechargeTransactionThread(String username) {
            this.user = username;
        }

        public void run(@p_wallet s_wu) throws ClassNotFoundException, SJIOException{
            System.out.println("Thread invoked");
            s_wu.send("Start");
            Integer txn_number = (Integer) s_wu.receive();
            System.out.println("received data");
            Integer walletNumber = (Integer) s_wu.receive();
            System.out.println("received data");
            System.out.println(
                "Accepted txn: " + txn_number + " and walletNum: " + walletNumber);
            int result = this.make_payment(
                txn_number.intValue(), walletNumber.intValue());
            if(result == WALLET_USERNOTFOUND) {
                s_wu.outbranch(USER_NOT_FOUND) {
                    s_wu.send(new OSMPMessage(
                        WALLET_USERNOTFOUND, "User not found."));
                }
            } else if(result == WALLET_PAYMENTINACTIVE) {
                s_wu.outbranch(PAYMENT_INACTIVE) {
                    s_wu.send(new OSMPMessage(
                        WALLET_PAYMENTINACTIVE, "Payment inactive."));
                }
            } else {
                s_wu.outbranch(OK) {
                    s_wu.send(new OSMPMessage(
                        WALLET_OK, "Wallet recharged."));
                }
            }

        }

        private int make_payment(int txn_number, int walletNumber) {
            if(txn_number > 100) return WALLET_USERNOTFOUND;
            else if(txn_number < 0) return WALLET_PAYMENTINACTIVE;
            else return WALLET_OK;
        }
    } 

}