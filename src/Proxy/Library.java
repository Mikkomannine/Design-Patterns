package Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, IDocument> documents = new HashMap<>();

    public void addDocument(IDocument document) {
        documents.put(document.getName(), document);
    }

    public IDocument getDocument(String name) {
        return documents.get(name);
    }

    public void createProtectedDocument(String name, Date creationDate, String content, String... allowedUsers) {

        Document document = new Document(name, creationDate, content);
        DocumentProxy proxy = new DocumentProxy(document);

        for (String user : allowedUsers) {
            AccessControlService.getInstance().grantAccess(name, user);
        }

        addDocument(proxy);
    }
}
