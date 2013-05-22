package thesis.scenario3;
import sj.runtime.*;
import sj.runtime.net.*;

public class PaymentBackend {

    public static void main(String []argv) {


    }

    private protocol p_payment {
      !<Goods>.?{
          VISA_MASTER: ?<CardDetails>,
          TRANSFER: ?<TransferDetails>
      }.?{
          PAID: !<String>,
          DECLINED: !<String>,
          FAILED: !<String>
      }
    }

    private protocol p_pv {
        begin.?< @p_payment >
    }

    public PaymentBackend(int portNumber) {

    }

}