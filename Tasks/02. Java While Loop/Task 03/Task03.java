import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ending number: ");
        int endingNumber = input.nextInt();

        int number = 2;
        int sum = 0;

        while (number <= endingNumber) {
            sum = sum + number;
            number = number + 2;
        }

        System.out.println(
            "The sum of even numbers from 1 to "
            + endingNumber
            + " is "
            + sum
            + "."
        );

        input.close();
    }
}