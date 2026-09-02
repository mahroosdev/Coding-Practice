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

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }
}