import java.util.*;

package thesis.scenario3;

import java.io.Serializable;

public class OSMPMessage implements Serializable {
    public int code;
    public String comment;

    public OSMPMessage() {}
    public OSMPMessage(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }
}