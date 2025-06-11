package bankmanagement;


public class BankDetailsImplement implements BankDetails {
	
	private String bankName;
	private String branch;
	
	public BankDetailsImplement(String bankName, String branch) {
		super();
		this.bankName = bankName;
		this.branch = branch;
	}
	
	public String getBankName() {
		return bankName;
	}


	public String getBranch() {
		return branch;
	}
	
	public void displayBankDetails() {
		
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
        
    }
	
}
