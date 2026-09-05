import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(
                new Student(1, "John")
        );

        students.add(
                new Student(2, "Alice")
        );

        students.add(
                new Student(3, "David")
        );

        // Search for an existing student
        Optional<Student> student =
                findStudentById(students, 2);

        System.out.println("========== STUDENT SEARCH ==========");

        if (student.isPresent()) {

            System.out.println(
                    "Student found: "
                    + student.get().getName()
            );

        } else {

            System.out.println("Student not found");
        }

        // Search for a student who does not exist
        Optional<Student> missingStudent =
                findStudentById(students, 10);

        System.out.println();
        System.out.println("Searching for student ID 10:");

        if (missingStudent.isPresent()) {

            System.out.println(
                    "Student found: "
                    + missingStudent.get().getName()
            );

        } else {

            System.out.println("Student not found");
        }
    }

    // Find a student by ID
    public static Optional<Student> findStudentById(
            List<Student> students,
            int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                return Optional.of(student);
            }
        }

        return Optional.empty();
    }
}