package telecom_Customer_Management_System;



import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;




public class TelecomManagementSystem {
	
   private Map<String, Customer> customers;
   
   private Scanner scanner;
   public TelecomManagementSystem() {
       this.customers = new HashMap<>();
       this.scanner = new Scanner(System.in);
   }
   public void addCustomer() {
       System.out.println("\nAdd New Customer");
       System.out.print("Enter Customer ID: ");
       String customerId = scanner.nextLine();
       if (customers.containsKey(customerId)) {
           System.out.println("Customer ID already exists.");
           return;
       }
       System.out.print("Enter Name: ");
       String name = scanner.nextLine();
       System.out.print("Enter Phone Number: ");
       String phoneNumber = scanner.nextLine();
       customers.put(customerId, new Customer(customerId, name, phoneNumber));
       System.out.println("Customer added successfully!");
   }
   public void recordCall() {
       System.out.println("\nRecord a Call");
       System.out.print("Enter Customer ID: ");
       String customerId = scanner.nextLine();
       Customer customer = customers.get(customerId);
       if (customer == null) {
           System.out.println("Customer not found.");
           return;
       }
       System.out.print("Enter Phone Number Called: ");
       String phoneNumber = scanner.nextLine();
       System.out.print("Enter Call Duration (seconds): ");
       int duration = Integer.parseInt(scanner.nextLine());
       customer.recordCall(phoneNumber, duration);
       System.out.println("Call recorded successfully!");
   }
   public void manageServices() {
       System.out.println("\nManage Value-Added Services");
       System.out.print("Enter Customer ID: ");
       String customerId = scanner.nextLine();
       Customer customer = customers.get(customerId);
       if (customer == null) {
           System.out.println("Customer not found.");
           return;
       }
       System.out.println("1. Subscribe to a Service");
       System.out.println("2. Unsubscribe from a Service");
       System.out.print("Choose option: ");
       int option = Integer.parseInt(scanner.nextLine());
       System.out.print("Enter Service Name: ");
       String service = scanner.nextLine();
       if (option == 1) {
           customer.subscribeToService(service);
       } else if (option == 2) {
           customer.unsubscribeFromService(service);
       } else {
           System.out.println("Invalid option.");
       }
   }
   public void manageComplaints() {
       System.out.println("\nManage Complaints");
       System.out.print("Enter Customer ID: ");
       String customerId = scanner.nextLine();
       Customer customer = customers.get(customerId);
       if (customer == null) {
           System.out.println("Customer not found.");
           return;
       }
       System.out.println("1. File a Complaint");
       System.out.println("2. View All Complaints");
       System.out.print("Choose option: ");
       int option = Integer.parseInt(scanner.nextLine());
       if (option == 1) {
           System.out.print("Enter Complaint Description: ");
           String description = scanner.nextLine();
           customer.fileComplaint(description);
       } else if (option == 2) {
           customer.viewComplaints();
       } else {
           System.out.println("Invalid option.");
       }
   }
   public void displayAllCustomers() {
       System.out.println("\nAll Customers Summary");
       if (customers.isEmpty()) {
           System.out.println("No customers found.");
           return;
       }
       for (Customer customer : customers.values()) {
           System.out.println("\n----------------------------------------");
           customer.displayDetails();
           System.out.println("----------------------------------------");
       }
   }
   public void run() {
       System.out.println("Welcome to Telecom Customer Management System");
       while (true) {
           System.out.println("\nMain Menu");
           System.out.println("1. Add New Customer");
           System.out.println("2. Record a Call");
           System.out.println("3. Manage Value-Added Services");
           System.out.println("4. Manage Complaints");
           System.out.println("5. Display All Customers");
           System.out.println("6. Exit");
           System.out.print("Choose option: ");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice) {
               case 1:
                   addCustomer();
                   break;
               case 2:
                   recordCall();
                   break;
               case 3:
                   manageServices();
                   break;
               case 4:
                   manageComplaints();
                   break;
               case 5:
                   displayAllCustomers();
                   break;
               case 6:
                   System.out.println("Thank you for using the system. Goodbye!");
                   return;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       }
   }
   public static void main(String[] args) {
	   
       TelecomManagementSystem system = new TelecomManagementSystem();
       system.run();
   }
}