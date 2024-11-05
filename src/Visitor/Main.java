package Visitor;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");
        File file1 = new File("file1.pdf", 10);
        File file2 = new File("file2.jpg", 20);
        File file3 = new File("file3.pdf", 30);
        File file4 = new File("file4.jpg", 40);
        File file5 = new File("file5.png", 50);
        File file6 = new File("file6.html", 60);

        root.add(dir1);
        root.add(dir2);
        dir1.add(file1);
        dir1.add(file2);
        dir1.add(file3);
        dir2.add(file4);
        dir2.add(file5);
        dir2.add(file6);

        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getSize());

        SearchVisitor searchVisitor = new SearchVisitor("pdf");
        root.accept(searchVisitor);
        System.out.println("Found elements: " + searchVisitor.getFound());
    }
}
