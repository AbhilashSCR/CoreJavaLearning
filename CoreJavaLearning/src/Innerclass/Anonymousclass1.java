package Innerclass;

public class Anonymousclass1 {
	
	public static void main(String[] args)
	{
		
		Runnable r= new Runnable()
				{
			     @Override
			     public void run()
			     {
			    	 System.out.println("Using multithreading for parallel execution");
			     }
				};
				r.run();
	}
}
