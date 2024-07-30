package Exceptions;

public class Lab170 {
	
	public static void main(String[] args)
	{
		extracted2();
		System.out.println("Main function");
		
		
	}	
	
   private static void extracted2()
	
	{
		extracted1();
		System.out.println("Extracted two will be executed");
	}
	
	
	
	private static void extracted1()
	
	{
		extracted();
		System.out.println("Extracted one will be executed");
	}
	
	
	private static void extracted()
	{
		try
		{
		String name=null;
		name.length();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
