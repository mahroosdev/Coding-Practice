public class ThreadExecutionManager {

    public static void main(String[] args) {

        ThreadDetailsPrinter printer =
            new ThreadDetailsPrinter();

        WorkerThread thread1 =
            new WorkerThread("Thread 1", printer);

        WorkerThread thread2 =
            new WorkerThread("Thread 2", printer);

        WorkerThread thread3 =
            new WorkerThread("Thread 3", printer);

        System.out.println(
            "===== Thread Execution Manager ====="
        );

        System.out.println();

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(
            "Thread 1 Alive: " +
            thread1.isAlive()
        );

        System.out.println(
            "Thread 2 Alive: " +
            thread2.isAlive()
        );

        System.out.println(
            "Thread 3 Alive: " +
            thread3.isAlive()
        );

        System.out.println();

        try {

            thread1.join();
            thread2.join();
            thread3.join();

        } catch (InterruptedException e) {

            System.out.println(
                "Main thread was interrupted."
            );
        }

        System.out.println(
            "===== After Completion ====="
        );

        System.out.println(
            "Thread 1 Alive: " +
            thread1.isAlive()
        );

        System.out.println(
            "Thread 2 Alive: " +
            thread2.isAlive()
        );

        System.out.println(
            "Thread 3 Alive: " +
            thread3.isAlive()
        );
    }
}