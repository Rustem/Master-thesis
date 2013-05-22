package thesis.scenario3;
import sj.runtime.*;
import sj.runtime.net.*;

public class WalletBackend {

    public static void main(String []argv) {


    }

    private protocol p_wallet {
      ?<Integer>.?<Integer>.!{
          PAYMENT_INACTIVE: !<OSMPMessage>,
          USER_NOT_FOUND: !<OSMPMessage>,
          OK: !<OSMPMessage>
      }
    }

    private protocol p_pv {
        begin.?< @p_wallet >
    }

    public WalletBackend(int portNumber) {
        
    }

}