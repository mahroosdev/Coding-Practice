public class BankAccount {

    // Private attributes
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    // Getter for account number
    public String getAccountNumber() {

        return accountNumber;
    }


    // Setter for account number
    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }


    // Getter for account holder name
    public String getAccountHolderName() {

        return accountHolderName;
    }


    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {

        this.accountHolderName = accountHolderName;
    }


    // Getter for balance
    public double getBalance() {

        return balance;
    }


    // Setter for balance
    public void setBalance(double balance) {

        this.balance = balance;
    }


    // Method to deposit money
    public void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            System.out.println(
                "Deposited amount: " + amount
            );

        } else {

            System.out.println("Invalid deposit amount.");
        }
    }


    // Method to withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid withdrawal amount.");

        } else if (amount <= balance) {

            balance = balance - amount;

            System.out.println(
                "Withdrawn amount: " + amount
            );

        } else {

            System.out.println(
                "Insufficient balance."
            );
        }
    }


    // Method to display account details
    public void displayAccountDetails() {

        System.out.println();
        System.out.println("Bank Account Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }


    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount();


        // Set account details using setter methods
        account.setAccountNumber("ACC001");
        account.setAccountHolderName("Mahroos");
        account.setBalance(0);


        // Deposit 5000
        account.deposit(5000);


        // Withdraw 2000
        account.withdraw(2000);


        // Display updated account details
        account.displayAccountDetails();
    }
}