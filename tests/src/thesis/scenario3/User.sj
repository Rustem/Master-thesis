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
  public static void main(String []argv) {
    try {
    
      new User(argv[0], Integer.parseInt(argv[1]));
    
    } catch(SJIOException sjioe) {
    
      sjioe.printStackTrace();
    
    }
    
  }
  /*
    
  */
  private static protocol payment {
      ?(Goods).!{
          VISA_MASTER: !<CardDetails>,
          TRANSFER: !<TransferDetails>
      }.?{
          PAID: ?(String),
          DECLINED: ?(String),
          FAILED: ?(String)
      }
  }

  private static protocol wallet {
      ?(String).!<Integer>.!<Integer>.?{
          PAYMENT_INACTIVE: ?(OSMPMessage),
          USER_NOT_FOUND: ?(OSMPMessage),
          OK: ?(OSMPMessage)
      }
  }
  private static protocol p_uv {
      begin.?[
        !<String>.!<String>
      ]*.?{
            ACCESS: !{ 
                PAYMENT: @payment,
                WALLET:  @wallet
            },
            DENY: ?(String)
          }
  }

  private Map buildConnectionRequest() {
      long curTime = new Timestamp((new Date()).getTime()).getTime();
      Map msg = new LinkedHashMap();
      msg.put("action", "CONNECTION");
      msg.put("client_email", "r.kamun@gmail.com");
      msg.put("ts", curTime + "");
      return msg;
  }
  private void print(String s) {
      System.out.println(s);
  }

  private String login;
  private String password;
  private String cardNumber = "1111111111111111";
  private int walletNumber = 78;
  private int txn_number = 172;
  Scanner sc = new Scanner(new InputStreamReader(System.in));

  private int get_operation() {
      Random rnd = new Random();
      return rnd.nextInt(2);
  }

  public User(String hname, int port) throws SJIOException {
      SJServerAddress v3na_addr = SJServerAddress.create(p_uv, hname, port);
      SJSocket s_uv = SJRSocket.create(v3na_addr);

      try(s_uv) {
        s_uv.request();
        // login password
        s_uv.inwhile() {
          System.out.println("Enter your login:");
          this.login = sc.nextLine();
          System.out.println("Enter your password:");
          this.password = sc.nextLine();
          s_uv.send(this.login); s_uv.send(this.password);
        }

        s_uv.inbranch() {
            case ACCESS: {
                int op = this.get_operation();
                if(op == 1) {
                    s_uv.outbranch(PAYMENT) {
                        Goods myGoodsLst = (Goods) s_uv.receive();
                        op = this.get_operation();
                        if(op == 1) {
                            s_uv.outbranch(VISA_MASTER) {
                                CardDetails c = new CardDetails(this.cardNumber);
                                s_uv.send(c);
                            }
                        } else {
                            s_uv.outbranch(TRANSFER) {
                                TransferDetails t = new TransferDetails(
                                    "Kazakhstan, 050000, c. Almaty, str. Zharokov, 167/65");
                                s_uv.send(t);
                            }
                        }
                        String msg = "";
                        s_uv.inbranch() {
                            case PAID: {
                                msg = s_uv.receive();
                            }
                            case DECLINED: {
                                msg = s_uv.receive();
                            }
                            case FAILED: {
                                msg = s_uv.receive();
                            }
                        }
                        print("PAYMENT STATUS: " + msg);
                    }
                } else {
                    s_uv.outbranch(WALLET) {
                        System.out.println("Wallet transaction: " + s_uv.receive());
                        s_uv.send(new Integer(this.txn_number));
                        s_uv.send(new Integer(this.walletNumber));
                        print("User sended data");
                        OSMPMessage msg = null;
                        s_uv.inbranch() {
                            case OK: {
                                msg = (OSMPMessage) s_uv.receive();
                            }
                            case PAYMENT_INACTIVE: {
                                msg = (OSMPMessage) s_uv.receive();
                            }
                            case USER_NOT_FOUND: {
                                msg = (OSMPMessage) s_uv.receive();
                            }
                        }
                        print("WALLET RECHARGE STATUS: " + msg.comment);
                    }
                }      
            }
            case DENY: {
                print((String) s_uv.receive());
            }  
        }
      } catch(SJIOException sjioe) {
          sjioe.printStackTrace();
      } catch(Exception e) {
          e.printStackTrace();
      }
  }
}