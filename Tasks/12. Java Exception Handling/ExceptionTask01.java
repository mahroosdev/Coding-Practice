import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter the first integer: ");
            int firstNumber = input.nextInt();

            System.out.print("Enter the second integer: ");
            int secondNumber = input.nextInt();

            int result = firstNumber / secondNumber;

            System.out.println("Division result: " + result);

        } catch (ArithmeticException exception) {

            System.out.println(
                "Error: A number cannot be divided by zero."
            );

        } catch (InputMismatchException exception) {

            System.out.println(
                "Error: Please enter integers only."
            );
        }

        input.close();
    }
}