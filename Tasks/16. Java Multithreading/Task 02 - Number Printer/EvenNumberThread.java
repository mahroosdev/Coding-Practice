public class EvenNumberThread extends Thread {

    private NumberPrinter printer;

    public EvenNumberThread(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {

        printer.printEvenNumbers();
    }
}