import java.util.Scanner;

public class StringTask02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String lowerText = text.toLowerCase();

        String reversedText = "";

        for (int i = lowerText.length() - 1; i >= 0; i--) {

            reversedText = reversedText + lowerText.charAt(i);
        }

        if (lowerText.equals(reversedText)) {

            System.out.println(text + " is a palindrome.");

        } else {

            System.out.println(text + " is not a palindrome.");
        }

        input.close();
    }
}