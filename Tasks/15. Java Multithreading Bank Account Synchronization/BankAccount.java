public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // synchronized prevents multiple threads
    // from changing the balance at the same time
    public synchronized void deposit(double amount) {

        System.out.println(
            Thread.currentThread().getName()
            + " is depositing Rs. "
            + amount
        );

        balance = balance + amount;

        System.out.println(
            "Deposit successful."
        );

        System.out.println(
            "Current Balance: Rs. "
            + balance
        );

        System.out.println();
    }

    // synchronized protects the withdrawal process
    public synchronized void withdraw(double amount) {

        System.out.println(
            Thread.currentThread().getName()
            + " is trying to withdraw Rs. "
            + amount
        );

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println(
                "Withdrawal successful."
            );

            System.out.println(
                "Current Balance: Rs. "
                + balance
            );

        } else {

            System.out.println(
                "Withdrawal failed. Insufficient balance."
            );

            System.out.println(
                "Available Balance: Rs. "
                + balance
            );
        }

        System.out.println();
    }

    public double getBalance() {
        return balance;
    }
}