package thesis;

import org.json.simple.JSONValue;
import org.json.simple.parser.*;
import java.util.*;

public class Test {
    static ContainerFactory containerFactory =
      new ContainerFactory() {
        
        public List creatArrayContainer() { return new LinkedList(); }
        
        public Map createObjectContainer() { return new LinkedHashMap(); }
    };
    
    public static void main(String[] argv) {
        JSONParser parser = new JSONParser();
        String jsonText =
          "{\"first\": 123, \"second\": [4, 5, 6], \"third\": 789}";
        Map json = null;
        try {
            json = (Map) parser.parse(jsonText, containerFactory);
        }
        catch (ParseException pe) { pe.printStackTrace(); }
        Iterator iter = json.entrySet().iterator();
        System.out.println("==iterate result==");
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
    
    public Test() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369114322000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVWXWxURRSe3W63bLvYbgtISmkLVKEadn2RKH2xaWgoLGFt" +
       "C8oasszeO7u9Zfbe\n68zsdotKNCaCPJgY8C9ReDEhMTwYiPqgURPwXxPTB/" +
       "AFEoMxJgqRByMxGD0zs3d/7i7Q5E7Pzpy/\nOec7Z86Za6idMzTsOnQxTx0R" +
       "F4su4fEUZpyYExRzPgsbGWPrhlsL3x/ZsaYNdadRt2XPCCwsY8Kx\nBSmLNI" +
       "oWSCFLGB83TWKmUcwmxJwhzMLUOgSMjp1GvdzK21gUGeHThDu0JBl7edElTN" +
       "n0NpMoajg2\nF6xoCIdxgXqS87iEE0Vh0UTS4mIsicI5i1CTP40Oo0ASteco" +
       "zgPjqqR3i4TSmJiU+8DeaYGbLIcN\n4omEDlq2KdCQX6J645GdwACiHQUi5p" +
       "yqqZCNYQP1apcotvOJGcEsOw+s7U4RrAjUf1ulwLTMxcZB\nnCcZgVb7+VL6" +
       "CLgiKixSRKCVfjalqcxQvy9nddnaHY7+eyz193BQ+WwSg0r/20Fo0Cc0TXKE" +
       "Edsg\nWvBmMX5ial9xIIgQMK/0MWue8fs+2pP87bMhzbOmBc/u7DwxRMa4tW" +
       "Vg7dL4L5E26cYy1+GWhELD\nzVVWU5WTsbILWFxV1SgP497h59Nf7nv+PfJ7" +
       "EC2bQmHDocWCPYUixDYnKnQH0EnLJnp3dy7HiZhC\nIaq2wo76DeHIWZTIcI" +
       "SAdrGYU3TZRQh1wBeAbyPSfxG5CNQxS7iI83lwXADFE5wZCTFHuAXJ0Edl\n" +
       "qWT5QiAA/g/4a4kC8LY71CQsY5y++u2z23a+fDRYRVPFvEBdWmVcqkSBgNJ1" +
       "b2MsZHBNWQN/nB3r\neWUz/zCI2tIoYhUKRYGzlEDtYEqdBWJmhAJPrA6oCh" +
       "8ArmgWcAaQzVBQpHANly8xtN6Pp1oVTgGF\nASRLh//78Xpm4ZxMvUzVCqld" +
       "uwaBP6h9i47O7N9x4Oj6Nsm0EJIxBdaRu2vPGNeP7Tp38bvLm2q4\nFWikqZ" +
       "yaJWU5+N1PMccgJrSbmvo3/tn+5/H2Rz8IytxHoMsIDNiAkh3022goizGvxc" +
       "hgBZOoK+ew\nAqbyyOsLnWKOOQu1HYWHLrl0a2jIYPkcVN3p5ovhhy590vVF" +
       "sL6Rddd1vBkidFnEarGeZYTA/uU3\nU8dfu3bkKRXoSqQFCrvFLLWMsnJkZQ" +
       "AS29eiROOrV5x4ffTtS14m+2raxxnDizKR5ReW1r71FX4H\nyhfKiFuHiKoS" +
       "pCwhz4BcRxX9QN2h/D1cYZHg8hfFpGzgXmYK2Wf+On+yc1g7I2X6q7jxN6wG" +
       "wYxx\n6NM9J2/+IK6o+NVSKnUMlZvN7sV1aHvkYikWfv9UIYg60qhHPTrYFn" +
       "sxLcropuHZ4BOVzSRa3nDe\n+ATofjdWheyAH051Zv1gqvUAoCW3pDs0fhTP" +
       "PZVGJAPSW2lMnXKRhz1yiZUDyJXEFiWwTq0jNUBw\n9VaXhbqjjs8kluWzqD" +
       "h7BdrosHx8njt2nFsFl5K4K99/Jou0gV9BudzCiqTv99JdQ0S/BxWG1t7u\n" +
       "tVIv7ZEnb0Rfwhf26zelt7HrbbOLhYdP/URGH4saLfpmRDjuZkpKhNbg5re2" +
       "S73iXg66nxj6eXLL\n6eda4W3ojpIZI1Za83jbnPU1dN5qvpvGiEahscYsdz" +
       "ICU5A925DrwWque+DbBF9fJdd9vlzrdtKU\ngqBKgVy2tq7MQPWK/sFBFbx+" +
       "28+2jdwIfrxqRHXIUBZz7aJ/4moeqBrmJOVjpHqjfviG73AjD4U9\nqgfJio" +
       "rrocp13bt3maRAoQKAtEWvSDGrALNDqTLcvDr47q/nrk6vCNZNgBuahrB6GT" +
       "0FKjOdrkTx\nujtZUNwXHlx35vD0lWyw4t4EuFdyLBPKLyRfdtlsVzdN23om" +
       "NNYvHdh03o19o8PvzW1hGJ5yRUrr\nO0UdHXYZyVnKWFj3DVf9y0Lp65FC/j" +
       "LcFmHWjav8P53OuIAFDAAA");
}
