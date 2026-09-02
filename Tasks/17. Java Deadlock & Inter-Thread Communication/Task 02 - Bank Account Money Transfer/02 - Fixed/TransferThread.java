public class TransferThread extends Thread {

    private BankAccount fromAccount;
    private BankAccount toAccount;
    private int amount;

    public TransferThread(
            String threadName,
            BankAccount fromAccount,
            BankAccount toAccount,
            int amount) {

        super(threadName);

        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void run() {

        BankAccount firstAccount;
        BankAccount secondAccount;

        /*
         * Always lock the accounts in the same order.
         * This prevents deadlock.
         */
        if (fromAccount.getAccountName()
                .compareTo(toAccount.getAccountName()) < 0) {

            firstAccount = fromAccount;
            secondAccount = toAccount;

        } else {

            firstAccount = toAccount;
            secondAccount = fromAccount;
        }

        synchronized (firstAccount) {

            synchronized (secondAccount) {

                try {

                    System.out.println(
                            getName() +
                            " is transferring " +
                            amount
                    );

                    fromAccount.withdraw(amount);
                    toAccount.deposit(amount);

                    System.out.println(
                            getName() +
                            " completed the transfer."
                    );

                } catch (InterruptedException e) {

                    System.out.println(
                            getName() +
                            " was interrupted."
                    );
                }
            }
        }
    }
}