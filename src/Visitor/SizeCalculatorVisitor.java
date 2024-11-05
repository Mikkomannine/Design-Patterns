package Visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {

    private int size;

    public SizeCalculatorVisitor() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        size += directory.getSize();
    }
}
