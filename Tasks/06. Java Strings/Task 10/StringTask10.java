import java.util.Scanner;

public class StringTask10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String currentWord = "";
        String longestWord = "";

        for (int i = 0; i <= sentence.length(); i++) {

            if (i < sentence.length()
                    && sentence.charAt(i) != ' ') {

                currentWord =
                    currentWord + sentence.charAt(i);

            } else {

                if (currentWord.length()
                        > longestWord.length()) {

                    longestWord = currentWord;
                }

                currentWord = "";
            }
        }

        System.out.println(
            "Longest word: " + longestWord
        );

        input.close();
    }
}