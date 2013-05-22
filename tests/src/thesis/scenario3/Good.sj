package thesis.scenario3;

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;
public class Good implements Serializable { 
    public String productName;
    public int productPrice;
    public Date fromDate;
    public Date toDate;

    public Good() {}
    public Good(String productName, int productPrice, int period) {
        this.productName = productName;
        this.productPrice = productPrice;
        this._setDates();
    }
    private void _setDates(int period) {
        Calendar future = Calendar.getInstance().add(Calendar.MONTH, period);
        this.fromDate = new Date();
        this.toDate = future.getTime();
    }

}