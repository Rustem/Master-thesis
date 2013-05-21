package thesis;

import java.io.Serializable;
import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

class JSONMessage implements Serializable {
    private String msg;
    
    JSONMessage(String msg) {
        super();
        this.msg = msg;
    }
    
    static JSONMessage create(String msg) { return new JSONMessage(msg); }
    
    public String toString() { return this.msg; }
    
    public Map parse() { return JSON.parse(this.msg); }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369120803000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVWTWwbRRQe27Hz5zRxmqRVmj+FVGoQtblQFXIhilo1qUNM" +
       "0pbWqHInu2Nnk/Hu\nMjPruAUqEBItPXBp+ZOgPVZCHBAVcEGAVP5/JJRDy6" +
       "VICA5I0AoOiAgVwZvZ9c9uHIpEpN2MZ957\n8/Z93/tm3riJopyhEduiJwvU" +
       "Eklx0iY8mcGME32KYs4PwUROe+Cu26tfnZnZEUGdWdRpmAsCC0Ob\nskxByi" +
       "KL4kVSXCSMT+o60bMoYRKiLxBmYGqcAkPLzKJubhRMLBxG+DzhFi1Jw27u2I" +
       "SpPSuTaRTX\nLJML5mjCYlygrvQyLuGUIwyaShtcTKRRLG8QqvPH0GkUSqNo" +
       "nuICGPalK1+RUhFT++U8mLcZkCbL\nY41UXJpWDFMXaDjoUf3isYNgAK7NRS" +
       "KWrOpWTSaGCdTtpkSxWUgtCGaYBTCNWg7sIlD/pkHBqMXG\n2goukJxA24N2" +
       "GXcJrFpVWaSLQL1BMxWpzFB/ALM6tOZi8b/OZf4YCaucdaJRmX8UnIYCTvMk" +
       "Txgx\nNeI6rjvJC9PHnIEwQmDcGzB2bSZ3vns4/dMHw67NjgY2c4vLRBM57f" +
       "aegcG1yR9bIzKNFtvihqSC\n78sVqhlvZaJsAxf7qhHlYrKy+OH8J8eeep38" +
       "HEYt0yimWdQpmtOolZj6lDduhnHaMIk7O5fPcyKm\nURNVUzFL/YZy5A1KZD" +
       "maYGxjsaTGZRu5fyF4tnnjZvkSaMvMwtxDs4RzACfJl4E2gnDBU5xpKbFE\n" +
       "uMFTfouyDNmxGgrB1wwEO4sCDQ9YVCcsp13+4Ysn9h187my4yi0vGaCYGzlZ" +
       "FxmFQirkNn+BZMV1\n2Ri/vDXR9fxu/k4YRbKo1SgWHYEXKYGGwpRaq0TPCc" +
       "WoRB17FWmAcfFFIB/wOEchkCI7VKTE0GiQ\nZLXWnIYRBuasnf77m1u51SuS" +
       "DxK/HhndTQ3QWHFzi48vHJ85cXY0Io1Wm2ShwXTsztFz2q1zs1eu\nfXljV4" +
       "3MAo1t6LGNnrJHgulnmKURHTSoFv6lPw/8ej56/9thSYhWkB6BgTDQx0PBPX" +
       "y9MlHRHVms\ncBq15y1WxFQuVcSiTSwxa7U2o2jRrsZboACyCFF44h7b2uRL" +
       "LnbJV8Ilkaxn4BuUqq0/E7v3+nvt\nH4frBbCzTikXiHDbKVGD4xAjBOZvvJ" +
       "w5/8LNM48qLFwwUFml1RsCyLc26Ojk9p4LL46/er2C8dZa\n0EnG8EkJcfnp" +
       "tcFXPsWvQbdD13HjFFFNFfLQlvG7Qc2Vp+Re0lXOys7yPa7Gd8uEvLTk7xHP" +
       "RPIx\n2E775UFQAbO4+PjvVy+2jbhZSp/+KtWCwudzzGmn3j98cf1r8Z2qZ4" +
       "0FMsZweeO2R3AdQfdeKyVi\nb14qhlFzFnWpwwub4gimjqx2Fo4fPuVNplGH" +
       "b91/lLi6OVFl+UCQgXXbBvlXUw8YS2s5bg5QLu6J\nW4tHuZYA5ULIloO9ym" +
       "FUvXd63SpQs82MEpbnPYoUeUEu3qM4qjYZ8zCqwdjvB96VBcNKVu8FoE1l\n" +
       "QGZws3NMncFnjv4WfxZ/dNw9bbr90rfPdIr3XfqWjD8Y1xpoaKuw7N2UlAit" +
       "ESi426w63ytV7Xxk\n+Pv9ey4/GWRQBPIc/lfPnJYo7Xg4smR8BvJbRXDDBc" +
       "PvNOHHrY0RuB+Zh3zoDVXRa4dnHJ4OD72O\nhoLRCLoYV9e1xq3mNajC887N" +
       "mIZoGiPAg9p2M74UB+Dp8lLs+u8p2s4i3SxF5BepzbM7IlCLsFxh\nUR/UIL" +
       "8+eHq8/Hoa5SdfR/9fHicEitryDl1hf0dNMGexDS3UXnewS0XdvuEG7t4Ttd" +
       "G1E7uu2onP\n1flUvcvF4EKVdyit7/q6ccxmJG+oVGKuBtjq3woU2r1YyF/U" +
       "bqDKrgiV/wEvjDvGGQwAAA==");
}

class JSON {
    static JSONParser parser = new JSONParser();
    static ContainerFactory containerFactory =
      new ContainerFactory() {
        
        public List creatArrayContainer() { return new LinkedList(); }
        
        public Map createObjectContainer() { return new LinkedHashMap(); }
    };
    
    public static Map parse(String json_msg) {
        try {
            return (Map) parser.parse(json_msg.toString(), containerFactory);
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
    
    public JSON() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369120803000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1WXWxURRSe3bZb2i60u/yIbaEFSqSJ7GIMKDQmNg0NLVta" +
       "W0BZJcv03tntLbP3\nXmdm2y0q0ZgI8uAL+JcoPJIYH4xEfTFqgv8/iekD+I" +
       "KJ0QcTheiDkRiMnpm5u3fv7WLdZGbPnTnn\nzJlzvnPmvHkdNXGGel2HLhSo" +
       "I1JiwSU8NYEZJ+YQxZwfhIWcsWfLrfmvT412NaD2LGq37CmBhWUM\nObYgZZ" +
       "FF8SIpThPGB02TmFmUsAkxpwizMLVOAKNjZ1GSWwUbixIjfJJwh85JxiQvuY" +
       "SpMyuLGRQ3\nHJsLVjKEw7hAHZlZPIfTJWHRdMbiYiCDYnmLUJM/jk6iSAY1" +
       "5SkuAOO6TOUWaaUxPSzXgb3VAjNZ\nHhukItJ43LJNgXrCEtUb9+0HBhBtLh" +
       "Ix41SParQxLKCkNoliu5CeEsyyC8Da5JTgFIE6b6sUmFa4\n2DiOCyQn0Pow" +
       "34TeAq4W5RYpItDaMJvSVGaoMxSzmmiNx+J/n5n4szeqbDaJQaX9TSC0MSQ0" +
       "SfKE\nEdsgWvBmKXVu5EipO4oQMK8NMWuewa3vHcr8/GGP5umqwzM+PUsMkT" +
       "Nu7eresDj4U0uDNGOF63BL\nQiFwcxXVCW9noOwCFtdVNcrNVGXzo8lPjzz9" +
       "BvklilaMoJjh0FLRHkEtxDaHPLoZ6IxlE706ns9z\nIkZQI1VLMUd9gzvyFi" +
       "XSHY1Au1jMKLrsIv2LwNjj0XfKSaBVo1PjB8YI5xCcFJ8F2AjCBU9zZqTF\n" +
       "DOEWTwc5ylLlyvlIBG7THc4sCjDc51CTsJxx8ccvn9y7//nT0Sq2PGMEatOa" +
       "U1IzikSUrjuCnpGu\nNmVG/Pr2QMcL2/m7UdSQRS1WsVgSeJoSyCRMqTNPzJ" +
       "xQUErUwFahBaAWnwbUAYBzFBQplIMr5hja\nHEaXn5MjQGGAzOLJf769kZu/" +
       "JIEgA7dGatemQRiOa9vi/VNHR4+d3twgmeYbpYeBtW957Tnjxpmx\nS1e+ur" +
       "bNR7FAfUuSa6mkTI6w+RPMMYgJxcdX//Jf+34727T7nahEQgvUHIEBKZDAG8" +
       "NnBJJkoFJw\npLOiGdSWd1gRU7lVqRKtYoY58/6KwkObnNo1NKSzQgaqWnXz" +
       "2diOq++3fRKtLWvtNfVvigidJAnf\n1wcZIbB+7ZWJsy9eP/WocrT2NCqr89" +
       "dGIJ6r6+Rpav2acy/1v3a1EsDVvtJBxvCCjF/5mcUNr36G\nX4cchlzi1gmi" +
       "UyV4gJy3Kbq/ZlN+93osElPhXBiWVbwSkOL0E39cPt/aq42RMp1KTZQvrVoB" +
       "wZxx\n4oND529+I75XbvMjKXX0lJceexjXgOz+K3OJ2FsXilHUnEUd6uXBtj" +
       "iMaUk6NQtvBx/yFjNoZWA/\n+A7oojdQRWp3GEU1x4Yx5Kc+0JJb0s0aNopn" +
       "FTiiDcYOGJ1edVL/crNDTolyBLmS2KkENqm5z8s4\ngWJcPdhloFz5tjO1nx" +
       "Rok8MKqVnu2CluFV1KUnpb1R3VBTCNWDnfE7AlBmOLZ0tXfVsekNN9QvlV\n" +
       "x2QYy0xdqJx+121OHwrxKxuUP7Z4cPIR11mBIkMbbvckquf81CO/x5/DHx/V" +
       "D1cyWEz32qXizgvf\nkf4H40adctwiHHc7JXOE+nAOnzamWoVKjNsf7vlheN" +
       "fFp+rhuec/JXNGYq7roYYZ63Mo6FU8LelV\ngkIDQRS1MgKtln0wgKWN1fgl" +
       "YdwNY6sXv62h+PkxDwApKuFTmqaWIRd318/+iFflvRB3qKIiUySl\nW6Xla8" +
       "YBgZoUECo6VvqFaQxrZ2YCd7kXRtq7S/p/3kXSk8vfQ34eWt7mxwRqLkC/If" +
       "zUSvpWy2UM\nQIb8a5SZJavt+iU9t+4Mjc2Lx7ZddhNfqIep2r3FoIXKlyit" +
       "LRU1dMxlJG8pU2K6cLjqz4KQ6VZC\nfs26dcKiK1f5X2MAcmILDAAA");
}
