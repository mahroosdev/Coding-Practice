import java.util.Scanner;

public class WhileLoopTask10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {

            System.out.println("\nSimple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter the first number: ");
                double firstNumber = input.nextDouble();

                System.out.print("Enter the second number: ");
                double secondNumber = input.nextDouble();

                if (choice == 1) {

                    double result = firstNumber + secondNumber;
                    System.out.println("Result: " + result);

                } else if (choice == 2) {

                    double result = firstNumber - secondNumber;
                    System.out.println("Result: " + result);

                } else if (choice == 3) {

                    double result = firstNumber * secondNumber;
                    System.out.println("Result: " + result);

                } else {

                    if (secondNumber != 0) {

                        double result = firstNumber / secondNumber;
                        System.out.println("Result: " + result);

                    } else {

                        System.out.println(
                            "A number cannot be divided by zero."
                        );
                    }
                }

            } else if (choice == 5) {

                System.out.println("Calculator closed.");

            } else {

                System.out.println(
                    "Invalid choice. Please select from 1 to 5."
                );
            }
        }

        input.close();
    }
}