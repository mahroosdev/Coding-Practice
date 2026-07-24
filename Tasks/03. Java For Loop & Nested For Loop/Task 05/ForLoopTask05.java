public class ForLoopTask05 {

    public static void main(String[] args) {

        int totalRows = 5;

        // Upper part of the diamond
        for (int row = 1; row <= totalRows; row++) {

            // Prints spaces before the stars
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print(" ");
            }

            // Prints stars
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part of the diamond
        for (int row = totalRows - 1; row >= 1; row--) {

            // Prints spaces before the stars
            for (int space = 1; space <= totalRows - row; space++) {
                System.out.print(" ");
            }

            // Prints stars
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}