public class BankAccount {

    private String accountName;
    private int balance;

    public BankAccount(String accountName, int balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {

        balance = balance + amount;

        System.out.println(
                amount + " deposited into " + accountName
        );

        notifyAll();
    }

    public synchronized void withdraw(int amount)
            throws InterruptedException {

        while (balance < amount) {

            System.out.println(
                    accountName +
                    " does not have enough money."
            );

            System.out.println(
                    "Waiting for a deposit..."
            );

            wait();
        }

        balance = balance - amount;

        System.out.println(
                amount + " withdrawn from " + accountName
        );
    }
}