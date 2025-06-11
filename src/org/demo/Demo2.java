package org.demo;

public class Demo2 {
	
	static String storeName ="SmartHub";
	
	int total=0;
	
			

	public static void  storeName()
	{
		
		System.out.println("Product purchased from store: "+storeName);
	}
	
	public void  billExcGst(int total)
	{
		
		//System.out.println("Amount  of GST1: "+total);
		
		if(total>2000)
		{
			System.out.println("You have won suprise gift and your bill amount is "+total);
		}
		
		else if(total<1000)
		{
			System.out.println("Amount  of GST1: "+total);
		}
		
	}

	public static void main(String[] args) {
		
		int amount=2100;
		int gst = 100;
		
		// TODO Auto-generated method stub
		
		storeName();
		
		int total = gst+amount;
		
		Demo2 ob1 = new Demo2();
		ob1.billExcGst(total);

	}

}
