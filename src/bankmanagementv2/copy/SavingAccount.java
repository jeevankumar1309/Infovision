package bankmanagementv2.copy;

public class SavingAccount extends BankAccount {
    private static final double MINIMUM_DEPOSIT = 1000.0;
    private static final double INTEREST_RATE = 0.04; // 4% per annum
    private static final int MAX_WITHDRAWALS_PER_MONTH = 3;

    private int withdrawalsThisMonth;
    private boolean isIndividual;
    private CustomerInfo customerInfo;

    // Constructor
    public SavingAccount(String accountHolderName, String mobileNumber, double initialDeposit, boolean isIndividual) {
        super(accountHolderName, mobileNumber, initialDeposit);
        this.customerInfo = new CustomerInfo(accountHolderName, mobileNumber); // customer info added
        this.withdrawalsThisMonth = 0;
        this.isIndividual = isIndividual;
    }
    
    //  Shallow Copy Constructor
    public SavingAccount(SavingAccount original) {
        super(original.getAccountHolderName(), original.getMobileNumber(), original.getBalance());
        this.withdrawalsThisMonth = original.withdrawalsThisMonth;
        this.isIndividual = original.isIndividual;
        this.customerInfo = original.customerInfo; // shared reference
    }

    //  Deep Copy Constructor
    public SavingAccount(SavingAccount original, boolean deepCopy) {
        super(original.getAccountHolderName(), original.getMobileNumber(), original.getBalance());
        this.withdrawalsThisMonth = original.withdrawalsThisMonth;
        this.isIndividual = original.isIndividual;
        this.customerInfo = deepCopy
                ? new CustomerInfo(original.customerInfo)
                : original.customerInfo;
    }

    @Override
    public void openAccount() {
        if (!isIndividual) {
            System.out.println("Savings account can only be opened by individual customers.");
            confirmValidation(false);
            return;
        }
        if (getBalance() < MINIMUM_DEPOSIT) {
            System.out.println("Minimum initial deposit for Savings Account is ₹" + MINIMUM_DEPOSIT);
            confirmValidation(false);
            return;
        }
        confirmValidation(true);
        System.out.println("Savings account opened successfully!");
    }

    @Override
    public void withdraw(double amount) {
        if (!isValidated()) {
            System.out.println("Account not validated. Cannot withdraw.");
            return;
        }
        if (withdrawalsThisMonth >= MAX_WITHDRAWALS_PER_MONTH) {
            System.out.println("Withdrawal limit reached for this month.");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }
        setBalance(getBalance() - amount);
        withdrawalsThisMonth++;
        System.out.println("Withdrawn ₹" + amount + ". Remaining balance: ₹" + getBalance());
    }

    @Override
    public double calculateInterest() {
        if (!isValidated()) return 0;
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account Type: Savings");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getAccountHolderName());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.println("Balance: ₹" + getBalance());
        System.out.println("Account Validated: " + (isValidated() ? "Yes" : "No"));
        System.out.println("Withdrawals this month: " + withdrawalsThisMonth);
        System.out.println("Accrued interest (annual): ₹" + calculateInterest());
    }
}