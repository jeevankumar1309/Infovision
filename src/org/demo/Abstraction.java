package org.demo;

abstract class NetflixDisplay {
	
	public void display()
	{
		System.out.println("Inside netflix displayx");
	}
	
	abstract public void showNetflix();
}

abstract class HotstarDisplay{
	
	public void display()
	{
		System.out.println("Inside hotstar displayx");
	}
	
	abstract public void showHotstar();
}



 public class Abstraction extends NetflixDisplay{
	
	@Override
	public void showNetflix() {
		System.out.println("redirecting to the intalled netflix app!");
	}

	public static void main(String[] args) {
		
		Abstraction switch1 = new Abstraction();
		  switch1.display();
		  
		  switch1.showNetflix();
		
		
	

	}

}
