import java.util.Scanner;

public class OperatorsTask13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();

        int smallestNumber = firstNumber;

        if (secondNumber < smallestNumber) {
            smallestNumber = secondNumber;
        }

        if (thirdNumber < smallestNumber) {
            smallestNumber = thirdNumber;
        }

        System.out.println("The smallest number is " + smallestNumber + ".");

        input.close();
    }
}