import java.util.Scanner;

public class StringTask07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char currentCharacter = text.charAt(i);

            boolean duplicate = false;

            for (int j = 0; j < result.length(); j++) {

                if (currentCharacter == result.charAt(j)) {

                    duplicate = true;
                    break;
                }
            }

            if (duplicate == false) {

                result = result + currentCharacter;
            }
        }

        System.out.println(
            "String without duplicate characters: " + result
        );

        input.close();
    }
}