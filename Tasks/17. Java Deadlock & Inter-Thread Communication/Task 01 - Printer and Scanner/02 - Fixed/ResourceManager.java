public class ResourceManager {

    private boolean printerBusy = false;
    private boolean scannerBusy = false;

    public synchronized void getResources(String userName)
            throws InterruptedException {

        while (printerBusy || scannerBusy) {

            System.out.println(userName + " is waiting for the resources.");

            wait();
        }

        printerBusy = true;
        scannerBusy = true;

        System.out.println(userName + " got the Printer.");
        System.out.println(userName + " got the Scanner.");
    }

    public synchronized void releaseResources(String userName) {

        printerBusy = false;
        scannerBusy = false;

        System.out.println(userName + " released the Printer.");
        System.out.println(userName + " released the Scanner.");

        notifyAll();
    }
}