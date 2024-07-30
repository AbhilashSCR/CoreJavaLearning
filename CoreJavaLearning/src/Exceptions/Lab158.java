package Exceptions;

public class Lab158 {

	public static void main(String[] args)
	{
		try
		{
		String name= null;
		name.trim();
	    System.out.println("Unable to print the null");
		}
		catch (Exception e)
		{
			System.out.println("Using the exception mechanism");
		}
		
		
	}
}
