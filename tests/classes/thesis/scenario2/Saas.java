package thesis.scenario2;

import sj.runtime.*;
import sj.runtime.net.*;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

class Saas
{
    final private java.lang.String
      _sjprotocol_p_msg =
      ("H4sIAAAAAAAAAIVRPU/jQBAdHMK3+MiJExI5USEKJBtR0KTgUlwEwRAkQx02" +
       "m1XsaOM1uwM40unq\nu19yDT0lQtddd5S0UNDwDyiYtcNxh5Cw7LG8M++9ec" +
       "/nD1A0GtZM18V+IkxWVasrOBrXCGPy06De\nOMGWZjEPD+igySG/hhwY8qHI" +
       "GY0ifPC77JR5JxhJb4uZcJcllVTDyrvkrzkdyxlGso2w4puul815\n/6C9v2" +
       "gvR1d8GEmYFjEewzcokOp8omS/IxUOtHON6vLFoX9/ueQA0MziGzONTKHJHz" +
       "fKn66rd+MF\n63AsUSbCSMUIC/4zKDe6P+hU0iShm8Kcsym4tukOUiiO3lz9" +
       "+nj0pwBODSakYu0a46j0NoxjqIUJ\nlWynyebnzP/U2RjVWXocIpuh8DKqoO" +
       "6zlpD/BV+QrIVQymOXLO54Aeoo7tAuCE5jh/Cr74YfiLj9\nxk+d7NEM6wjb" +
       "Qph/cZ3HnoWe2rAdsm3fo6RWfhXovmRcbJE7oZv85+3vr192fnzP6Idj1hMW" +
       "Nml3\nLWMoTER7cREzHal1tx409nbzDYwdm0AYrlW3/exj+lnSllL6BEirNi" +
       "fFAgAA");
    final private java.lang.String
      _sjprotocol_p_sv =
      ("H4sIAAAAAAAAAIWRv28TMRSAXy4NTaEIWiggEcSEOlDdIYYuHSBIRG3qkoqD" +
       "OTiOdefItc3ZLVcJ\nMcNfwsLOiBAbG4ysMLDwHzDw7AuBRpXupLPlez++9/" +
       "ne/YKWLWDDTmJ3bLgNqx5NOHM2ttza6mva\nf8AzoZ7gYcigehoRQFnAem3p" +
       "fFVEoMVyIccO1omdJCEv+a86mVUnVfUWgTOGFly55/AKIqSuGS2P\nM6ndlF" +
       "0xurfePyU/P9ysJrt+Ss4gEIbs92bnxtfuj6UmNAi0jbbCCa0cXCN/i5JDJ2" +
       "SyP41slcaU\neFFxre1jzrg44vPSiDl3gGk0CyEHa/9IlWoQLb1gA1F+XzRI" +
       "RWhnTmRfUsa3tRzzYsjefv/88uHu\nm9cBsaDoAfZeJRN6RBNJVZakrhAqw/" +
       "kddFzOrcBxGVe0EPpu3E8Hj/aqqTzoTq3d4NCNCqpYfopf\ni1FMdXCpoof7" +
       "26Y236Nm5hV8Vnw89vF4Gm8tfvv46cqzL02IenBWajruUeZ0sQNLLi+4zVG2" +
       "NPfu\nB9ryizauF/GNsNkFnDm0SvuEjrg8MVJT0pEnL3v9aLCL+bdrHVOuxj" +
       "W/z/dsz5z8vuKX8+G3XXaw\n0OvukHC4eiJemj+RqLi6cQMAAA==");
    final private static int
      OK =
      1;
    
    public static void
      main(
      String[] argv) {
        try {
            new Saas(
              Integer.
                parseInt(
                argv[0]));
        }
        catch (IOException ioe) {
            ioe.
              printStackTrace();
        }
    }
    
    final private SJProtocol
      p_msg =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_msg);
    final private SJProtocol
      p_sv =
      new sj.runtime.SJProtocol(
      this.
        _sjprotocol_p_sv);
    
    private boolean
      verify_msg(
      JSONMessage params) {
        return 1 ==
          1;
    }
    
    private boolean
      validate_msg(
      JSONMessage params) {
        return true;
    }
    
    private JSONMessage
      genResponse(
      String status,
      String message) {
        Map m =
          new LinkedHashMap(
          );
        m.
          put(
          "status",
          status);
        m.
          put(
          "message",
          message);
        return JSONMessage.
                 create(
                 JSONValue.
                   toJSONString(
                   m));
    }
    
    public Saas(int portNumber)
          throws IOException {
        super();
        SJServerSocket server_sv =
          SJRServerSocket.
            create(
            p_sv,
            portNumber);
        SJSocket v3na_sv =
          null;
        SJSocket v3na_user_socket =
          null;
        {
            sj.runtime.net.SJSocket _sjtryreturned_0 =
              null;
            int _sjspawncount_v3na_sv =
              -1;
            int _sjspawncount_v3na_user_socket =
              -1;
            try {
                v3na_sv =
                  server_sv.
                    accept();
                v3na_user_socket =
                  v3na_sv.
                    receiveSession(
                    ("H4sIAAAAAAAAAIVRPU/jQBAdHMK3+MiJExI5USEKJBtR0KTgUlwEwRAkQx02" +
                     "m1XsaOM1uwM40unq\nu19yDT0lQtddd5S0UNDwDyiYtcNxh5Cw7LG8M++9ec" +
                     "/nD1A0GtZM18V+IkxWVasrOBrXCGPy06De\nOMGWZjEPD+igySG/hhwY8qHI" +
                     "GY0ifPC77JR5JxhJb4uZcJcllVTDyrvkrzkdyxlGso2w4puul815\n/6C9v2" +
                     "gvR1d8GEmYFjEewzcokOp8omS/IxUOtHON6vLFoX9/ueQA0MziGzONTKHJHz" +
                     "fKn66rd+MF\n63AsUSbCSMUIC/4zKDe6P+hU0iShm8Kcsym4tukOUiiO3lz9" +
                     "+nj0pwBODSakYu0a46j0NoxjqIUJ\nlWynyebnzP/U2RjVWXocIpuh8DKqoO" +
                     "6zlpD/BV+QrIVQymOXLO54Aeoo7tAuCE5jh/Cr74YfiLj9\nxk+d7NEM6wjb" +
                     "Qph/cZ3HnoWe2rAdsm3fo6RWfhXovmRcbJE7oZv85+3vr192fnzP6Idj1hMW" +
                     "Nml3\nLWMoTER7cREzHal1tx409nbzDYwdm0AYrlW3/exj+lnSllL6BEirNi" +
                     "fFAgAA"));
                JSONMessage req_params =
                  (JSONMessage)
                    v3na_sv.
                      receive();
                boolean allowed =
                  this.
                    verify_msg(
                    req_params) &&
                  this.
                    validate_msg(
                    req_params);
                if (allowed) {
                    {
                        v3na_user_socket.
                          outlabel(
                          "OK");
                        v3na_user_socket.
                          send(
                          this.
                            genResponse(
                            "1",
                            "USER CREATED. Email has been sent."));
                    }
                } else {
                    {
                        v3na_user_socket.
                          outlabel(
                          "FAIL");
                        v3na_user_socket.
                          send(
                          this.
                            genResponse(
                            "0",
                            "FAILED."));
                    }
                }
            }
            catch (Exception e) {
                e.
                  printStackTrace();
            }
            finally {
                if (v3na_sv !=
                      null &&
                      v3na_sv !=
                      _sjtryreturned_0)
                    v3na_sv.
                      close(
                      _sjspawncount_v3na_sv);
                if (v3na_user_socket !=
                      null &&
                      v3na_user_socket !=
                      _sjtryreturned_0)
                    v3na_user_socket.
                      close(
                      _sjspawncount_v3na_user_socket);
            }
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.2.3";
    final public static long
      jlc$SourceLastModified$jl =
      1369153595000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJVXa2wUVRS+++iWtgt9QBFL35TwSneRKEHrD2otsu1CSxdQ" +
       "ashyd/budtrZmXHu\nne0WtZGYUNTESCg+EgV/kJAYfhiI+kOjJuBbE9Mf4B" +
       "+IijEmCpEfBmIweu6d2dfs0uIm9+6dO+ec\nex7fOffMmWuoghqoXdeUqaSi" +
       "sQCb0gkNDGODknifgindDRtR6aFVtye/nRlY6UG1o6hWViMMM1nq\n01RGMm" +
       "wU+VMkFSMG7Y3HSXwU1auExCPEkLEiHwRCTR1FDVROqpiZBqEjhGpKmhM2UF" +
       "MnhjgzuxlG\nfklTKTNMiWkGZaguPI7TOGgyWQmGZcp6wsiXkIkSp0+haeQK" +
       "o4qEgpNAuDyctSIoJAa38X0gr5ZB\nTSOBJZJl8U7IapyhNidHzuKuQSAA1s" +
       "oUYWNa7iivimEDNVgqKVhNBiPMkNUkkFZoJpzCUNMdhQLR\nIh1LEzhJogyt" +
       "cNINW6+Aqkq4hbMw1OgkE5IyBmpyxKwgWkM+/z8vDt9sdwud40RSuP4VwNTq" +
       "YBoh\nCWIQVSIW4y0zMBvaZza7EQLiRgexRdO7+oM94d8+abNoVpahGYqNE4" +
       "lFpdubm1vmen+p8nA1Fuka\nlTkUiiwXUR223/RkdMDi8pxE/jKQffnpyOf7" +
       "nnuH/O5Gi0LIJ2mKmVJDqIqo8T57XQnrsKwSa3co\nkaCEhZBXEVs+TTyDOx" +
       "KyQrg7vLDWMRsT64yOrJ8LRr+9XswnhiojGNMAHWeokxHKaJAaUpCNESrD\n" +
       "UiIqNmRtU9AmynBxiyddLrCk2ZlVCkBwu6bEiRGVTl/9+pn+wReOuHO4shWB" +
       "kFvCAznhAS4cuVxC\n6j3F/uEOj/O8+ONsT93L3fR9N/KMoio5lTIZjikE8g" +
       "krijZJ4lEmAFVfAF6BGQCcPwbYAxhHFRAk\nsA4OSRuo04mxfGaGYIUBOHPT" +
       "/35/PTp5jsOBh28Zl26pBsGYsHTzr4vsHzhwpNPDiSa93M9A2rWw\n9Kh0/c" +
       "Ud5y5+c3ltHssMdZWkWCknTxGn+sOGJpE4lKC8+Nf+3v7nsYoH33NzPFRB5W" +
       "EY8AJp3Oo8\noyhVerJlhzvLHUY1Cc1IYYW/ytaKajZmaJP5HYGMGrFeAg6o" +
       "gVEB41EbbN184i/r+FRv4Yj702GD\nKGq3nvdtvPRRzWfuwvpXW1AoI4RZ2V" +
       "SfD8dugxDYv/z68LHj12aeFLGwg8GQTzdjiixlhH6NLoj9\n0jKZHVixbPbV" +
       "dW9eygZ7aV56r2HgKR7rzKG5lje+wG9B1kP2UfkgEcnlyoXdWYOGDTkFKZ62" +
       "a9DR\n1lO/nrs6ssxdUKhXldTKQh6rWAuPVesZOKFjvhME9YUNHWemR67ErC" +
       "LWUJxS/aqZeuDkD2TdVr9U\nJj09cJ1k/cTn9WK9ocBG/tzAbO/IWiA01J+R" +
       "iM7LmNCy3WbnKeYsEtv41ZbFZyr29F/nT1S3W/7m\nPE3iCE8ZNxYxRqWDH+" +
       "85ces7dkUYkAc2l9GWKT12Ly7IuS0X0/W+d0+m3KhyFNWJ6xirbC9WTA6g\n" +
       "UbhQaZ+9GUaLi94XX47WTdCTS9xmZxwLjnWmVN7psObUfF3pyKJ7YXTBWGJn" +
       "0RJHFomKaeUAVygQ\ngk4gSYyGn98+dfPQzBY3x2hFmisOPqnL0+00eT9z+M" +
       "zxlprZH18S7ueR5UK3isM7xbzayh8PA9Vl\nFYOFlbohpzEDP/io6JEyDLmH" +
       "Bjlx0EppPj+sg2Y6Xw2WSnPz9WN82g7MFXo0RZNZSDXS8YBhqkxO\nkUBkAO" +
       "oZ0+AqLCd410KCvXqUpvnDkGDPlNKjLEzzKG/KvjBQy536D5FgM0/c8B/GF/" +
       "Zz13HG+xiq\nYprerZA0UfLodwrZIdqtLCRqH2/7advm08864e+F49vm5YxK" +
       "9emVuzxj8pdwHebgV9LvFTP1FIOu\n2iDQrqq7i6DXmoNeA4z1MGpt6NWWLe" +
       "Dlg7CGT6H5i0hphydKrFUkz3q6brg/XN4lri1vDFNLRWdr\nXNr5FjW0Qseq" +
       "nEXNMDrnsSgLwoI8sbpfXdfL24JsuPDnGEAuBTVIvOy2GTbCZlqTLX0O5DTx" +
       "w9gE\no8PWpOPufOuysH03tbm5pMcaiAzt3EEohRZ8YWPguq1OwwdOYiqXnQ" +
       "UmVcY0TSFYLWPV/XbBQtl/\np1V8MuezgD9OLazhIYb8UNjkOBQjriPfmy6j" +
       "0CMw1tgKrfl/CrnzgJ4Q08JaHWGoJklU+NjT4dYg\nli2AAd7g8oZiRcmHqP" +
       "W5JHXOHVh7Xq//ygJ89pPGB98VCVNRCq+KgrVPN0hCFgf7rItDF39HAcPO\n" +
       "+EN9yq2F6q9YtLNQyS1a/nRcL5ME1i2X+Q/HU/WPTA8AAA==");
}
