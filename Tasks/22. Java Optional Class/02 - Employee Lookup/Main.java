import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(
                new Employee(
                        1,
                        "John",
                        60000
                )
        );

        employees.add(
                new Employee(
                        2,
                        "Alice",
                        75000
                )
        );

        employees.add(
                new Employee(
                        3,
                        "David",
                        85000
                )
        );

        System.out.println("========== EMPLOYEE LOOKUP ==========");

        // Search for an existing employee
        Employee employee =
                findEmployee(employees, 2)
                        .orElse(
                                new Employee(
                                        0,
                                        "Default Employee",
                                        0
                                )
                        );

        System.out.println("Employee found:");
        System.out.println(employee);

        // Search for an employee who does not exist
        Employee missingEmployee =
                findEmployee(employees, 10)
                        .orElse(
                                new Employee(
                                        0,
                                        "Default Employee",
                                        0
                                )
                        );

        System.out.println();
        System.out.println(
                "Searching for employee ID 10:"
        );

        System.out.println(missingEmployee);
    }

    // Find employee by ID
    public static Optional<Employee> findEmployee(
            List<Employee> employees,
            int id) {

        for (Employee employee : employees) {

            if (employee.getId() == id) {

                return Optional.of(employee);
            }
        }

        return Optional.empty();
    }
}