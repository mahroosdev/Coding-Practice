public class ForLoopTask02 {

    public static void main(String[] args) {

        // Starts with 5 rows and decreases to 1
        for (int row = 5; row >= 1; row--) {

            // Prints the required number of stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // Moves to the next line
            System.out.println();
        }
    }
}