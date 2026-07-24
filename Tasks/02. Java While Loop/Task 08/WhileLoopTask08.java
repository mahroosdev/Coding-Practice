import java.util.Scanner;

public class WhileLoopTask08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {

            int lastDigit = number % 10;

            reversedNumber = reversedNumber * 10 + lastDigit;

            number = number / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(
                originalNumber + " is a palindrome number."
            );
        } else {
            System.out.println(
                originalNumber + " is not a palindrome number."
            );
        }
        input.close();
    }
}