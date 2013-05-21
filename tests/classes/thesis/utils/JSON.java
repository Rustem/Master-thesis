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
    static ContainerFactory containerFactory =
      new ContainerFactory() {
        
        public List creatArrayContainer() { return new LinkedList(); }
        
        public Map createObjectContainer() { return new LinkedHashMap(); }
    };
    
    public static Map parse(String json_msg) {
        try {
            return (Map) parser.parse(json_msg, containerFactory);
        }
        catch (ParseException pe) {
            pe.printStackTrace();
            return null;
        }
    }
    
    public static Iterator getIter(String json_msg) {
        Map json_obj = parse(json_msg);
        if (json_obj != null) return json_obj.entrySet().iterator();
        return null;
    }
    
    public static void main(String[] argv) {
        System.out.println(
          getIter("{\"first\": 123, \"second\": [4, 5, 6], \"third\": 789}"));
    }
    
    public JSON() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369115468000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1XXWxURRSe/emWtlvbLRRIKf2jChXZJRoJ0sTYNDS0LHZp" +
       "+ZEaXGbvzm5vuXvv\n9c7sdotAICaCPJgY8C9ReDEhMTwYiPqgURPwXxPTB/" +
       "AFEoMxJgqRByMxGD0zc+/e3bsLfaHJzM6d\nOX9zznfOnJ67geqohXpMQ5vL" +
       "agaLsjmT0GgCW5SkhzVM6Q7YSCqbVt2Z/f7Y2IoAaplCLao+yTBT\nlWFDZ6" +
       "TIplA4R3IpYtGhdJqkp1BEJyQ9SSwVa+oBIDT0KdRG1ayOWd4idIJQQytwwj" +
       "aaN4kldDqb\ncRRWDJ0yK68ww6IMtcZncAHH8kzVYnGVssE4CmVUoqXp8+gw" +
       "8sVRXUbDWSBcGnduERMSYyN8H8gb\nVTDTymCFOCzB/aqeZqjby1G6cf9WIA" +
       "DW+hxh00ZJVVDHsIHapEka1rOxSWapehZI64w8aGGo465C\ngWiRiZX9OEuS" +
       "DC330iXkEVA1CLdwFobavWRCUtFCHZ6YlUVrPBT+90Ti7x6/sDlNFI3bXwdM" +
       "XR6m\nCZIhFtEVIhlv56OnRvfkO/0IAXG7h1jSDD340c74b591S5oVNWjGUz" +
       "NEYUnlzobOlfNDvzQEuBmL\nTIOqHAoVNxdRTdgng0UTsLi0JJEfRp3Dzye+" +
       "3HPkPfK7Hy0aRSHF0PI5fRQ1ED09bK/rYR1XdSJ3\nxzMZStgoCmpiK2SIb3" +
       "BHRtUId0cQ1iZm02JdNBFC9TB8MNYi+dfEJ4bqxybHn47SGYa6GKGMxqil\n" +
       "xNg0oSoV9tOYTVDkoppnfT64Rac3ozSA3xZDSxMrqZy9/u3BzVtfPu4vYco2" +
       "gqGIFCzuTqNcMPL5\nhMRllX7hjk7zfPjj/GDrK+voh34UmEINai6XZzilEc" +
       "gjrGnGLEknmQBSpAy0AisAtHAKMAfwTWog\nSGAcHFGwUJ8XW25GjsIKA2Dm" +
       "D//3483k7AUOAx62JVy6NA2CsF/aFh6Y3Du273hfgBPNBrl/gbR/\nYelJ5e" +
       "aJbRcuf3d1jYthhvqrUquak6eG1/yEZSgkDaXHFf/GP1v+PFn3xAd+joMGqD" +
       "gMA04gfbu8\nOipSZNApN9xZ/jhqyhhWDmv8yKkRjWzaMmbdHYGKJj61SIBw" +
       "Z3kMFJXq9ouh9Vc+afrCX17UWsqq\n3yRhMkUirq93WITA/tU3Eydfu3HsWe" +
       "Fo29MMhcx8SlOVojCk3QeBXVwjXaPLl5x6feDtK04kF7vS\nhywLz/FAFo/O" +
       "r3zrK/wOpDKkFFUPEJExSGhCjgI+D4j1w2WH/LvHJuHg8qbGCC/mTmRyqRf+" +
       "uni6\nsUcaw3k6hBg/rS5eFYxJ5cCnO0/f/oFdE/5zQ8pldBer1e7CZWjbeL" +
       "kQCb1/JudH9VOoVTxAWGe7\nsJbn3p2CJ4QO25tx1FxxXvkcyNo3WIJspxdO" +
       "ZWq9YHIrAaw5NV/XS/wImgfsorQeRtguUuKXH7by\nKVL0IZMvNgiGXjH3u4" +
       "Cg4t0ucmjwJ94S520M9RpWNjpDDT1K1Zypkag8FgVINAOWhC6fH62wJQSj\n" +
       "3balubYtT/JpIxN+lTEZwTxl5xztq++ifdhDL2wo1rgZXz/kQMxFYYcDTwut" +
       "vNtrKV76Y8/cCr+E\nL+2Vb1pbZaXdrOdzj5/5iQw8FVZqVOwGZpjrNFIgmg" +
       "txr7Ztootw4t6yu/vnkQ1nD3kxHgA7u+/J\nmVQihRXbA9Pq11DtSxiramMq" +
       "mQYrkdVoEejC9B0V+OoqxbQNxiMwltkxXeaJqYuDihD4RQj4tKl2\nNfDZ5d" +
       "8OeasoMjxlorKDWriGbGeoTgDDkdHsFqptWDpyvOIej8Hote/Re3/vwT93L2" +
       "zzc9A+ZKEN\nYW6qtblW823Mu9xq07mg1bbpq+9zCKp7R1HnZXt3PtB/y//x" +
       "0n7xMAZTmEqUeJvu6p66olUWNjaU\nbtQJo2+BG+02TXNhh6oMBXNQE2o8Bw" +
       "lLzUGrWLB72Ve73v31wvWJJf6yhn9VVc9dziObfqGm0eRF\no/deGgT1pbW9" +
       "5w5PXEv5bfO2gHkFQ01DhQ3y2snf0+VV/1zJfwGUvvl9ay6akW+kq502PQS9" +
       "ciav\naeWPQdk6ZFokowplIfk0mOLnEEPh8t4RkkX8Ci8elDRHoO5LGv511K" +
       "yRjPL9Kv4PF4zM4hgOAAA=");
}
