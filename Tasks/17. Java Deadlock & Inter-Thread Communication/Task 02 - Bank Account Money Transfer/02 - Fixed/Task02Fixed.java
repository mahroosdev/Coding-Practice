public class Task02Fixed {

    public static void main(String[] args) {

        BankAccount accountA =
                new BankAccount("Account A", 100);

        BankAccount accountB =
                new BankAccount("Account B", 100);

        TransferThread thread1 =
                new TransferThread(
                        "Thread 1",
                        accountA,
                        accountB,
                        50
                );

        TransferThread thread2 =
                new TransferThread(
                        "Thread 2",
                        accountB,
                        accountA,
                        50
                );

        System.out.println("Starting money transfers...");
        System.out.println();

        thread1.start();
        thread2.start();
    }
}