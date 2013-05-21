package thesis;

class HttpResponseJSONMessage extends JSONMessage {
    
    public HttpResponseJSONMessage(String msg) throws MessageFormatException {
        super(msg);
        if (!verify_msg(msg)) {
            throw new MessageFormatException("Wrong message format");
        }
    }
    
    private boolean verify_msg(String msg) { return true; }
    
    final public static String jlc$CompilerVersion$jl = "2.2.3";
    final public static long jlc$SourceLastModified$jl = 1369130326000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVWS2wbRRge27ETJ4bEadJGeTdNpaZRbC5UgnAgihIlqUNM" +
       "XNQ2qHLXu2Nnk/Hu\nMjNrOwUiEBIpPSChlpfE44JUCfVEBFyQQGp5c0A5UC" +
       "5FQkUICVrBAVGhIvhndv3IOgmWdj078z/n\n/75/5sotFGQUDVomWcsRk8f4" +
       "moVZLKlQhrVJojB2AibS6oOH7ha/2ZjrCaDWJdSqGymucF2dNA2O\nS3wJRf" +
       "I4n8GUTWga1pZQ1MBYS2GqK0Q/B4KmsYTamZ4zFG5TzBYxM0lBCLYz28JU+i" +
       "xPJlBENQ3G\nqa1ykzKO2hIrSkGJ21wn8YTO+HgChbI6Jhp7Aq0jXwIFs0TJ" +
       "geD+RDmLuLQYnxbzIN6sQ5g0q6i4\nrNKwqhsaRwNejUrGw8dBAFQb85gvmx" +
       "VXDYYCE6jdCYkoRi6e4lQ3ciAaNG3wwlH3rkZBqMlS1FUl\nh9McdXnlks4S" +
       "SIXltggVjjq9YtJSiaJuT81qqrUQivxzIfnXoF/GrGGViPiDoNTvUVrEWUyx" +
       "oWJH\n8Y4duzR72u71IwTCnR5hR2bi8IePJX75eMCR6dlBZiGzglWeVu8e6+" +
       "3bmvgpHBBhNFkm0wUUtmUu\nq5p0V8ZLFmBxf8WiWIyVFz9Z/Oz0M+/iX/2o" +
       "aRaFVJPYeWMWhbGhTbrjRhgndAM7swvZLMN8FjUQ\nORUy5TdsR1YnWGxHA4" +
       "wthS/LcclCzs8HT8Qd+8ULCjrDuQXwtACWeC618Mg8ZgwKFWMrHI1yzDiL\n" +
       "M6rG+TJmOovvLl0Sru4p+nyQZa+XcQTgOWMSDdO0evnmV09NHX/hvL+COTdI" +
       "jvodL7FdvCCfT5o/\nsH0TRVU0QZ7f3htve3GMfeBHgSUU1vN5mysZgoF0Ci" +
       "FmEWtpLlEXrUG4BBagMpIBgALW0wQMSULA\nrhUoGvICsUrfWRgpgK6t9X+/" +
       "vZ0ubgrMiBp3COtOaFCxVSe2yEjqzNzZ80MBIVRsEMUA0eH/t55W\nb1+Y3/" +
       "zu6xtHqoDnaLiOh/Wagkfe8JPUVLEGfapq/tW/Z36/GHzgfb8ATRjaE1cAVM" +
       "D1fq+PbXwa\nL/cmsVn+BGrJmjSvELFUbijNfJmaxeqMhEiLHN8LG9ACTxCe" +
       "JheRAfESi23iFXUAJfbTk4PsfHee\nC913/aOWT/21TbK1ppumMHcoF62W4w" +
       "TFGOZvvJa8+PKtjcdlLdxicBSy7AzR1ZKMr9MHtd+3A/1j\nXR2XXhl543q5" +
       "2Puq1icoVdZErUvPbvW9/rnyJrQGoCjTz2HJQJ9bdmG/HVq/1BQgjDlttuxZ" +
       "vI/K\n8Wi9Vp9LEZcS02LT+VRJxZboI3LPBl1DAr5eJk6Ls6Vc+3zmyT+vvt" +
       "U86OQidLqlM+QYGJLvw1bt\nXCeqRlcRpqhvt3Ytj5qNU39EnleunXGaavt2" +
       "9k4Zdv7+t7/HIw9H1B1aQpib1hjBBUyqSXm9zctj\nrJxV68mBH6ePXX7am5" +
       "Xg28Cemmk1Wuh5NLCsfwEdpEK1unN0u9J4bcSAeYrhGmCI3MVMo6xIfwXz\n" +
       "ovsehSfsYj68I+brdh/g2WhRvaDAjWQvlIjPsZ0lkFst8T3FUXMBbjDZtXSe" +
       "5Vj9yZmkeh4OpoJ7\ncr7U/87PmzcXO/w114tDdSd8rY5zxZDOmi2BkIN7eZ" +
       "DS10YPXllf/CHjd4N8CHLOmCbBilHi6MAu\nZ4LgYFfdBc+5hqhDW2ePXLWi" +
       "X8rWVrkqhOC8ztqE1FSttoIhi+KsLkMIOR3Lkn8noUU45BNfp6wy\nI9tdRt" +
       "YEVfoPww4rZHoKAAA=");
}
