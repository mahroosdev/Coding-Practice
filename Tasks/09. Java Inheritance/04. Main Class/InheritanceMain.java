public class InheritanceMain {

    public static void main(String[] args) {

        // Create a full-time employee object
        FullTimeEmployee fullTimeEmployee =
                new FullTimeEmployee(
                        "Mahroos",
                        101,
                        50000
                );


        // Create a part-time employee object
        PartTimeEmployee partTimeEmployee =
                new PartTimeEmployee(
                        "Ahmed",
                        102,
                        80,
                        250
                );


        // Display full-time employee details
        System.out.println("Full-Time Employee Details");

        fullTimeEmployee.displayInfo();

        System.out.println(
                "Monthly Salary: "
                + fullTimeEmployee.calculateSalary()
        );


        System.out.println();


        // Display part-time employee details
        System.out.println("Part-Time Employee Details");

        partTimeEmployee.displayInfo();

        System.out.println(
                "Hours Worked Salary: "
                + partTimeEmployee.calculateSalary()
        );
    }
}