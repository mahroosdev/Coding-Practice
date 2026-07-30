import java.util.Scanner;

public class StringTask04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String lowerText = text.toLowerCase();

        boolean found = false;

        for (int i = 0; i < lowerText.length(); i++) {

            int count = 0;

            for (int j = 0; j < lowerText.length(); j++) {

                if (lowerText.charAt(i) == lowerText.charAt(j)) {

                    count = count + 1;
                }
            }

            if (count == 1) {

                System.out.println(
                    "First non-repeated character: " + text.charAt(i)
                );

                found = true;
                break;
            }
        }

        if (found == false) {

            System.out.println("There is no non-repeated character.");
        }

        input.close();
    }
}