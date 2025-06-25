package telecom_Customer_Management_System;


public class Complaint {
	
	   private static int nextId = 1;
	   private int id;
	   private String description;
	   private String status;
	   
	   public Complaint(String description) {
	this.id = nextId++;
	       this.description = description;
	       this.status = "Open";
	   }
	   public int getId() {
	       return id;
	   }
	   public String getDescription() {
	       return description;
	   }
	   public String getStatus() {
	       return status;
	   }
	   public void setStatus(String status) {
	       this.status = status;
	   }
	   @Override
	   public String toString() {
	       return "Complaint ID: " + id + " | Description: " + description + " | Status: " + status;
	   }
	}