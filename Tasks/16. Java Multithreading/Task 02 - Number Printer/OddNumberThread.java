public class OddNumberThread extends Thread {

    private NumberPrinter printer;

    public OddNumberThread(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {

        printer.printOddNumbers();
    }
}