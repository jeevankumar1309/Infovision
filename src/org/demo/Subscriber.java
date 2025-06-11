package org.demo;

interface CallCheck{
	public void callValidity(int totalCall );
}

interface MessageCheck
{
	public void messageValidity(int totalMsg);
	
	}

public class Subscriber implements CallCheck, MessageCheck {
	
	public void callValidity(int totalCall)
	{
		if(totalCall >20)
		{
			System.out.println("You have reached calling limit today !!!!");
		}
		
		else
		{
			System.out.println("Calling the user");
		}
	}
	
	public void messageValidity(int totalMsg)
	{
		if(totalMsg >100)
		{
			System.out.println("You have reached Messaging limit today !!!!");
		}
		
		else
		{
			System.out.println("message sent successfully !!!");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subscriber sub = new Subscriber ();
		sub.callValidity(21);
		sub.messageValidity(103);

	}

}
