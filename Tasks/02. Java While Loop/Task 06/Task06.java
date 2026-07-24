import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int digitCount = 0;

        if (number == 0) {
            digitCount = 1;
        } else {

            while (number > 0) {
                number = number / 10;
                digitCount++;
            }
        }

        System.out.println(
            originalNumber
            + " contains "
            + digitCount
            + " digit(s)."
        );

        input.close();
    }
}