package CentricToAll2;

import java.util.Scanner;

public class Lab037 {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of A ");
		int a= sc.nextInt();
		System.out.println("Enter the value of B ");
		int b =sc.nextInt();
		System.out.println("Enter the value of C ");
		int c =sc.nextInt();
		if (a+b+c==270)
	    {
	    	System.out.println("a is largest among all");
	    }
	    else if(b+c==170)
	    {
	    	System.out.println("b is second largest number among all");
	    }
		
	    else
	    {
	    	System.out.println("c is least number among all");
	    }
	}

}
