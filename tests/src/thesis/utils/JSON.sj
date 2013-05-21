package thesis.utils;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

import java.util.List;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class JSON {
    static JSONParser parser = new JSONParser();
    static ContainerFactory containerFactory = new ContainerFactory() {
        public List creatArrayContainer() {
            return new LinkedList();
        }

        public Map createObjectContainer() {
            return new LinkedHashMap();
        }
    };

    public static Map parse(String json_msg) {
        try {
          return (Map) parser.parse(json_msg, containerFactory);
        } catch(ParseException pe) {
          pe.printStackTrace();
          return null;
        }

    }

    public static Iterator getIter(String json_msg) {
        Map json_obj = parse(json_msg);
        if(json_obj != null)
            return json_obj.entrySet().iterator();
        return null;
    }
    public static void main(String []argv) {
        System.out.println(getIter("{\"first\": 123, \"second\": [4, 5, 6], \"third\": 789}"));
    }
}