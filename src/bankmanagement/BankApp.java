package bankmanagement;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerDocumet doc = new CustomerDocumet("Aadhar", "1234-5678-9012");

        // Create customer
        CustomerDetails customer = new CustomerDetails("JEEVAN KUMAR p", "TamilNadu", "9876543210", doc);

        // Create bank
        BankDetailsImplement bank = new BankDetailsImplement("HDFC", "Main Branch");
        
        // Create account
        Account account = new Account(5000.00, customer, bank,AccountType.SAVINGS);
        
        // Display account details
        account.displayAccountDetails();

        System.out.println("\n----- Starting Transactions -----\n");
        
        // Performing some transactions
        account.deposit(2000);
        account.withdraw(1000);
        account.withdraw(8000);
        
        // Final Draft
        System.out.println("\n----- Final Account State -----\n");
	    account.displayAccountDetails();
	}

}
