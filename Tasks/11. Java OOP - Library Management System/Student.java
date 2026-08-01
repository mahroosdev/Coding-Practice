// Student inherits Person and implements Borrowable
public class Student extends Person implements Borrowable {

    // Constructor
    public Student(int personId, String name) {

        super(personId, name);
    }


    // Student borrowing method
    @Override
    public void borrowItem() {

        System.out.println(
            getName() + " borrowed a library item."
        );
    }


    // Student returning method
    @Override
    public void returnItem() {

        System.out.println(
            getName() + " returned a library item."
        );
    }
}