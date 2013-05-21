//$ bin/sjc tests/src/thesis/Test.sj -d tests/classes/
//$ bin/sj -cp tests/classes/ thesis.Test
package thesis;

import org.json.simple.JSONValue;
import org.json.simple.parser.*;
import java.util.*;

public class Test {
  static ContainerFactory containerFactory = new ContainerFactory() {
      public List creatArrayContainer() {
          return new LinkedList();
      }

      public Map createObjectContainer() {
          return new LinkedHashMap();
      }
  };
  public static void main(String []argv) {
    
    JSONParser parser = new JSONParser();
    String jsonText = "{\"first\": 123, \"second\": [4, 5, 6], \"third\": 789}";
    Map json = null;
    try {
      json = (Map) parser.parse(jsonText, containerFactory);  
    } catch(ParseException pe) {
      pe.printStackTrace();
    }
    
    
    
    Iterator iter = json.entrySet().iterator();
    System.out.println("==iterate result==");
    while(iter.hasNext()) {
        Map.Entry entry = (Map.Entry) iter.next();
        System.out.println(entry.getKey() + " => " + entry.getValue());
    }
  }
}
