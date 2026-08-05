import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter the first number: ");
            int firstNumber = input.nextInt();

            System.out.print("Enter the second number: ");
            int secondNumber = input.nextInt();

            int result = firstNumber / secondNumber;

            System.out.println("Division result: " + result);

        } catch (ArithmeticException exception) {

            System.out.println(
                "Error: Division by zero is not allowed."
            );

        } catch (InputMismatchException exception) {

            System.out.println(
                "Error: Please enter valid integer numbers."
            );

        } finally {

            System.out.println("Program execution completed");

            input.close();
        }
    }
}