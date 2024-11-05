package Proxy;

import java.util.Date;

public class Document implements IDocument {
    private String name;
    private String content;
    private Date created;


    public Document(String name, Date created, String content) {
        this.name = name;
        this.content = content;
        this.created = created;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public Date getCreated() {
        return created;
    }

    @Override
    public String getName() {
        return name;
    }
}
