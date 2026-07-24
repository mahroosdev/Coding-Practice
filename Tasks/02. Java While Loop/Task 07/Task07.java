import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int number = input.nextInt();

        if (number < 0) {

            System.out.println(
                "Factorial cannot be calculated for a negative number."
            );

        } else {

            long factorial = 1;
            int counter = 1;

            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }

            System.out.println(
                "The factorial of "
                + number
                + " is "
                + factorial
                + "."
            );
        }

        input.close();
    }
}