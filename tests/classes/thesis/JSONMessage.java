package thesis;

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
    final public static long jlc$SourceLastModified$jl = 1369129383000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVWTWwbRRQe27Hz5zRxmqRRkjZRSKUGUZsLVSESIooaNa1D" +
       "QtMWYlS5492xs8l4\nd5mZdZwAFQiJlh64tPxJ0B4rIQ6ICrggQCr/PxLKoe" +
       "VSJAQHJGgFB0SFiuDN7PpnN257ItJuxjPv\nvXn7vu99M29dQ1HO0Iht0bUC" +
       "tURSrNmEJ+cx40SfopjzwzCR1R646+bqNycPDEZQZwZ1GuaCwMLQ\npixTkL" +
       "LIoHiRFHOE8UldJ3oGJUxC9AXCDEyNdTC0zAzq5kbBxMJhhB8i3KIladjNHZ" +
       "swtWdlMo3i\nmmVywRxNWIwL1JVexiWccoRBU2mDi4k0iuUNQnX+BDqBQmkU" +
       "zVNcAMO+dOUrUipialrOg3mbAWmy\nPNZIxaVpxTB1gYaDHtUvHjsIBuDaXC" +
       "Riyapu1WRimEDdbkoUm4XUgmCGWQDTqOXALgIN3DIoGLXY\nWFvBBZIVqD9o" +
       "N+8ugVWrKot0Eag3aKYilRkaCGBWh9ZcLP7P6fm/RsIqZ51oVOYfBacdAadD" +
       "JE8Y\nMTXiOt5wkmdnFp2hMEJg3Bswdm0md75/JP3LR8OuzWADm7ncMtFEVr" +
       "u5Z2j7xuTPrRGZRottcUNS\nwfflCtV5b2WibAMX+6oR5WKysvjxoc8Wn3mT" +
       "/BpGLTMoplnUKZozqJWY+pQ3boZx2jCJOzuXz3Mi\nZlATVVMxS/2GcuQNSm" +
       "Q5mmBsY7GkxmUbIdQMTwiebcj9k7+RQFsOLMw9PEs4B3CSfBloIwgXPMWZ\n" +
       "lhJLhBs85bcoy5Adq6EQfM1QsLMo0HC/RXXCstqFn756at/BF06Fq9zykgGK" +
       "uZGTdZFRKKRCbvMX\nSFZcl43x2zsTXS/u5u+FUSSDWo1i0RE4Rwk0FKbUWi" +
       "V6VihGJerYq0gDjIvngHzA4yyFQIrsUJES\nQ6NBktVacwZGGJizceLf765n" +
       "Vy9KPkj8emR0NzVAY8XNLT6+cOzA8VOjEWm02iQLDaZjd46e1a6f\nnr14+e" +
       "uru2pkFmhsU49t9pQ9Ekx/nlka0UGDauFf+Xv/72ei978bloRoBekRGAgDfb" +
       "wjuIevVyYq\nuiOLFU6j9rzFipjKpYpYtIklZq3WZhQt2tV4CxRAFiEKT9xj" +
       "W5t8ycUu+Uq4JJL1DHyDUrUbz8Xu\nvfJB+6fhegHsrFPKBSLcdkrU4DjMCI" +
       "H5q6/On3np2snHFRYuGKis0uoNAeRbG3R0sr/n7Mvjr1+p\nYLy1FnSSMbwm" +
       "IS4/u7H9tc/xG9Dt0HXcWCeqqUIe2jJ+N6i58pTcS7rKWdlZvsfV+G6ZkJeW" +
       "/D3i\nmUg+BttpWh4EFTCLuSf/vHSubcTNUvoMVKkWFD6fY1Zb//DIuRvfih" +
       "9UPWsskDGGy5u3PYrrCLr3\ncikRe/t8MYyaM6hLHV7YFEcxdWS1M3D88Clv" +
       "Mo06fOv+o8TVzYkqy4eCDKzbNsi/mnrAWFrLcXOA\ncnFP3Fo8yrUEKBdCth" +
       "zsVQ6j6r3T61aBmm1mlLA871GkyAty8R7F0XJD85jt5KihVbCrwTvgJ4Qr\n" +
       "F4aVrN4XQLPKgNj2W51v6mw++dgf8efxJ8fcU6jbL4n7TKd43/nvyfhDca2B" +
       "trYKy95NSYnQGrGC\nu82qc79S7c5Hh3+c3nPh6SCzIpDn8G09s1qiNPhIZM" +
       "n4AmS5iuymi4ffacKPZxsjcG8yD/tQ3VFF\ntR2ecXg6PFQ7GgpJQ4y4usY1" +
       "bkGvcRXOd27SOYimMQL8qG0360txCJ4uL8WuRinK14O33eiOWSwK\n1CIsV1" +
       "hU4g3y6IOnx8uj53/K47hAUVveoSss76gJ5iy2oYXa6w52qaj9m27g7j1RG9" +
       "04vuuSnfhS\nnU/Vu1wMLlR5h9L6rq8bx2xG8oZKJeZqgK3+rQBK7sVC/qJ2" +
       "A1V2Raj8HxBdyX4ZDAAA");
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
    final public static long jlc$SourceLastModified$jl = 1369129383000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1WXWxURRSe3bZb2i60u/xI2kILVKSJ7GIMKG5MbBoaClta" +
       "W0BZJcv07uz2ltl7\nrzOz7RaVaEwEefAFfxOFRxLjg5GoL0ZN8P8nMX0AXz" +
       "Ax+mCiEH0wEoPRMzP37t17u1g3mdlzZ845\nc+ac75w5b15DLZyhfsemCyVq" +
       "i5RYcAhPTWDGSWGYYs4PwkLeuG/LzfmvT+3raUKdOdRpWlMCC9MY\nti1Bqi" +
       "KH4mVSniaMDxUKpJBDCYuQwhRhJqbmCWC0rRxKcrNkYVFhhE8SbtM5yZjkFY" +
       "cwdaa3mEVx\nw7a4YBVD2IwL1JWdxXM4XREmTWdNLjJZFCuahBb4Y+gkimRR" +
       "S5HiEjCuy3q3SCuN6RG5DuztJpjJ\nitggnkjzcdMqCNQXlqjdeGA/MIBoa5" +
       "mIGbt2VLOFYQEltUkUW6X0lGCmVQLWFrsCpwjUfUulwLTC\nwcZxXCJ5gdaH" +
       "+Sb0FnC1KbdIEYHWhtmUpipD3aGY1UVrPBb/+8zEn/1RZXOBGFTa3wJCG0NC" +
       "k6RI\nGLEMogVvVFIvjB6p9EYRAua1IWbNM3T7e4eyP3/Yp3l6GvCMT88SQ+" +
       "SNm7t6NywO/dTWJM1Y4djc\nlFAI3FxFdcLdyVQdwOK6mka5mfI2P5r89MhT" +
       "b5BfomjFKIoZNq2UrVHURqzCsEu3Ap01LaJXx4tF\nTsQoaqZqKWarb3BH0a" +
       "REuqMZaAeLGUVXHaR/ERgZl+6Wk0Cr9k2NHxgjnENwUnwWYCMIFzzNmZEW\n" +
       "M4SbPB3kqEqVK+cjEbhNbzizKMBwr00LhOWNCz9++cSe/c+djtaw5RojUIfW" +
       "nJKaUSSidN0W9Ix0\ndUFmxK9vZ7qe387fjaKmHGozy+WKwNOUQCZhSu15Us" +
       "gLBaVEHWwVWgBq8WlAHQA4T0GRQjm4Yo6h\nzWF0+Tk5ChQGyCye/Ofb6/n5" +
       "ixIIMnBrpHZtGoThuLYtPjh1dN+x05ubJNN8s/QwsA4srz1vXD8z\ndvHyV1" +
       "e3+SgWaGBJci2VlMkRNn+C2QYpQPHx1b/8197fzrbsficqkdAGNUdgQAok8M" +
       "bwGYEkyXgF\nRzormkUdRZuVMZVbXpVoFzPMnvdXFB465NSpoSGdFTJQ1aob" +
       "z8R2XHm/45NofVnrrKt/U0ToJEn4\nvj7ICIH1q69MnH3x2qlHlKO1p1FVnb" +
       "82AvFc3SBPU+vXvPDS4GtXvACu9pUOMYYXZPyqTy9uePUz\n/DrkMOQSN08Q" +
       "nSrBA+S8TdGDdZvyu99lkZgK58KIrOJeQMrTj/9x6Vx7vzZGynQrNVG+tGoF" +
       "BPPG\niQ8Onbvxjfheuc2PpNTRV1167GFcB7J7L88lYm+dL0dRaw51qZcHW+" +
       "IwphXp1By8HXzYXcyilYH9\n4Dugi16mhtTeMIrqjg1jyE99oCW3pFs1bBTP" +
       "KnBEB4wdMHrc6qT+5WaXnBLVCHIksVMJbFLzgJtx\nAsW4erCrQDnybWdqPy" +
       "nQJpuVUrPctlLcLDuUpPS2qjuqC2AasXK+K2BLDMaAa0tvY1vul9M9QvlV\n" +
       "x2QEy0xd8E6/4xanD4f4lQ3KH1tcOPmI6/agyNCGWz2J6jk/9fDv8Wfxx0f1" +
       "w5UMFtM9VqW88/x3\nZPCBuNGgHLcJ29lOyRyhPpzDp42pVsGLcedDfT+M7L" +
       "rwZCM89/2nZN5IzPU82DRjfg4FvYanJb1K\nUCgTRFE7I9BqWQcDWNpYi18S" +
       "xp0wtrrx2xqKnx/zAJCiEj6VaWoacnF34+yPuFXeDXGXKioyRVK6\nVVq+Zh" +
       "wQqEUBwdOx0i9MY1g7Mxu4y91ubiDv/3/cRdKTy99Dfh5a3uZHBWotQb8h/N" +
       "RK+lbLZQxA\nhvxrlpklq+36JT237gyNzYvHtl1yEl+oh6nWvcWghSpWKK0v" +
       "FXV0zGGkaCpTYrpwOOrPhJDpVkJ+\nzToNwqIrV/VfmZlqpQsMAAA=");
}
