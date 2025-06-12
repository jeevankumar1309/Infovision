package bankmanagementv2.copy;

public abstract class BankAccount {
	
	private static int nextAccountNumber = 1001;

    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private double balance;
    private boolean isValidated;

    public BankAccount(String accountHolderName, String mobileNumber, double initialDeposit) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.balance = initialDeposit;
        this.isValidated = false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isValidated() {
        return isValidated;
    }

    public void confirmValidation(boolean status) {
        this.isValidated = status;
    }

    // Abstract methods to be implemented by subclasses:
    public abstract void openAccount(); 

    public abstract void withdraw(double amount);

    public abstract double calculateInterest();

    public abstract void displayAccountDetails();
    
}
