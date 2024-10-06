package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler compensationHandler = new CompensationClaimHandler();
        Handler contactHandler = new ContactRequestHandler();
        Handler suggestionHandler = new DevelopmentSuggestionHandler();
        Handler feedbackHandler = new GeneralFeedbackHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(suggestionHandler);
        suggestionHandler.setNextHandler(feedbackHandler);

        Message message1 = new Message(MessageType.COMPENSATION_CLAIM, "I want a refund for my purchase.", "customer1@example.com");
        Message message2 = new Message(MessageType.CONTACT_REQUEST, "Please contact me regarding my order.", "customer2@example.com");
        Message message3 = new Message(MessageType.DEVELOPMENT_SUGGESTION, "I suggest adding a new feature.", "customer3@example.com");
        Message message4 = new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "customer4@example.com");

        compensationHandler.handleMessage(message1);
        compensationHandler.handleMessage(message2);
        compensationHandler.handleMessage(message3);
        compensationHandler.handleMessage(message4);
    }
}
