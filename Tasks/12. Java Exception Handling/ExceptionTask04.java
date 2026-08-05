import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask04 {

    // This method declares that it may throw an exception
    public static void checkPositiveNumber(int number)
            throws Exception {

        if (number < 0) {

            throw new Exception(
                "Negative numbers are not allowed."
            );

        } else if (number == 0) {

            System.out.println(
                "Zero is not a positive number."
            );

        } else {

            System.out.println(
                number + " is a positive number."
            );
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // Calling the method that may throw an exception
            checkPositiveNumber(number);

        } catch (InputMismatchException exception) {

            System.out.println(
                "Error: Please enter a valid integer."
            );

        } catch (Exception exception) {

            System.out.println(
                "Error: " + exception.getMessage()
            );
        }

        input.close();
    }
}