package Proxy;

import java.util.Date;

public class DocumentProxy implements IDocument {
    private final Document document;

    public DocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(document.getName(), user.getUsername())) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }

    @Override
    public Date getCreated() {
        return document.getCreated();
    }

    @Override
    public String getName() {
        return document.getName();
    }
}
