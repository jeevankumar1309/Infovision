package bankmanagementv2.copy;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount sa = new SavingAccount("Anita Sharma", "9876543210", 1500, true);
        sa.openAccount();
        sa.displayAccountDetails();
        sa.withdraw(200);
        sa.withdraw(300);
        sa.withdraw(100);
        sa.withdraw(50);  // Should deny, 4th withdrawal
        System.out.println();

        // Current Account opening by business
        CurrentAccount ca = new CurrentAccount("XYZ Corp", "0123456789", 7000, false, true);
        ca.openAccount();
        ca.displayAccountDetails();
        ca.withdraw(5500); // Will trigger penalty
        ca.displayAccountDetails();
    }

	}


