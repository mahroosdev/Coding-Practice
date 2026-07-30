import java.util.Scanner;

public class StringTask01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            reversedText = reversedText + text.charAt(i);
        }

        System.out.println("Reversed string: " + reversedText);

        input.close();
    }
}