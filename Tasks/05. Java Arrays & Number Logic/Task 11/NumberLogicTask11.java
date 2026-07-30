import java.util.Scanner;

public class NumberLogicTask11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;

        int tempNumber = number;

        int digitCount = 0;

        while (tempNumber > 0) {

            digitCount = digitCount + 1;

            tempNumber = tempNumber / 10;
        }

        tempNumber = number;

        int sum = 0;

        while (tempNumber > 0) {

            int digit = tempNumber % 10;

            int power = 1;

            int count = 1;

            while (count <= digitCount) {

                power = power * digit;

                count = count + 1;
            }

            sum = sum + power;

            tempNumber = tempNumber / 10;
        }

        if (sum == originalNumber) {

            System.out.println(originalNumber + " is an Armstrong number.");

        } else {

            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close();
    }
}