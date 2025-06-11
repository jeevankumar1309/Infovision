package org.demo;

class TelecomCompany {
 void companyInfo() {
     System.out.println("Infovision Telecom Ltd.");
 }
}

//Derived class 1
class Jio extends TelecomCompany {
 void serviceDetails() {
     System.out.println("Providing 4G and 5G services.");
 }
}

//Derived class 2
class Customer extends Jio {
 void customerDetails() {
     System.out.println("Customer: JeevanKumar P, Subscription Plan - 399 plan.");
 }
}

public class TelecomMultilevel {

	public static void main(String[] args) {
		
		 Customer cust = new Customer();

	        cust.companyInfo();      // from TelecomCompany
	        cust.serviceDetails();   // from ServiceProvider
	        cust.customerDetails();

	}

}
