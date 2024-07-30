package Exceptions;

public class Lab162 {

	public static void main(String[] args)
	{
		
		int a =10;
		try {
		a=Integer.parseInt(args[0]); 
		//Passing the argument as 1 ,which is the output of print statement
		System.out.println(a);
		}
		catch (Exception e)
		{
		System.out.println("Handling the exception");
		}
		//Handling the exception without passing the arguments
		
		
	}
}
