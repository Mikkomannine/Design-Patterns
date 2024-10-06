package ChainOfResponsibility;

public class ContactRequestHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request received: " + message.getContent());
        } else {
            super.handleMessage(message);
        }
    }
}
