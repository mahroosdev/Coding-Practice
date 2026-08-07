import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(
            "ACC001",
            "Mahroos",
            5000.00
        );

        System.out.println("===== Bank Account =====");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Current Balance: Rs. " + account.getBalance());

        System.out.println();
        System.out.print("Enter withdrawal amount: Rs. ");

        double withdrawalAmount = scanner.nextDouble();

        try {

            account.withdraw(withdrawalAmount);

            System.out.println();
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: Rs. " + account.getBalance());

        } catch (InsufficientBalanceException e) {

            System.out.println();
            System.out.println("Error: " + e.getMessage());
            System.out.println("Available Balance: Rs. " + account.getBalance());

        }

        scanner.close();
    }
}