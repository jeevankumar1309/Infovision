package bankmanagementv2.copy;

public class CustomerInfo {
	
	private String name;
    private String phone;

    public CustomerInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Deep copy constructor
    public CustomerInfo(CustomerInfo other) {
        this.name = other.name;
        this.phone = other.phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone: " + phone);
    }

}
