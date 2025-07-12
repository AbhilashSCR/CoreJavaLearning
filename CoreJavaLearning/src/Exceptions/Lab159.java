package Exceptions;

public class Lab159 {
	
	public static void main(String[] args)
	{
		
		String str=args[0];
		int a= Integer.parseInt(str);
		int b= a/10;
		int c=a/b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);		
	}

}

//Without passing the arguments and running the code, get to see "ArrayIndexOutOfBoundsException"
//Passing the string as arguments for int conversion, get to see "NumberFormatException"
//Passing 0 as argument, get to see "ArithmeticException"
