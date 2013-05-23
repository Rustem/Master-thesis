package thesis.scenario3;
import sj.runtime.*;
import sj.runtime.net.*;
import java.util.*;
import java.io.*;
public class PaymentBackend {

    public static void main(String []argv) throws IOException{
        try {
            new PaymentBackend(Integer.parseInt(argv[0]));
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }

    // private protocol p_payment {
    //     !<Goods>.?{
    //       VISA_MASTER: ?(CardDetails),
    //       TRANSFER: ?(TransferDetails)
    //     }
    // }
    private protocol p_payment {
      !<Goods>.?{
          VISA_MASTER: ?(CardDetails),
          TRANSFER: ?(TransferDetails)
      }.!{
          PAID: !<String>,
          DECLINED: !<String>,
          FAILED: !<String>
      }
    }

    private protocol p_pv {
        begin.?(String).?( @p_payment )
    }

    public PaymentBackend(int portNumber) throws ClassNotFoundException, IOException{
        String username = "";
        SJServerSocket ss_pv = null;
        try {
            ss_pv = SJRServerSocket.create(p_pv, portNumber);
            SJSocket s_pv = null;
            SJSocket s_pu = null;  
            try(s_pv, s_pu) {
                s_pv = ss_pv.accept();
                username = s_pv.receive();
                s_pu = (@p_payment) s_pv.receive();
                <s_pu>.spawn(new PaymentTransactionThread(username));
                // Need a session type parallel construct
                
            } catch (SJIOException ioe) {
                ioe.printStackTrace();
            } catch(SJIncompatibleSessionException stise) {
                stise.printStackTrace();
            }
        } finally {
            if(ss_pv != null) 
                ss_pv.close();
        }
        
        
    }

    private class PaymentTransactionThread extends SJThread {
        private int PAYMENT_PAID = 1;
        private int PAYMENT_DECLINED = 2;
        private int PAYMENT_FAILED = 0;

        private String user;
        public PaymentTransactionThread(String uname) {
            this.user = uname;
        }

        public void run(@p_payment s_pu) throws SJIOException, ClassNotFoundException {
            Goods userGoods = this.getActivePayments(this.user);
            int status = -1;
            Object obj = new Object();
            s_pu.send(userGoods);
            CardDetails cardDetails = null;
            TransferDetails transferDetails = null;
            s_pu.inbranch() {
                case VISA_MASTER: {
                    cardDetails = (CardDetails) s_pu.receive();
                }
                case TRANSFER: {
                    transferDetails = (TransferDetails) s_pu.receive();
                }
            }
            int totalMoney = this._totalForGoods(userGoods);
            if(cardDetails != null || transferDetails != null) {
                if(totalMoney > 0) {
                  status = PAYMENT_PAID;
                } else if(totalMoney == 0) {
                  status = PAYMENT_DECLINED;
                } else {
                  status = PAYMENT_FAILED;
                }
            }
            if(status == PAYMENT_PAID) {
                s_pu.outbranch(PAID) {
                    s_pu.send("PAYMENT SUCCEED. Congratulation");
                }
            } else if(status == PAYMENT_DECLINED) {
                s_pu.outbranch(DECLINED) {
                    s_pu.send(
                        "PAYMENT DECLINED. Payment object is already paid.");
                }
            } else {
                s_pu.outbranch(FAILED) {
                    s_pu.send(
                        "Dear, your request has been declined by bank.");
                }
            }

        }
        // private int finishTransfer(Goods userGoods, TransferDetails td) {
        //     return this.sendTransactionViaProcessing(userGoods, null);
        // }
        private Goods getActivePayments(String user) {
            LinkedList lst = new LinkedList();
            lst.add(new Good("Saas1", 25000, 2));
            lst.add(new Good("Saas2", 50000, 3));
            return new Goods(lst);
        }

        private int _totalForGoods(Goods userGoods) {
            int total = 0;
            for(int i = 0; i<userGoods.lst.size(); i++) {
                Good g = (Good) userGoods.lst.get(i);
                total += g.productPrice;
            }
            return total;
        }
    }

}