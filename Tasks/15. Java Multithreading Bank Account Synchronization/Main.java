public class Main {

    public static void main(String[] args) {

        BankAccount account =
            new BankAccount(5000.00);

        System.out.println(
            "===== Bank Account System ====="
        );

        System.out.println(
            "Starting Balance: Rs. "
            + account.getBalance()
        );

        System.out.println();

        DepositThread deposit1 =
            new DepositThread(
                "Customer 1",
                account,
                2000.00
            );

        WithdrawThread withdraw1 =
            new WithdrawThread(
                "Customer 2",
                account,
                3000.00
            );

        WithdrawThread withdraw2 =
            new WithdrawThread(
                "Customer 3",
                account,
                6000.00
            );

        DepositThread deposit2 =
            new DepositThread(
                "Customer 4",
                account,
                1000.00
            );

        // Start all threads
        deposit1.start();
        withdraw1.start();
        withdraw2.start();
        deposit2.start();

        try {

            // Wait until all threads finish
            deposit1.join();
            withdraw1.join();
            withdraw2.join();
            deposit2.join();

        } catch (InterruptedException e) {

            System.out.println(
                "Thread was interrupted."
            );
        }

        System.out.println(
            "===== Final Result ====="
        );

        System.out.println(
            "Final Balance: Rs. "
            + account.getBalance()
        );
    }
}