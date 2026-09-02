public class User1 extends Thread {

    private Printer printer;
    private Scanner scanner;

    public User1(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        synchronized (printer) {

            System.out.println("User1 locked the Printer.");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("User1 was interrupted.");
            }

            System.out.println("User1 is waiting for the Scanner.");

            synchronized (scanner) {

                System.out.println("User1 locked the Scanner.");
                System.out.println("User1 is using the Printer and Scanner.");
            }
        }
    }
}