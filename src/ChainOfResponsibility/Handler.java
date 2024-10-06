package ChainOfResponsibility;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleMessage(Message message) {
        if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }
}
