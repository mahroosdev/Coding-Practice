import java.util.Scanner;

public class StringTask09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String word = "";
        String reversedSentence = "";

        for (int i = 0; i <= sentence.length(); i++) {

            if (i < sentence.length()
                    && sentence.charAt(i) != ' ') {

                word = word + sentence.charAt(i);

            } else {

                if (word.length() > 0) {

                    if (reversedSentence.length() == 0) {

                        reversedSentence = word;

                    } else {

                        reversedSentence =
                            word + " " + reversedSentence;
                    }

                    word = "";
                }
            }
        }

        System.out.println(
            "Reversed sentence: " + reversedSentence
        );

        input.close();
    }
}