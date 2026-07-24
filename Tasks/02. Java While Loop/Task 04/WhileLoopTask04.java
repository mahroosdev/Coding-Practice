import java.util.Scanner;

public class WhileLoopTask04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int multiplier = 1;

        System.out.println("\nMultiplication Table of " + number);

        while (multiplier <= 10) {

            int answer = number * multiplier;

            System.out.println(
                number + " x " + multiplier + " = " + answer
            );

            multiplier++;
        }

        input.close();
    }
}