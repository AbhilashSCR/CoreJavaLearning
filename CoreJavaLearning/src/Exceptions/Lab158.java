package Exceptions;

public class Lab158 {

	public static void main(String[] args)
	{
		try
		{
		String name= null;
		name.trim();
		}
		catch (Exception e)
		{
			System.out.println("Unable to print the null");
			System.out.println("Using the exception mechanism");
		}
		
		
	}
}
