public class LibraryManagementMain {

    public static void main(String[] args) {

        // ---------------------------------
        // Encapsulation demonstration
        // ---------------------------------

        Book book1 = new Book(
                101,
                "Java Programming",
                "John Smith",
                2500
        );

        // Update values using setter methods
        book1.setTitle("Java Programming for Beginners");
        book1.setPrice(2800);


        System.out.println("Book Details");

        // Display values using getter methods
        System.out.println("Book ID: " + book1.getBookId());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());


        System.out.println();


        // ---------------------------------
        // Interface demonstration using Book
        // ---------------------------------

        book1.borrowItem();
        book1.returnItem();


        System.out.println();


        // ---------------------------------
        // Inheritance demonstration
        // ---------------------------------

        Student student = new Student(
                201,
                "Mahroos"
        );

        Librarian librarian = new Librarian(
                301,
                "Aisha"
        );


        System.out.println("Student Details");

        student.displayPersonInfo();
        student.borrowItem();
        student.returnItem();


        System.out.println();


        System.out.println("Librarian Details");

        librarian.displayPersonInfo();
        librarian.manageLibrary();


        System.out.println();


        // ---------------------------------
        // Runtime polymorphism demonstration
        // ---------------------------------

        LibraryItem item = new Book(
                102,
                "Object-Oriented Programming",
                "David Brown",
                3200
        );

        System.out.println("Runtime Polymorphism");

        item.displayInfo();
    }
}