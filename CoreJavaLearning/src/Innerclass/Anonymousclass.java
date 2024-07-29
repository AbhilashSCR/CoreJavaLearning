package Innerclass;

public class Anonymousclass {
	
	public static void main(String[] args)
	{
	
		//Anonymous classes are used with threading concept
		Thread t= new Thread()
				{
			     @Override
			     public void run()
			     {
			    	 System.out.println("I a new thread!");
			     }
				};
				t.run();   //Running the function outside the main method
		   
	}
}




