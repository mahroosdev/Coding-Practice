import java.util.Scanner;

public class OperatorsTask02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is the largest number.");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}