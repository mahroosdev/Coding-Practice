public class PrinterServiceMain {

    public static void main(String[] args) {

        PrinterService printer =
            new PrinterService();

        EmployeeThread employee1 =
            new EmployeeThread(
                "Employee 1",
                printer,
                "Report.pdf"
            );

        EmployeeThread employee2 =
            new EmployeeThread(
                "Employee 2",
                printer,
                "Invoice.pdf"
            );

        EmployeeThread employee3 =
            new EmployeeThread(
                "Employee 3",
                printer,
                "Project.pdf"
            );

        // Give Employee 2 higher priority
        employee2.setPriority(
            Thread.MAX_PRIORITY
        );

        System.out.println(
            "===== Printer Service ====="
        );

        System.out.println(
            "Employee 1 Priority: " +
            employee1.getPriority()
        );

        System.out.println(
            "Employee 2 Priority: " +
            employee2.getPriority()
        );

        System.out.println(
            "Employee 3 Priority: " +
            employee3.getPriority()
        );

        System.out.println();

        employee1.start();
        employee2.start();
        employee3.start();

        try {

            employee1.join();
            employee2.join();
            employee3.join();

        } catch (InterruptedException e) {

            System.out.println(
                "Main thread was interrupted."
            );
        }

        System.out.println(
            "All print jobs completed."
        );
    }
}