package Exceptions;

public class Lab169 {
	
	public static void main(String[] args)
	{
		try
		{
		String name= null;
		name.length();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

//Trying to fetch the length of a null. It throws a default error message.
// Since we are using getMessage() function.