package Exceptions;

public class Lab164 {
	
	public static void main(String[] args)
	{
		//Handling the arithmetic exception without passing arguments
		try
		{
		int a=0;
		int b=0;
		int c=a/b;
		}catch (Exception e)
		{
			System.out.println("Please try later"); //Customized exception
			e.printStackTrace();  //However it throws the exception
			//System.exit(0);	 //It exit the execution of the code, where it is defined.
			
		}
		
		finally
		{
			System.out.println("Mandate to print, incase of exit is disabled");
		}
		
		
		
	}

}
