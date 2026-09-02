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
         * Always lock Account A before Account B.
         * This prevents both threads from waiting
         * for each other.
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

            System.out.println(
                    getName() +
                    " locked " +
                    firstAccount.getAccountName()
            );

            synchronized (secondAccount) {

                System.out.println(
                        getName() +
                        " locked " +
                        secondAccount.getAccountName()
                );

                fromAccount.withdraw(amount);
                toAccount.deposit(amount);

                System.out.println(
                        getName() +
                        " transferred " +
                        amount
                );

                System.out.println(
                        getName() +
                        " completed the transfer."
                );
            }
        }
    }
}