public class StudentResultGenerator {

    public static void main(String[] args) {

        SharedReport report =
            new SharedReport();

        StudentThread student1 =
            new StudentThread(
                "Student 1",
                80,
                75,
                90,
                report
            );

        StudentThread student2 =
            new StudentThread(
                "Student 2",
                65,
                70,
                72,
                report
            );

        StudentThread student3 =
            new StudentThread(
                "Student 3",
                90,
                88,
                95,
                report
            );

        System.out.println(
            "===== Student Result Generator ====="
        );

        student1.start();
        student2.start();
        student3.start();

        System.out.println();

        System.out.println(
            "Student 1 Thread Alive: " +
            student1.isAlive()
        );

        System.out.println(
            "Student 2 Thread Alive: " +
            student2.isAlive()
        );

        System.out.println(
            "Student 3 Thread Alive: " +
            student3.isAlive()
        );

        try {

            student1.join();
            student2.join();
            student3.join();

        } catch (InterruptedException e) {

            System.out.println(
                "Main thread was interrupted."
            );
        }

        System.out.println();
        System.out.println(
            "===== Final Student Report ====="
        );

        System.out.println(
            report.getReport()
        );

        System.out.println(
            "All student threads completed."
        );
    }
}