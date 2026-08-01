// Librarian inherits properties and methods from Person
public class Librarian extends Person {

    // Constructor
    public Librarian(int personId, String name) {

        super(personId, name);
    }


    // Simple librarian method
    public void manageLibrary() {

        System.out.println(
            getName() + " is managing the library."
        );
    }
}