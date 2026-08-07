public class WithdrawThread extends Thread {

    private BankAccount account;
    private double amount;

    public WithdrawThread(
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

        account.withdraw(amount);
    }
}