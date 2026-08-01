public class FullTimeEmployee extends Employee {

    // Full-time employee field
    private double monthlySalary;


    // Constructor
    public FullTimeEmployee(
            String name,
            int id,
            double monthlySalary) {

        super(name, id);

        this.monthlySalary = monthlySalary;
    }


    // Returns the monthly salary
    public double calculateSalary() {

        return monthlySalary;
    }
}