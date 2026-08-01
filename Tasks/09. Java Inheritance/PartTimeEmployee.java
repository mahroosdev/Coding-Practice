public class PartTimeEmployee extends Employee {

    // Part-time employee fields
    private double hoursWorked;
    private double hourlyRate;


    // Constructor
    public PartTimeEmployee(
            String name,
            int id,
            double hoursWorked,
            double hourlyRate) {

        super(name, id);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    // Calculates salary using hours worked and hourly rate
    public double calculateSalary() {

        double salary = hoursWorked * hourlyRate;

        return salary;
    }
}