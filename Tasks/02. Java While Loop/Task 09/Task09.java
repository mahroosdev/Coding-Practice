import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numberOfTerms = input.nextInt();

        if (numberOfTerms <= 0) {

            System.out.println(
                "Please enter a number greater than zero."
            );

        } else {

            int firstNumber = 0;
            int secondNumber = 1;
            int counter = 1;

            System.out.println("\nFibonacci Series:");

            while (counter <= numberOfTerms) {

                System.out.print(firstNumber + " ");

                int nextNumber = firstNumber + secondNumber;

                firstNumber = secondNumber;
                secondNumber = nextNumber;

                counter++;
            }

            System.out.println();
        }

        input.close();
    }
}