package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private String name;

    private List<FileSystemElement> children;


    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(FileSystemElement element) {
        children.add(element);
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    public int getSize() {
        int size = 0;
        for (FileSystemElement element : children) {
            size += element.getSize();
        }
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
