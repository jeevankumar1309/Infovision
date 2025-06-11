package org.demo;

@FunctionalInterface
interface Laptop{
	
	public  void specs();
	public static void jk() {
		System.out.println("Window/ Mac/ Linux");
	}
	
}

interface Pc{
	public void os();
	
	public void storage();
	
}

public class Interface implements Pc,Laptop {
	
	@Override
	public void specs()
	{
		System.out.println("Laptop has specs of ram 16gb");
	}
	
	@Override
	public void os()
	{
		System.out.println("PC has os of ios");
	}
	
	@Override
	public void storage()
	{
		System.out.println("available storage of 256 GB/512 GB/ 1 TB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface ob1 = new Interface();
		//System.out.println();
		
		ob1.specs();
		ob1.os();
		ob1.storage();

	}

}
