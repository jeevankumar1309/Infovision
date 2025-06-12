package org.demo;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[5];
		
		for(int i=0;i<5;i++)
		{
			numbers[i]=i+1;
		}
		
		try 
		{
		numbers[5]=6;
		}
		catch(ArrayIndexOutOfBoundsException  aib){
			
			System.out.println("Caught ArrayIndexOutOfBoundsException!");
			
		}
		
		try {
			
			int[] num = null; 
			System.out.println(num.length);
			
			
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("Caught NullPointerException!");
		}
		

	}

}
