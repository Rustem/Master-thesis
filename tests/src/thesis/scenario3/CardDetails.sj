package thesis.scenario3;
import java.io.Serializable;

public class CardDetails implements Serializable{
    private String cardNumber;

    CardDetails(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public static CardDetails create(String cn) {
        return new CardDetails(cn);
    }
}