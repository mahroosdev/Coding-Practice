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

        synchronized (fromAccount) {

            System.out.println(
                    getName() + " locked " +
                    fromAccount.getAccountName()
            );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }

            System.out.println(
                    getName() + " is waiting for " +
                    toAccount.getAccountName()
            );

            synchronized (toAccount) {

                System.out.println(
                        getName() + " locked " +
                        toAccount.getAccountName()
                );

                try {
                    fromAccount.withdraw(amount);
                    toAccount.deposit(amount);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(getName() + " was interrupted.");
                }

                System.out.println(
                        getName() + " transferred " +
                        amount
                );
            }
        }
    }
}