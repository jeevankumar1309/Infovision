package bankmanagementv2.copy;

public class CurrentAccount extends BankAccount {
    private static final double MINIMUM_DEPOSIT = 5000.0;
    private static final double MINIMUM_BALANCE = 2000.0;
    private static final double PENALTY = 500.0;

    private boolean isIndividual;
    private boolean isBusiness;

    public CurrentAccount(String accountHolderName, String mobileNumber, double initialDeposit, boolean isIndividual, boolean isBusiness) {
        super(accountHolderName, mobileNumber, initialDeposit);
        this.isIndividual = isIndividual;
        this.isBusiness = isBusiness;
    }

    @Override
    public void openAccount() {
        if (!isIndividual && !isBusiness) {
            System.out.println("Current account must be opened by an individual or business.");
            confirmValidation(false);
            return;
        }
        if (getBalance() < MINIMUM_DEPOSIT) {
            System.out.println("Minimum initial deposit for Current Account is ₹" + MINIMUM_DEPOSIT);
            confirmValidation(false);
            return;
        }
        confirmValidation(true);
        System.out.println("Current account opened successfully!");
    }

    @Override
    public void withdraw(double amount) {
        if (!isValidated()) {
            System.out.println("Account not validated. Cannot withdraw.");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }
        double newBalance = getBalance() - amount;
        if (newBalance < MINIMUM_BALANCE) {
            newBalance -= PENALTY;
            System.out.println("Balance below minimum. ₹" + PENALTY + " penalty charged.");
        }
        setBalance(newBalance);
        System.out.println("Withdrawn ₹" + amount + ". Remaining balance: ₹" + getBalance());
    }

    @Override
    public double calculateInterest() {
        return 0;  // No interest for Current Account
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account Type: Current");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getAccountHolderName());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.println("Balance: ₹" + getBalance());
        System.out.println("Account Validated: " + (isValidated() ? "Yes" : "No"));
    }
}