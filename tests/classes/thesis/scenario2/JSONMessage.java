package thesis.scenario2;

import java.io.Serializable;
import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

public class JSONMessage implements Serializable {
    private String msg;
    
    JSONMessage(String msg) {
        super();
        this.msg = msg;
    }
    
    static JSONMessage create(String msg) { return new JSONMessage(msg); }
    
    public String toString() { return this.msg; }
    
    public Map parse() { return JSON.parse(this.msg); }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369148313000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVWW2hcRRie3c1ubpsmmyZtyaUJMYVG7K4IlmpADKGhaTcm" +
       "Nmm1K2U7OWd2c5LZ\nc44zczabqEURTO2DL603sO1jQXwQi/oiKtT7BSQPrS" +
       "8VRB8EbdEHMUhF/5lz9nJOtu2TC3N2zsx/\nO////d/MW9dRlDM0aFt0JU8t" +
       "kRQrNuHJGcw40ccp5nwOFrLag3fdXP5m7WBvBLVnULthzgosDG3c\nMgUpiQ" +
       "yKF0hhnjA+putEz6CESYg+S5iBqbEKgpaZQZ3cyJtYOIzww4RbtCgFO7ljE6" +
       "Z8lhfTKK5Z\nJhfM0YTFuEAd6UVcxClHGDSVNrgYTaNYziBU50+ikyiURtEc" +
       "xXkQ3JYuf0VKWUxNyHUQbzEgTJbD\nGimrNCwZpi7QQFCj8sXDh0AAVBsLRC" +
       "xYFVcNJoYF1OmGRLGZT80KZph5EI1aDngRqOeWRkGoycba\nEs6TrEA7gnIz" +
       "7hZINau0SBWBuoNiylKJoZ5AzWqqNR2L/3N65q/BsIpZJxqV8UdBaWdA6TDJ" +
       "EUZM\njbiKG07y7OQxpy+MEAh3B4RdmbFd7x9J//LRgCvTW0dmen6RaCKr3d" +
       "zb178+9nNzRIbRZFvckFDw\nfbmq6oy3M1qyAYvbKhblZrK8+fHhz449+yb5" +
       "NYyaJlFMs6hTMCdRMzH1cW/eCPO0YRJ3dTqX40RM\nogaqlmKWeod05AxKZD" +
       "oaYG5jsaDmJRsh1AgjBGM7cn/yHQm05eDs9CNThHMoTpIvCjQiCBc8xZmW\n" +
       "EguEGzDViImZYd2X8suWpPG25VAIvqsv2GMUAHnAojphWe3iT189vf/Qi6fC" +
       "FZR5YQnU5/pIVnwk\na3ygUEgZ3+5PmqyCLpvlt3dGO17aw98Lo0gGNRuFgi" +
       "PwPCXQZJhSa5noWaFQlqhBtAISoDA+D4AE\nbGcpGFINAFkqMjQUBF61XSdh" +
       "hgFN6yf//e5GdvmSxIisaZe07oYGFVpyY4uPzB4/eOLUUEQKLTfI\n5IPo8J" +
       "2tZ7Ubp6cuXfn62u4qwAUa3tR3mzVl3wTDn2GWRnTgpar5V/8+8PuZ6APvhi" +
       "VImoGOBAYQ\nQW/vDPrw9c9omYtkssJp1JqzWAFTuVUmkBaxwKzl6ooCSKua" +
       "b4EEyCREYcQ9BLbIh9zskI+ECyeZ\nz8A3KKbbeD5279UPWj8N15Jiew17zh" +
       "LhtliiWo45RgisX3tt5szL19eeULVwi4FKKqzuEJR8a50u\nT+7oOvvKyBtX" +
       "yzXeWjU6xhhekSUuPbfe//rn+BwwAHQiN1aJarSQV21pvxMYXmlK7CVdNi17" +
       "ls8R\nNb9bBuSFJd8HPRGJx2BjTcjDoVzMwvxTf14+3zLoRil1eipQC5KhTz" +
       "GrrX545PzGt+IHlc8qCqSN\ngdJmt0dxDUD3XSkmYm9fKIRRYwZ1qAMNm+Io" +
       "po7MdgaOJD7uLaZRm2/ff7y4XDpaQXlfEIE1boP4\nq/IIzKW0nDcGIBf3CK" +
       "/Jg1xTAHIhZMvJPqUwpJ67vG4VqNFmRhHLOwCKFHhebt6jMFqqKx6znXlq\n" +
       "aOXaVcvb4weESxeGlazcIYCzSlCx/ludeeq8Xnv8j/gL+JPj7snU6afE/aZT" +
       "uP/C92Tk4bhWh2Wb\nhWXvoaRIaBVYQW9T6i5Qznb7YwM/Tuy9+EwQWRGIc+" +
       "C2mlktUex9NLJgfAG0XKnspsuIX2nUX88W\nRuAuZc75qrqzUtVWGCMw2ryq" +
       "ttUlkro14upqV78FvcZVdb5zk06DNY0RwEfV3ZQvxD4YHV6IHfVC\nlI+Hbu" +
       "vojlEcE6hJWC6xqMDrxLENRpcXR9f/FMcJgaK2vFeXUd5WJcwpbEMLtdYc7J" +
       "JRd2y6lbt3\nR21o/cTuy3biS3U+Ve53Mbhk5RxKa7u+Zh6zGckZKpSYywG2" +
       "+lsCAg5eMaAfKnMV7qIrC5e3mCsr\n3yy7DoO7hFX6D903745ZDAAA");
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
    final public static long jlc$SourceLastModified$jl = 1369148313000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1WXWxURRSe3bZb2i60u/xI2kILVKSJ7KIGFDcmNg0NLVta" +
       "24KySpbp3dntLbP3\nXmdm2y0q0ZgI8uAL+JcoPJIYH4xEfTFqgv8/iekD+I" +
       "KJ0QcTheiDsTEYPTNzd+/e28W6ycyeO3P+\n5pzvnJk3r6MmzlCvY9OFArVF" +
       "Qiw4hCfGMeMkN0gx51OwkDXu33Zz/utTI10NqD2D2k1rUmBhGoO2\nJUhZZF" +
       "C0SIrThPGBXI7kMihmEZKbJMzE1DwBjLaVQXFuFiwsSozwCcJtOicZ47zkEK" +
       "ZsVhbTKGrY\nFhesZAibcYE60rN4DidLwqTJtMlFKo0ieZPQHH8cnUShNGrK" +
       "U1wAxg3pyimSSmNySK4De6sJbrI8\nNkhFpPG4aeUE6glKVE/cdwAYQLS5SM" +
       "SMXTXVaGFYQHHtEsVWITkpmGkVgLXJLoEVgTpvqRSYVjnY\nOI4LJCvQxiDf" +
       "uN4CrhYVFiki0Pogm9JUZqgzkLOabI1Fon+fGf+zN6x8zhGDSv+bQGhzQGiC" +
       "5Akj\nlkG04FIpcW74SKk7jBAwrw8wa56B2987lP75wx7N01WHZ2x6lhgia9" +
       "zc071pceCnlgbpxirH5qaE\ngu/kKqvj7k6q7AAWN1Q1ys1EZfOjiU+PPP0G" +
       "+SWMVg2jiGHTUtEaRi3Eyg26dDPQadMienUsn+dE\nDKNGqpYitvqGcORNSm" +
       "Q4GoF2sJhRdNlB+heCkXLpTjkJtGZkcuzgKOEckpPgswL1C8IFT3JmJMUM\n" +
       "4SaQBrEwM+27k37eslS+ej4UgnN1B2uMAiD32zRHWNa4+OOXT+478PzpcBVl" +
       "rlsAAG0jUbWRkDZQ\nKKS03uaPlgx/TlbJr2+nOl7Yyd8No4YMajGLxZLA05" +
       "RAdWFK7XmSywoFr1gNlBWCAH7RaUAigDpL\nQZFCPoRnjqGtQcR5dToMFAYY" +
       "LZ7859sb2flLEhwymeukdu0apOa49i3aP3l05NjprQ2Sab5RRh1Y\n+1bWnj" +
       "VunBm9dOWrazs8ZAvUt6zglkvKggm6P85sg+SgIXnqX/5r/29nm/a+E5boaI" +
       "E+JDCgB4p6\nc9CGr3BSlSYkgxVOo7a8zYqYyq1K52gVM8ye91YUMtrk1K5B" +
       "IoMVcFD1r6VnI7uuvt/2Sbi21bXX\n9MRJInThxLxYTzFCYP3aK+NnX7x+6l" +
       "EVaB1pVFb214cgn2vr1G5i47pzL/W/drWSwLWe0gHG8ILM\nX/mZxU2vfoZf" +
       "h7qG+uLmCaLLx29AzjsU3V+zKb97XRaJqWBVDMnOXklIcfqJPy6fb+3VzkiZ" +
       "TqUm\nzJd3Mp9g1jjxwaHzS9+I71XYvExKHT3l5WYP4xqQ3XdlLhZ560IxjJ" +
       "ozqEPdRtgShzEtyaBm4D7h\ng+5iGq327fvvBt0IU1WkdgdRVGM2iCGvCQAt" +
       "uSXdrGGjeNZAINpg7ILR5XYs9S83O+QUK4eQI4nd\nSmCLmvvcihMowtUlXg" +
       "bKkfc9U/txgbbYrJCY5baV4GbRoSSht1XfUS8DphEr57t8vkRg9Lm+dNf3\n" +
       "5QE53StUXHVOhrCs1IWK9TtuYX0wwK98UPHY5sLJQ1xnBYoMbbrVNamu+FOP" +
       "/B59Dn98VF9mcX8z\n3WeVirsvfEf6H4wadRpzi7CdnZTMEerBOWhtVD0fKj" +
       "luf7jnh6E9F5+qh+ee/5TMGrG5rocaZszP\noaFX8bTs/eIXSvlR1MoIPL+s" +
       "KR+WNlfzF4dxJ4ztbv62B/Ln5dwHpLCET2mamoZc3Fu/+kNul3dT\n3KGaii" +
       "yRhH4+rdwzDgrUpIBQ0bHaa0yjWAcz7TvLPW5toMr//ziLpCdWPof8PLSyz4" +
       "8J1FyAN4jw\nSivueS2XMQAZ6q9RVpbsthuXvcP1a9HYunhsx2Un9oW6mKov" +
       "ugg8q/IlSmtbRQ0dcRjJm8qViG4c\njvozIQPBRwXAuUorZ2c0L6AsonnlV9" +
       "Gpk0Ld5cr/Arqx20xLDAAA");
}
