import java.util.Scanner;

public class WhileLoopTask01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press Enter to print numbers from 1 to 100.");
        input.nextLine();

        int number = 1;

        while (number <= 100) {
            System.out.println(number);
            number++;
        }

        input.close();
    }
}