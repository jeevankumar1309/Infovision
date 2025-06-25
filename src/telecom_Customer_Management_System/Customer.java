package telecom_Customer_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
		   private String customerId;
		   private String name;
		   private String phoneNumber;
		   private List<String> subscribedServices;
		   private List<Call> callHistory;
		   private List<Complaint> complaints;
		   
		   
		   public Customer(String customerId, String name, String phoneNumber) {
		       this.customerId = customerId;
		       this.name = name;
		       this.phoneNumber = phoneNumber;
		       this.subscribedServices = new ArrayList<>();
		       this.callHistory = new ArrayList<>();
		       this.complaints = new ArrayList<>();
		   }
		   public String getCustomerId() {
		       return customerId;
		   }
		   public String getName() {
		       return name;
		   }
		   public String getPhoneNumber() {
		       return phoneNumber;
		   }
		   public void recordCall(String phoneNumber, int duration) {
		       callHistory.add(new Call(phoneNumber, duration));
		   }
		   public void subscribeToService(String service) {
		       if (!subscribedServices.contains(service)) {
		           subscribedServices.add(service);
		           System.out.println("Service subscribed successfully: " + service);
		       } else {
		           System.out.println("You are already subscribed to this service.");
		       }
		   }
		   public void unsubscribeFromService(String service) {
		       if (subscribedServices.contains(service)) {
		           subscribedServices.remove(service);
		           System.out.println("Service unsubscribed successfully: " + service);
		       } else {
		           System.out.println("You are not subscribed to this service.");
		       }
		   }
		   public void fileComplaint(String description) {
		       complaints.add(new Complaint(description));
		       System.out.println("Complaint filed successfully.");
		   }
		   public void viewComplaints() {
		       if (complaints.isEmpty()) {
		           System.out.println("No complaints found.");
		           return;
		       }
		       for (Complaint complaint : complaints) {
		           System.out.println(complaint);
		       }
		   }
		   public void displayDetails() {
		       System.out.println("\nCustomer ID: " + customerId);
		       System.out.println("Name: " + name);
		       System.out.println("Phone Number: " + phoneNumber);
		       System.out.println("\nSubscribed Services:");
		       if (subscribedServices.isEmpty()) {
		           System.out.println("No services subscribed.");
		       } else {
		           for (String service : subscribedServices) {
		               System.out.println("- " + service);
		           }
		       }
		       System.out.println("\nCall History (Last 10 calls):");
		       if (callHistory.isEmpty()) {
		           System.out.println("No call history.");
		       } else {
		           int start = Math.max(0, callHistory.size() - 10);
		           for (int i = start; i < callHistory.size(); i++) {
		               System.out.println(callHistory.get(i));
		           }
		       }
		       System.out.println("\nComplaints:");
		       if (complaints.isEmpty()) {
		           System.out.println("No complaints filed.");
		       } else {
		           for (Complaint complaint : complaints) {
		               System.out.println(complaint);
		           }
		       }
		   }
		}


