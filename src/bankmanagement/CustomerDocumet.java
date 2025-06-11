package bankmanagement;

public class CustomerDocumet {
	
	private String documentName;
    private String documentNumber;
    
    
	public CustomerDocumet(String documentName, String documentNumber) {
		super();
		this.documentName = documentName;
		this.documentNumber = documentNumber;
	}


	public String getDocumentName() {
		return documentName;
	}


	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public void displayCustomerDocumet()
	{
		System.out.println("Document: " + documentName);
        System.out.println("Document Number: " + documentNumber);
	}

}
