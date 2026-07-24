public class ForLoopTask03 {

    public static void main(String[] args) {

        // Controls the rows
        for (int row = 1; row <= 5; row++) {

            // Prints numbers from 1 up to the current row
            for (int number = 1; number <= row; number++) {
                System.out.print(number);
            }

            // Moves to the next line
            System.out.println();
        }
    }
}