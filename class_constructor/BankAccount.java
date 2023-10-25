package class_constructor;

public class BankAccount {
	private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("Bijaylaxmi Oram", 45890002, 50000);

        // Withdraw and deposit money
        account.withdraw(2000);
        account.deposit(5000);

        // Get the balance
        int balance = account.getBalance();

        // Check if minimum balance is maintained
        String status = (balance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

        // Display the status
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + balance);
        System.out.println("Status: " + status);
    }
}

