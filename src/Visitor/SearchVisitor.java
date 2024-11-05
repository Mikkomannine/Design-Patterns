package Visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {

    private String searchName;
    private List<FileSystemElement> found;

    public SearchVisitor(String searchName) {
        this.searchName = searchName;
        found = new ArrayList<>();
    }

    public String getFound() {
        StringBuilder sb = new StringBuilder();
        for (FileSystemElement element : found) {
            sb.append(element.getName()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchName)) {
            found.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getChildren()) {
            element.accept(this);
        }
    }
}
