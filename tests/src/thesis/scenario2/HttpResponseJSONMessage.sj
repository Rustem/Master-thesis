package thesis.scenario2;
class HttpResponseJSONMessage extends JSONMessage {
    public HttpResponseJSONMessage(String msg) throws MessageFormatException{
        super(msg);
        if(!verify_msg(msg)) {
            throw new MessageFormatException("Wrong message format");
        }
    }
    private boolean verify_msg(String msg) {
        return true;
    }
}