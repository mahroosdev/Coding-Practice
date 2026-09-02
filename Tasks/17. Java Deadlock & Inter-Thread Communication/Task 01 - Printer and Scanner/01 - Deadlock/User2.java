public class User2 extends Thread {

    private Printer printer;
    private Scanner scanner;

    public User2(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        synchronized (scanner) {

            System.out.println("User2 locked the Scanner.");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("User2 was interrupted.");
            }

            System.out.println("User2 is waiting for the Printer.");

            synchronized (printer) {

                System.out.println("User2 locked the Printer.");
                System.out.println("User2 is using the Printer and Scanner.");
            }
        }
    }
}