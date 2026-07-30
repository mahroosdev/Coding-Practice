import java.util.Scanner;

public class StringTask03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialCharacters = 0;

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (character >= 'A' && character <= 'Z') {

                character = (char) (character + 32);
            }

            if (character == 'a'
                    || character == 'e'
                    || character == 'i'
                    || character == 'o'
                    || character == 'u') {

                vowels = vowels + 1;

            } else if (character >= 'a' && character <= 'z') {

                consonants = consonants + 1;

            } else if (character >= '0' && character <= '9') {

                digits = digits + 1;

            } else if (character != ' ') {

                specialCharacters = specialCharacters + 1;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialCharacters);

        input.close();
    }
}