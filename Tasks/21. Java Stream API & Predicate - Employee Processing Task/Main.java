import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = new ArrayList<>();

        employees.add(
                new Employee(
                        1,
                        "John",
                        28,
                        55000,
                        "HR"
                )
        );

        employees.add(
                new Employee(
                        2,
                        "Alice",
                        35,
                        75000,
                        "IT"
                )
        );

        employees.add(
                new Employee(
                        3,
                        "David",
                        32,
                        85000,
                        "IT"
                )
        );

        employees.add(
                new Employee(
                        4,
                        "Sarah",
                        29,
                        62000,
                        "Finance"
                )
        );

        employees.add(
                new Employee(
                        5,
                        "Michael",
                        40,
                        95000,
                        "IT"
                )
        );

        employees.add(
                new Employee(
                        6,
                        "Emma",
                        31,
                        68000,
                        "HR"
                )
        );

        employees.add(
                new Employee(
                        7,
                        "Daniel",
                        27,
                        45000,
                        "Finance"
                )
        );

        employees.add(
                new Employee(
                        8,
                        "Olivia",
                        38,
                        82000,
                        "Marketing"
                )
        );

        // Display all employees
        System.out.println("========== ALL EMPLOYEES ==========");

        employees.forEach(employee ->
                System.out.println(employee)
        );


        // --------------------------------------------------
        // TASK 01
        // Print employees whose salary is greater than 60000
        // using Predicate
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 01 ==========");
        System.out.println(
                "Employees with salary greater than 60000:"
        );

        Predicate<Employee> salaryPredicate =
                employee -> employee.getSalary() > 60000;

        employees.stream()
                .filter(salaryPredicate)
                .forEach(employee ->
                        System.out.println(employee)
                );


        // --------------------------------------------------
        // TASK 02
        // Print employees from IT department
        // and older than 30
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 02 ==========");
        System.out.println(
                "IT employees older than 30:"
        );

        Predicate<Employee> itEmployeePredicate =
                employee ->
                        employee.getDepartment()
                                .equalsIgnoreCase("IT")
                        && employee.getAge() > 30;

        employees.stream()
                .filter(itEmployeePredicate)
                .forEach(employee ->
                        System.out.println(employee)
                );


        // --------------------------------------------------
        // TASK 03
        // Count employees older than 30
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 03 ==========");

        long employeesAbove30 =
                employees.stream()
                        .filter(employee ->
                                employee.getAge() > 30
                        )
                        .count();

        System.out.println(
                "Number of employees older than 30: "
                        + employeesAbove30
        );


        // --------------------------------------------------
        // TASK 04
        // Find the highest-paid employee
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 04 ==========");

        Employee highestPaidEmployee =
                employees.stream()
                        .max(
                                (employee1, employee2) ->
                                        Double.compare(
                                                employee1.getSalary(),
                                                employee2.getSalary()
                                        )
                        )
                        .orElse(null);

        System.out.println("Highest-paid employee:");

        if (highestPaidEmployee != null) {

            System.out.println(highestPaidEmployee);
        }


        // --------------------------------------------------
        // TASK 05
        // Print employee names in uppercase
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 05 ==========");
        System.out.println(
                "Employee names in uppercase:"
        );

        employees.stream()
                .map(employee ->
                        employee.getName().toUpperCase()
                )
                .forEach(name ->
                        System.out.println(name)
                );


        // --------------------------------------------------
        // TASK 06
        // Calculate average salary
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 06 ==========");

        double averageSalary =
                employees.stream()
                        .mapToDouble(
                                employee ->
                                        employee.getSalary()
                        )
                        .average()
                        .orElse(0);

        System.out.println(
                "Average salary: "
                        + averageSalary
        );


        // --------------------------------------------------
        // TASK 07
        // Group employees by department
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 07 ==========");
        System.out.println(
                "Employees grouped by department:"
        );

        Map<String, List<Employee>> employeesByDepartment =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        employee ->
                                                employee.getDepartment()
                                )
                        );

        employeesByDepartment.forEach(
                (department, employeeList) -> {

                    System.out.println();
                    System.out.println(
                            "Department: " + department
                    );

                    employeeList.forEach(employee ->
                            System.out.println(
                                    "  " + employee
                            )
                    );
                }
        );


        // --------------------------------------------------
        // TASK 08
        // Sort employees by salary in descending order
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 08 ==========");
        System.out.println(
                "Employees sorted by salary "
                        + "in descending order:"
        );

        employees.stream()
                .sorted(
                        (employee1, employee2) ->
                                Double.compare(
                                        employee2.getSalary(),
                                        employee1.getSalary()
                                )
                )
                .forEach(employee ->
                        System.out.println(employee)
                );


        // --------------------------------------------------
        // TASK 09
        // Find the first employee whose salary
        // is greater than 80000
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 09 ==========");

        Employee firstEmployeeAbove80000 =
                employees.stream()
                        .filter(employee ->
                                employee.getSalary() > 80000
                        )
                        .findFirst()
                        .orElse(null);

        System.out.println(
                "First employee with salary greater than 80000:"
        );

        if (firstEmployeeAbove80000 != null) {

            System.out.println(
                    firstEmployeeAbove80000
            );
        } else {

            System.out.println(
                    "No employee found."
            );
        }


        // --------------------------------------------------
        // TASK 10
        // Find the second-highest salary
        // --------------------------------------------------

        System.out.println();
        System.out.println("========== TASK 10 ==========");

        Double secondHighestSalary =
                employees.stream()
                        .map(employee ->
                                employee.getSalary()
                        )
                        .distinct()
                        .sorted(
                                (salary1, salary2) ->
                                        Double.compare(
                                                salary2,
                                                salary1
                                        )
                        )
                        .skip(1)
                        .findFirst()
                        .orElse(null);

        if (secondHighestSalary != null) {

            System.out.println(
                    "Second-highest salary: "
                            + secondHighestSalary
            );

        } else {

            System.out.println(
                    "Second-highest salary could not be found."
            );
        }
    }
}