public class NumberPrinterMain {

    public static void main(String[] args) {

        NumberPrinter printer =
            new NumberPrinter();

        OddNumberThread oddThread =
            new OddNumberThread(printer);

        EvenNumberThread evenThread =
            new EvenNumberThread(printer);

        System.out.println(
            "===== Number Printer ====="
        );

        System.out.println();

        oddThread.start();
        evenThread.start();

        try {

            oddThread.join();
            evenThread.join();

        } catch (InterruptedException e) {

            System.out.println(
                "Main thread was interrupted."
            );
        }

        System.out.println(
            "Number printing completed."
        );
    }
}