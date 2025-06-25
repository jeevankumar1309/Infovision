package telecom_Customer_Management_System;

public class Call {
	
	
		   private String phoneNumber;
		   private int duration; // in seconds
		   
		   
		   public Call(String phoneNumber, int duration) {
		       this.phoneNumber = phoneNumber;
		       this.duration = duration;
		   }
		   public String getPhoneNumber() {
		       return phoneNumber;
		   }
		   public int getDuration() {
		       return duration;
		   }
		   @Override
		   public String toString() {
		       return "Call to: " + phoneNumber + " | Duration: " + duration + " seconds";
		   }
		}
		


