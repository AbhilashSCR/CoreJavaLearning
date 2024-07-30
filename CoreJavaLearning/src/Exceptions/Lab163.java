package Exceptions;

public class Lab163 {
	public static void main(String[] args)
	{
		//Various exception types handling mechanism individually
		
		/***int a =10;
		try
		{
			 a=Integer.parseInt(args[0]);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}***/                             
		
	//It throws an ArrayIndexOutOfBoundsException error
		
		/***int b=10;
		try
		{
		int c=Integer.parseInt(args[0]);
		    int d=b/c;
			
		}catch (Exception e)
		{
			e.printStackTrace();
		} ***/
		
		//It throws an ArithmeticException 
		
		
		try
		{
		String str=args[0];
		int e=Integer.parseInt(str);
		}catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		//It throws a NumberFormatException
	}

}
