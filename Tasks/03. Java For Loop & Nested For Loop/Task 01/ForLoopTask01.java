public class ForLoopTask01 {

    public static void main(String[] args) {

        // Controls the number of rows
        for (int row = 1; row <= 5; row++) {

            // Prints stars in each row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // Moves to the next line
            System.out.println();
        }
    }
}