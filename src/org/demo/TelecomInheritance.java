package org.demo;

// base 
 class Telecom{
	public void telecomService()
	{
		System.out.println("Provides telecom service to world");
	}
}

 //
 class Verizon extends Telecom{
	
	public void telecomService() {
		System.out.println("Provides internet connection to USA");
	}
}

public class TelecomInheritance  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telecom ver = new Verizon();
	//	Telecom ob1 = new Verizon();
		
		Telecom tel = ver;
		
		tel.telecomService();
		//tel.internet();
		
		

	}

}
