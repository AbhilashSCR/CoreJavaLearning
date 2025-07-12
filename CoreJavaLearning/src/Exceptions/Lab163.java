package Exceptions;

public class Lab163 {
	public static void main(String[] args)
	{
		//Various exception types handling mechanism individually
		
		 String  str="Abhilash";  //This should be passed in CLA
	        try {
	             int a= Integer.parseInt(args[0]);
	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	        }

	        try {
	            String str2=args[0];  //This should be passed in CLA
	            int b = Integer.parseInt(str2);
	            int c=b/0;
	        } catch (ArithmeticException e) {
	            e.printStackTrace();
	        }

	  //Note: Since we  are not passing any argument in CLA , it is throwing the below exception
	        try {
	            String str1 = args[0];
	        } catch (ArrayIndexOutOfBoundsException e) {
	            e.printStackTrace();
	        }
	    }
	}

