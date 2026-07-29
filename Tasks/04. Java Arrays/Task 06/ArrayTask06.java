import java.util.Scanner;

public class ArrayTask06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter a number to search: ");
        int searchNumber = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }

        if (found == true) {

            System.out.println(searchNumber + " was found in the array.");

        } else {

            System.out.println(searchNumber + " was not found in the array.");
        }

        input.close();
    }
}