package Prototype;



public class Main {
    public static void main(String[] args) {
        Recommendation original = new Recommendation("Young Adults");
        original.addBook(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "Fantasy", 1997));
        original.addBook(new Book("Suzanne Collins", "The Hunger Games", "Dystopian", 2008));

        System.out.println("Original Recommendation:");
        System.out.println(original);

        System.out.println("Cloning the original recommendation...");
        Recommendation cloned = original.clone();
        cloned.setTargetAudience("Adults");
        cloned.addBook(new Book("George Orwell", "1984", "Dystopian", 1949));

        System.out.println("Cloned Recommendation:");
        System.out.println(cloned);

        System.out.println("Modifying the cloned recommendation...");
        cloned.removeBook(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "Fantasy", 1997));

        System.out.println("Modified Cloned Recommendation:");
        System.out.println(cloned);

        System.out.println("Original Recommendation remains unchanged:");
        System.out.println(original);
    }
}
