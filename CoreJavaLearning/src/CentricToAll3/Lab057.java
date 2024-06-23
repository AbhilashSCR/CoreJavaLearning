package CentricToAll3;

public class Lab057 {
	
	private static int i;

	public static void main(String[] args)
	{

		
		//Checking for integer in descending order
		
		for (int i=10; i>=1; i--)
		{
			System.out.println(i); 
		
		if(i==6)  //
		{
			break;
		}
	}
		System.out.println("It prints the condition and then breaks");
		
		//One more
		
		for (int i=1; i<=10;i++)
		{
			System.out.println(i);
			
		if(i==4)
		{
			break;  
		
	    }
       }
		System.out.println("It prints the condition and then breaks");
		
		
		//Checking for string
		 
	     for(i=1; i<=10; i++)
	     {
	    	 System.out.println("Abhilash");
	    	 if(i==2)
	    	 {
	    		 break;
	    	 }
	     }
	     System.out.println("It prints the condition and then breaks");
	}
	
}



