package thesis.scenario3;

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;

public class Good implements Serializable {
    public String productName;
    public int productPrice;
    public Date fromDate;
    public Date toDate;
    
    public Good() { super(); }
    
    public Good(String productName, int productPrice, int period) {
        super();
        this.productName = productName;
        this.productPrice = productPrice;
        this._setDates(period);
    }
    
    private void _setDates(int period) {
        Calendar future = Calendar.getInstance();
        future.add(Calendar.MONTH, period);
        this.fromDate = new Date();
        this.toDate = future.getTime();
    }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369250816000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1XW2xURRievXS3u11odykXobSlFAMSdk0IN/tirVQKi13a" +
       "grKGLLPnzLYHzp45\nzpndLqhEYyLIg4kBb4nCiwmJ4cFI1BejJuBdE9MH8A" +
       "USgzEmCtEHIzEY/WfOOXs5uwWbzNk5M/98\n859/vu//p+dvoDaLoX6T6kem" +
       "dcqT/IhJrGQGM4uoIzq2rCkYyCkPrL49++3xnSsCqDOLOjVjkmOu\nKSPU4K" +
       "TCsyhWJMU8YdawqhI1i+IGIeokYRrWtaNgSI0sSljatIF5iRFrglhULwvDhF" +
       "UyCZN7uoNp\nFFOoYXFWUjhlFkdd6UO4jFMlrumptGbxoTQKFTSiq9aT6Bjy" +
       "pVFbQcfTYLgk7X5FSiKmRsU4mEc1\ncJMVsELcJcHDmqFy1OddUf3iwV1gAE" +
       "vDRcJnaHWroIFhACVsl3RsTKcmOdOMaTBtoyXYhaPl84KC\nUbuJlcN4muQ4" +
       "Wua1y9hTYBWRYRFLOFrsNZNIFYaWe86s7rTGQ7F/Tmb+6vdLn1Wi6ML/NljU" +
       "61k0\nQQqEEUMh9sJbpeTpsf2lHj9CYLzYY2zbDK/5cG/6l0/6bJsVLWzG84" +
       "eIwnPK7c09K+eGf4oEhBvt\nJrU0QYWGL5enmnFmhiomcHFJFVFMJt3JTyc+" +
       "3//sO+RXP2ofQyGF6qWiMYYixFBHnH4Y+mnNIPbo\neKFgET6GgrocClH5Du" +
       "EoaDoR4QhC38R8RvYrJkIoDM0H7R5k/4XEg6PwI5SqSesQRwOcWNxKWUxJ\n" +
       "8RliadBViIGZRjemHKOKgFsw6/PBl/R4VaUDBXdQXSUsp5y7/vXT23e9eMJf" +
       "5ZXjCBy5DZ6sgicF\nOPL5JOrSxviIgKtCF7+9N9T10gbrAz8KZFFEKxZLHO" +
       "d1AnrCuk5niZrjklDxOvJKzgDhYnngHtA4\npwOQ5DoEpMzQgJdjNWWOQQ8D" +
       "ceaO/fv9zdzsBUEHcXzdAt12DQ7jsO1bbN3kgZ0HTwwEhNFsEMLq\nB9PBu6" +
       "PnlJsnd1+4/M3VtTUuczTYJLHmlUIiXvczjCpEhRRUg3/t7x2/n2rb9r5f8C" +
       "ECmYdj4AvI\nuNe7R4NUhty0I4LlT6OOAmVFrIspN1dE+Qyjs7URyYwO2V8I" +
       "AeiA1g0t5pBN/orJLvGI2zwS8fR8\ng0xqt54P3X/lo47P/PX5r7MuUU4Sbq" +
       "spXjuOKUYIjF99PXPqlRvHn5BnYR+Gj6OQWcrrmlKR/i32\nwdkvaqHs5LLu" +
       "06+ue/OKe9iLaujDjOEj4qwrz82tfOML/BaoHtRnaUeJFBeSOyF3A/G8T/bX" +
       "102K\n93452tMQqDZocSdQC1oFSjwGW0IHJHRAviegmkiPBfmTdua2mpNihm" +
       "lFyDllJym+3Pv2zxeuT3T7\n6yrH6qbkXb/Grh7Ss6hZgR1W3WkHaX1p/arz" +
       "xyau5e2smmjU+HajVNx09gey7sGY0iJfBKC+iZct\ndw9uyjER4vamp1FRVF" +
       "1lFPNP/XnxTLTfPmmxZrmECbaIV8PCnHL0471nbn3Hr0lPa5ISGH2V5m33\n" +
       "4Tq1b71cjofePVv0o3AWdcmLADb4PqyXBHWzUMqtEWcwjRY0zDeWZbsGDVVT" +
       "Ro/3wOq29Yq5Fl3o\nC2vRD7fQb69TNJD7W0dLHzJFZ1Qyk6MOk1EVEtSjDv" +
       "RGW9/i+VADZg+0dgezvTXmmIMZczCBTYoE\n3TIfqKhoEQc00ho07YC2Fxgt" +
       "Pow5cRWzsKZxMTzfFkuhRZ0toq232ONsEeLURRqXcJU6+aIaeW3G\n+VxH7M" +
       "qi0WT1ZgnlTahr5Xw3Iams44//EXsBXzrgdySwjaMIp+YGnZSJXlODF2S3vP" +
       "i5FOl8rO/H\n0c3nnvHKQRTkvjuuzCnx8oo9gRntSyjMVTo23TwbFw01kjDK" +
       "CFycjakGKvZWwy9Kx73QEk74Ey1L\niXgOyOeaatYPm0wrw1G0Thw+2+x/ph" +
       "YMcc3BFUtyR1psMu1VWzkKlqmmVuBX3GRE5VjW9B+HfS9W\nBuYOrr1oxr+S" +
       "Bbl6dw3BBbJQ0vV6Zdb1QyYjBU26EbJ1asofSI5d3ssUuFntS/eobWsJYkpb" +
       "8cbN\nFhXDTiqV/wDmCgpINQ0AAA==");
}
