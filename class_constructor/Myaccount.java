package class_constructor;

public class Myaccount {
	 
	    private String accountHolderName;
	    private String bankName;
	    private double accountBalance;

	    public Myaccount(String accountHolderName, String bankName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.bankName = bankName;
	        this.accountBalance = initialBalance;
	    }

	    public double getBalance() {
	        return accountBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            accountBalance += amount;
	            System.out.println("Deposited " + amount + " into " + bankName + " account of " + accountHolderName);
	        } else {
	            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= accountBalance) {
	            accountBalance -= amount;
	            System.out.println("Withdrawn " + amount + " from " + bankName + " account of " + accountHolderName);
	        } else if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount. Amount must be greater than zero.");
	        } else {
	            System.out.println("Insufficient balance for withdrawal.");
	        }
	    }

	    public static void main(String[] args) {


	      Myaccount account1 = new Myaccount("Archu", "ICICI", 900.0);
	      Myaccount account2 = new Myaccount("Deepak", "HDFC", 1200.0);
	      Myaccount account3 = new Myaccount("Bhumi", "SBI", 5000.0);

	        account1.deposit(800.0);
	        account1.withdraw(1000.0);
	        System.out.println("Account 1 Balance: " + account1.getBalance());

	        account2.deposit(500.0);
	        account2.withdraw(400.0);
	        System.out.println("Account 2 Balance: " + account2.getBalance());

	        account3.deposit(900.0);
	        account3.withdraw(500.0);
	        System.out.println("Account 3 Balance: " + account3.getBalance());
	    }
	}
	