public class Employee {

    // Common employee fields
    private String name;
    private int id;


    // Constructor
    public Employee(String name, int id) {

        this.name = name;
        this.id = id;
    }


    // Displays common employee information
    public void displayInfo() {

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}