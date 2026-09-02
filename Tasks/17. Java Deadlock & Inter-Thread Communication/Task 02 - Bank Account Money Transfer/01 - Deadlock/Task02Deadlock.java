public class Task02Deadlock {

    public static void main(String[] args) {

        BankAccount accountA =
                new BankAccount("Account A", 1000);

        BankAccount accountB =
                new BankAccount("Account B", 1000);

        TransferThread thread1 =
                new TransferThread(
                        "Thread 1",
                        accountA,
                        accountB,
                        100
                );

        TransferThread thread2 =
                new TransferThread(
                        "Thread 2",
                        accountB,
                        accountA,
                        100
                );

        System.out.println("Starting money transfers...");
        System.out.println();

        thread1.start();
        thread2.start();
    }
}