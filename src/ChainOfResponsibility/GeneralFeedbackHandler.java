package ChainOfResponsibility;

public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Handling general feedback: " + message.getContent());
        } else {
            super.handleMessage(message);
        }
    }
}
