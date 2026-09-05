import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(
                new Book(
                        1,
                        "Java Programming",
                        "James"
                )
        );

        books.add(
                new Book(
                        2,
                        "Clean Code",
                        "Robert Martin"
                )
        );

        books.add(
                new Book(
                        3,
                        "Effective Java",
                        "Joshua Bloch"
                )
        );

        System.out.println("========== BOOK LIBRARY ==========");

        // Search for a book that exists
        Optional<Book> book =
                findBookByTitle(
                        books,
                        "Clean Code"
                );

        System.out.println();
        System.out.println(
                "Searching for: Clean Code"
        );

        book.ifPresent(
                foundBook ->
                        System.out.println(
                                "Book found: "
                                + foundBook
                        )
        );

        // Search for a book that does not exist
        Optional<Book> missingBook =
                findBookByTitle(
                        books,
                        "Python Programming"
                );

        System.out.println();
        System.out.println(
                "Searching for: Python Programming"
        );

        if (missingBook.isPresent()) {

            System.out.println(
                    "Book found: "
                    + missingBook.get()
            );

        } else {

            System.out.println(
                    "Book not found."
            );
        }
    }

    // Find a book by title
    public static Optional<Book> findBookByTitle(
            List<Book> books,
            String title) {

        for (Book book : books) {

            if (book.getTitle()
                    .equalsIgnoreCase(title)) {

                return Optional.of(book);
            }
        }

        return Optional.empty();
    }
}