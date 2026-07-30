import java.util.Scanner;

public class StringTask08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String lowerText = text.toLowerCase();

        System.out.println("Character frequency:");

        for (int i = 0; i < lowerText.length(); i++) {

            char character = lowerText.charAt(i);

            if (character == ' ') {
                continue;
            }

            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {

                if (character == lowerText.charAt(j)) {

                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked == false) {

                int count = 0;

                for (int j = 0; j < lowerText.length(); j++) {

                    if (character == lowerText.charAt(j)) {

                        count = count + 1;
                    }
                }

                System.out.println(
                    character + " = " + count
                );
            }
        }

        input.close();
    }
}