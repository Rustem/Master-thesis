package thesis;

import sj.runtime.*;
import sj.runtime.net.*;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

class Saas {
    final private java.lang.String _sjprotocol_p_sv =
      ("H4sIAAAAAAAAAIWQsUoDQRCGJ9FIRCshIJhoJSmU284mVQRB4mlCTutwXobL" +
       "Hpe9zc0kXECs9Uls\n7C3tLX0FLWx8Aws3d4nGIGSLhd35//nmn8dPKFAMhx" +
       "RYPNZI6R1dB+gxWYRE2a/TOEZfqkvz6HiQ\nnVweIImhutS66MrbUPB6Muwy" +
       "VG0KRKoTc27x4xaZu2bDmnZjVDyAW8gbaklH4dgPI56yM0Z9/+nK\n/njeyy" +
       "bb+UfTTAkd7+uoXHmtv6+vQM6Goo5IsowUw7Y9M4khy1C0ppVaonViFmUtTd" +
       "tGD+UIF0Mb\nzEbfyFw/LTGUfklZ1DRoMgmYS1EHS1EOqu4SzqRdcdZUa9O2" +
       "vLCVVuh6eBqFXYw73sPby83J2f1d\n2mdVuX0z6JYduCNXhK7yhcOxVL5ZBs" +
       "Mu95AkWafMuo2kI0XYcJoX5xlc0wS6yVD5oxsMkXhe9g1U\n+qb3gQIAAA==");
    final private static int OK = 1;
    
    public static void main(String[] argv) {
        try {
            new Saas(Integer.parseInt(argv[0]));
        }
        catch (IOException ioe) { ioe.printStackTrace(); }
    }
    
    final private SJProtocol p_sv =
      new sj.runtime.SJProtocol(this._sjprotocol_p_sv);
    
    public Saas(int portNumber) throws IOException {
        super();
        SJServerSocket server_sv = SJRServerSocket.create(p_sv, portNumber);
        SJSocket v3na_sv = null;
        {
            sj.runtime.net.SJSocket _sjtryreturned_0 = null;
            int _sjspawncount_v3na_sv = -1;
            try {
                v3na_sv = server_sv.accept();
                HttpRequestJSONMessage msg =
                  (HttpRequestJSONMessage) v3na_sv.receive();
                Map response = new LinkedHashMap();
                response.put("message", "Created.");
                response.put("status", "1");
                v3na_sv.send(
                  new HttpResponseJSONMessage(
                    JSONValue.toJSONString(response)));
            }
            catch (Exception e) { e.printStackTrace(); }
            finally {
                if (v3na_sv != null && v3na_sv != _sjtryreturned_0)
                    v3na_sv.close(_sjspawncount_v3na_sv);
            }
        }
    }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369132479000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVXXWxURRSevbvd0h/oDxSx/5QSKYRdfJCg9YGmAVm62NoC" +
       "Sg0us3dnt7fcvfcy\nM3e7oBKJCUVMTAw/aqLgAwmJ4cFA1AeNmoD/mpg+gC" +
       "8QFWNMFCIPBmIwembuvftzd6kkczs7c86Z\nM+d835nDuRuohlHUa5n6/oxu" +
       "8gjfbxEWGcOUkdSwjhnbDgsJ9ZEVd2e+nd3aEURNk6hJMyY45po6\nbBqc5P" +
       "kkasySbJJQNpRKkdQkajEISU0QqmFdOwCCpjGJWpmWMTC3KWHjhJl6Tgi2Mt" +
       "siVJ7pLcZR\no2oajFNb5SZlHDXHp3EOR22u6dG4xvhgHIXTGtFTbB86iAJx" +
       "VJPWcQYEl8a9W0SlxehmsQ7i9Rq4\nSdNYJZ5KaK9mpDjq8WsUbtw/AgKgWp" +
       "slfMosHBUyMCygVsclHRuZ6ASnmpEB0RrThlM4ar+nURBa\nYGF1L86QBEfL" +
       "/HJjzhZI1cmwCBWO2vxi0lKeonZfzkqyNRpu/Ofo2O1eRfqcIqou/K8BpW6f" +
       "0jhJ\nE0oMlTiKd+zI8dguu1NBCITbfMKOzNDKD3bEf/ukx5HpqCIzmpwmKk" +
       "+od9d3ds0N/VIXFG4ssEym\nCSiU3VxmdczdGcxbgMWlBYtiM+Jtfjr++a4X" +
       "3iG/K2hBDIVVU7ezRgzVESM17M5rYR7XDOKsjqbT\njPAYCulyKWzK3xCOtK" +
       "YTEY4QzC3Mp+Q8byHnXwDGgDtfKD4c1U5gzCJsGhznhHEWZVSN8inCNBZ1\n" +
       "t/LCyMKZQAD87/RzSQfgbTH1FKEJ9ez1r5/bNPLSEaWAJvd4jhockxFhEgUC" +
       "0tZ95bEQwU0JDvxx\nfrD5lbXsfQUFJ1Gdls3aHCd1AtzBum7OkFSCS/C0lA" +
       "BV4gPA1ZgEnAFkEzoYkriGy+co6vPjqcjC\nGMwwgGTu4L/f30zMXBCpF6la" +
       "Iqw7rkHg9zq+NQ5M7N6650hfUAjNhERMQbT//60n1JtHt124/M3V\nVUXcct" +
       "RfQadKTUEHv/tj1FRJCspN0fxrf2/581jNw+8pIvd1UGU4BmwAZbv9Z5TRYt" +
       "ArMSJYShw1\npE2axbrY8upCPZ+i5kxxReKhQc4XQQAaYNTAWOUCq0N8xGaz" +
       "+LQ46BHx9N1BFrA7L4bXXfmo4TOl\ntNY1lRTFCcId5rQU07GdEgLrV18fO3" +
       "bixuzTMhduMjgKW3ZS19S89K8tALlfXIXFkWVLjp8cePOK\nl+zFRetDlOL9" +
       "Itf5Q3Ndb3yB3wKGA9OYdoBIIgUKaffXmzGqZYHOObfevNp95tcL18eXKCVF" +
       "eUVF\nXSzVcQqzjFi9lYcTls93gpS+tGb5uYPj15JOwWotp9Qmw84+dPoHMr" +
       "CxUa1CyiA8HV6cxHe1nK8p\nuaP43crd6GhmJDa6Ka8SS5Qs6WWvqy4o5i8N" +
       "m8Uz5uEzm3z2r4un6nudeAuddnmEUiWMZYoJ9cDH\nO07d+Y5fkxcoAlvY6M" +
       "lXHrsTl3Buw+VcS/jd01kF1U6iZvn0YoPvxLotADQJjycbdhfjaGHZfvlD\n" +
       "6FT9wQJxO/15LDnWT6li0GEupMW81sei+2H0w1jksmiRj0WyYjocEA5FYvDq" +
       "Zwht/fntM7cPzW5Q\nBEZrcsJxiElzUe5xW/Quh8+d6Go4/uPLMvwis8LoRn" +
       "l4n/yudPgT5OC6ZmC4Ya1FtRzmEIcwk/1Q\nniNldEQIRx1Ki++jFnhmidlI" +
       "pTVFzB8Tny2gHLISLOchqo1NR6htcC1LIhNboZxxE149aTdfaQh5\nMCuitN" +
       "3boKjrXr2CJMjsU7caD+NLu8XVheKDHNVx01qrkxzRi+j1G9kmWyMvpU1P9v" +
       "y0ef3Z5/3w\nFUnpmVczobbkOp4ITmlfwnNWgE9Fb1auNFgOmnpKoLU0tpdB" +
       "p7sAnVYYq2E0udBpqlqAq2fnAfGJ\nzV8EKrsxWSKdInc+2H9L+XBpv3x2Qk" +
       "nMHBf9bWxll1rWfEof6wo36oTRN8+NPBSV4NzpVC3Lqn4X\n5MJF/H4GsJiF" +
       "GiI317oK62AxZ2opAVTRpIhHYVnFfxyc9lbtm9uz6qLV8pVzaa8FDUMfmLZ1" +
       "vZTu\nJfOwRUlakx6EHfJb8s8+YJjTHYlf1KpyOaf65P8D7qtdO9AMAAA=");
}
