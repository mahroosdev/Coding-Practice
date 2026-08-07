public class DepositThread extends Thread {

    private BankAccount account;
    private double amount;

    public DepositThread(
        String threadName,
        BankAccount account,
        double amount
    ) {
        super(threadName);

        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {

        account.deposit(amount);
    }
}