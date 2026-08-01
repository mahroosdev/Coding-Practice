// Book extends LibraryItem and implements Borrowable
public class Book extends LibraryItem implements Borrowable {

    // Private attributes demonstrate encapsulation
    private int bookId;
    private String title;
    private String author;
    private double price;


    // Parameterized constructor
    public Book(
            int bookId,
            String title,
            String author,
            double price) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    // Getter for book ID
    public int getBookId() {

        return bookId;
    }


    // Setter for book ID
    public void setBookId(int bookId) {

        this.bookId = bookId;
    }


    // Getter for title
    public String getTitle() {

        return title;
    }


    // Setter for title
    public void setTitle(String title) {

        this.title = title;
    }


    // Getter for author
    public String getAuthor() {

        return author;
    }


    // Setter for author
    public void setAuthor(String author) {

        this.author = author;
    }


    // Getter for price
    public double getPrice() {

        return price;
    }


    // Setter for price
    public void setPrice(double price) {

        this.price = price;
    }


    // Implements the abstract method from LibraryItem
    @Override
    public void displayInfo() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }


    // Implements Borrowable interface
    @Override
    public void borrowItem() {

        System.out.println("Book borrowed: " + title);
    }


    // Implements Borrowable interface
    @Override
    public void returnItem() {

        System.out.println("Book returned: " + title);
    }
}