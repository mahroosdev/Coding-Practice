// Parent class for Student and Librarian
public class Person {

    private int personId;
    private String name;


    // Constructor
    public Person(int personId, String name) {

        this.personId = personId;
        this.name = name;
    }


    // Getter for person ID
    public int getPersonId() {

        return personId;
    }


    // Getter for name
    public String getName() {

        return name;
    }


    // Displays common person information
    public void displayPersonInfo() {

        System.out.println("Person ID: " + personId);
        System.out.println("Name: " + name);
    }
}