public class Student {

    // Student attributes
    private int studentId;
    private String studentName;
    private String course;


    // Default constructor
    // Gives default values to the student
    public Student() {

        studentId = 0;
        studentName = "Not Assigned";
        course = "Not Assigned";
    }


    // Parameterized constructor
    // Gets values when the student object is created
    public Student(int id, String name, String studentCourse) {

        studentId = id;
        studentName = name;
        course = studentCourse;
    }


    // Copy constructor
    // Copies the details from another Student object
    public Student(Student otherStudent) {

        studentId = otherStudent.studentId;
        studentName = otherStudent.studentName;
        course = otherStudent.course;
    }


    // Method to display student details
    public void displayDetails() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println();
    }


    public static void main(String[] args) {

        // Student created using default constructor
        Student student1 = new Student();

        // Student created using parameterized constructor
        Student student2 = new Student(
            101,
            "Mahroos",
            "Software Engineering"
        );

        // Student created using copy constructor
        Student student3 = new Student(student2);


        System.out.println("Student 1 Details");
        student1.displayDetails();

        System.out.println("Student 2 Details");
        student2.displayDetails();

        System.out.println("Student 3 Details");
        student3.displayDetails();
    }
}