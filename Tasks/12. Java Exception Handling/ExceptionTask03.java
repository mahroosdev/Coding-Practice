import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter the student's age: ");
            int age = input.nextInt();

            if (age < 18) {

                throw new IllegalArgumentException(
                    "The student must be at least 18 years old."
                );
            }

            System.out.println(
                "The student meets the age requirement."
            );

        } catch (IllegalArgumentException exception) {

            System.out.println(
                "Error: " + exception.getMessage()
            );

        } catch (InputMismatchException exception) {

            System.out.println(
                "Error: Please enter a valid age."
            );
        }

        input.close();
    }
}