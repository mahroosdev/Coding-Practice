import java.util.Scanner;

public class OperatorsTask06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        double marks = input.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
        } else if (marks >= 50) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }

        input.close();
    }
}