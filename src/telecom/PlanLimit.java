package telecom;

 class PlanLimit {
	
	public void checkLimit()
	{
		System.out.println("Total call limit : 5 calls");
	}

}

 class MessageLimit extends PlanLimit{
	 
	 @Override
	 public void checkLimit()
		{
			
			System.out.println("Total message limit : 10 messages");
			
		}
	
}

 class InternetLimit extends PlanLimit{
	 
	 @Override
	 public void checkLimit()
		{
			
			System.out.println("Total Internet limit : 5 GB");
			
		}
	
}