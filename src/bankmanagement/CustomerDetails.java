package bankmanagement;

public class CustomerDetails {
	
	private String custName;
    private String custAddress;
    private String custPhoneNumber;
    private CustomerDocumet document;
    
    
	public CustomerDetails(String custName, String custAddress, String custPhoneNumber, CustomerDocumet document) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
		this.custPhoneNumber = custPhoneNumber;
		this.document = document;
	}


	public String getCustName() {
		return custName;
	}


	public String getCustAddress() {
		return custAddress;
	}


	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}


	public CustomerDocumet getDocument() {
		return document;
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("Customer Name: " + custName);
        System.out.println("Address: " + custAddress);
        System.out.println("Phone Number: " + custPhoneNumber);
        document.displayCustomerDocumet();
	}

}
