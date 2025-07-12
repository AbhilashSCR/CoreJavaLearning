package Exceptions;

public class Lab161 {
	
	public static void main(String[] args)
	{
		try
		{
		String str=args[0];
		int a = Integer.parseInt(str);
		int b=a/10;
		}
		/***catch (ArrayIndexOutOfBoundsException  | NumberFormatException | ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}***/
		
		 catch (Exception e){                               //Adding multiple catch block, In case of different from above exceptions
	          System.out.println(e.getMessage());
	          e.printStackTrace();      //prints directly to the console. It doesn't return a String,
	        }

	      finally {
	         System.out.println("Mandatory executed");            //Finally keyword statement will be executed for sure.
	      }
	    }

	}


