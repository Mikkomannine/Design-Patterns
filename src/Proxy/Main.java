package Proxy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("user1");
        User user2 = new User("user2");

        library.createProtectedDocument("doc1", new Date(), "This is a protected document.", "user1");
        Document unprotectedDocument = new Document("doc2", new Date(), "This is an unprotected document.");
        library.addDocument(unprotectedDocument);

        try {
            IDocument doc1 = library.getDocument("doc1");
            System.out.println("Content of doc1 for user1: " + doc1.getContent(user1));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            IDocument doc1 = library.getDocument("doc1");
            System.out.println("Content of doc1 for user2: " + doc1.getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            IDocument doc2 = library.getDocument("doc2");
            System.out.println("Content of doc2 for user1: " + doc2.getContent(user1));
            System.out.println("Content of doc2 for user2: " + doc2.getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
