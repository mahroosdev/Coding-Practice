public class ThreadDetailsPrinter {

    // synchronized allows one thread to print at a time
    public synchronized void printThreadDetails() {

        System.out.println(
            "Thread Name: " +
            Thread.currentThread().getName()
        );

        System.out.println(
            "Thread Priority: " +
            Thread.currentThread().getPriority()
        );

        System.out.println(
            "Thread State: " +
            Thread.currentThread().getState()
        );

        System.out.println();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}