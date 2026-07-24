import java.util.Scanner;

public class OperatorsTask08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        double marks = input.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 65) {
            System.out.println("Grade: B");
        } else if (marks >= 55) {
            System.out.println("Grade: C");
        } else if (marks >= 35) {
            System.out.println("Grade: S");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}