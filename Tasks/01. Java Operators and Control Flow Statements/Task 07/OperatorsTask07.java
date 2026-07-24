import java.util.Scanner;

public class OperatorsTask07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The bigger number is " + firstNumber + ".");
        } else if (secondNumber > firstNumber) {
            System.out.println("The bigger number is " + secondNumber + ".");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}