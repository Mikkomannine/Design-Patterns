package ChainOfResponsibility;

public class CompensationClaimHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Handling compensation claim: " + message.getContent());
        } else {
            super.handleMessage(message);
        }
    }
}