package thesis.scenario3;
import java.io.Serializable;

public class TransferDetails implements Serializable{
    public String details;
    public TransferDetails(String details) {
        this.details = details;
    }
}