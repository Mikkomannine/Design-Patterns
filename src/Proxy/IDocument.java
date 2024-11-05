package Proxy;

import java.util.Date;

public interface IDocument {
    String getContent(User user) throws AccessDeniedException;
    Date getCreated();
    String getName();
}
