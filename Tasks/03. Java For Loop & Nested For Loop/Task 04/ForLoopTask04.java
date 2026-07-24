public class ForLoopTask04 {

    public static void main(String[] args) {

        int totalRows = 5;

        // Controls each row
        for (int row = 1; row <= totalRows; row++) {

            // Prints spaces before the stars
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print(" ");
            }

            // Prints the stars
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");
            }

            // Moves to the next line
            System.out.println();
        }
    }
}