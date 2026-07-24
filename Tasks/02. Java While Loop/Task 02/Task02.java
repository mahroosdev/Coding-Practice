import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press Enter to print odd numbers from 1 to 50.");
        input.nextLine();

        int number = 1;

        while (number <= 50) {
            System.out.println(number);
            number = number + 2;
        }

        input.close();
    }
}