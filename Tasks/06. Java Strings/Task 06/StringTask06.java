import java.util.Scanner;

public class StringTask06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstText = input.nextLine().toLowerCase();

        System.out.print("Enter the second string: ");
        String secondText = input.nextLine().toLowerCase();

        boolean isAnagram = true;

        if (firstText.length() != secondText.length()) {

            isAnagram = false;

        } else {

            boolean[] used = new boolean[secondText.length()];

            for (int i = 0; i < firstText.length(); i++) {

                boolean found = false;

                for (int j = 0; j < secondText.length(); j++) {

                    if (firstText.charAt(i) == secondText.charAt(j)
                            && used[j] == false) {

                        used[j] = true;
                        found = true;
                        break;
                    }
                }

                if (found == false) {

                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram == true) {

            System.out.println("The strings are anagrams.");

        } else {

            System.out.println("The strings are not anagrams.");
        }

        input.close();
    }
}