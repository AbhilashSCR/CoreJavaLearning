package CentricToAll4;

import java.util.Scanner;

public class Lab099 {
	
	public static void main(String[] args)
	{
		int numbers[]= {12,14,16,19,23,27,29,33,37,40};
		
		System.out.println("Even numbers");
		for(int i=0;i<=numbers.length-1;i++)
		{
			if(numbers[i]  %2 ==0)
			{
				System.out.println(numbers[i] + " "); 
			}
		}
		
		System.out.println("Odd numbers");
		for(int i=0;i<=numbers.length-1;i++)
		{
			if(numbers[i] %2 !=0)
			{
				System.out.println(numbers[i] +" ");
			}
		}
	}
	
	}

		

	