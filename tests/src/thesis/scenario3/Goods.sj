package thesis.scenario3;
import java.util.*;
import java.io.Serializable;

public class Goods implements Serializable {
    public LinkedList lst = new LinkedList();

    public Goods(LinkedList lst) {
        this.lst = lst;
    }
}