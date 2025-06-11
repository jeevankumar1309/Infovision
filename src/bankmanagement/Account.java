package bankmanagement;

public class Account {
	
	private static int accountCounter = 1000; // Static counter for generating account numbers
    private int accountNumber;
    private double balance;
    private CustomerDetails customerDetails;
    private BankDetailsImplement bankDetails;
    private AccountType accountType;
    
    // constructors
	public Account(double balance, CustomerDetails customerDetails, BankDetailsImplement bankDetails, AccountType accountType) {
		super();
		this.accountNumber = accountCounter++;
		this.balance = balance;
		this.customerDetails = customerDetails;
		this.bankDetails = bankDetails;
		this.accountType = accountType; 
	}
	
	
	public static int getAccountCounter() {
		return accountCounter;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public BankDetailsImplement getBankDetails() {
		return bankDetails;
	}
	
	public AccountType getAccountType() {
        return accountType;
    }

	// deposit function
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Amount credited "+amount);
	}
	
	// withdraw  function
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println("Amount debited: " +amount);
		}
		else
		{
			 System.out.println("Insufficient balance.");
		}
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Type: " + accountType); 
        System.out.println("Balance: " + balance);
        customerDetails.displayCustomerDetails();  // Display customer details
        bankDetails.displayBankDetails(); 
        
	}
	
}
