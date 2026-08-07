public class WorkerThread extends Thread {

    private ThreadDetailsPrinter printer;

    public WorkerThread(
        String threadName,
        ThreadDetailsPrinter printer
    ) {
        super(threadName);

        this.printer = printer;
    }

    @Override
    public void run() {

        printer.printThreadDetails();
    }
}