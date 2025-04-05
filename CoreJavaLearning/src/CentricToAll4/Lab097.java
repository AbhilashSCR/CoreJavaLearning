package CentricToAll4;

import java.util.Scanner;

public class Lab097 {

	public static void main(String[] args)
	{
		int[] numbers= {14,25,37,44,56,61,72,87,99};
		
		int evencount=0;
		int oddcount=0;
		
		
	   //Using for each loop
		
	/*** for(int num: numbers)
		{
			if( num % 2 == 0)
			{
				evencount++;
		}
		else
		{
			oddcount++;
		}
		} ***/
		
		//Using for loop
		
		/***for(int i=0;i<=numbers.length-1;i++)
		{
			if(numbers[i] % 3==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}***/
		
		
		//Using Scanner class
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int number=sc.nextInt();
		
		int[] elements=new int[number];
		{
			//Read the inputs from the user
			System.out.println("Enter the elements:");
			for(int i=0; i<=elements.length-1;i++)
			{
				elements[i]=sc.nextInt();
			}
			
			//Calculating the even and odd number count
			
			for(int i=0;i<=elements.length-1;i++)
			{
				if(elements[i]%2==0)
				{
					evencount++;
				}
				else
				{
					oddcount++;
				}
			}
		System.out.println("Even numbers count: "+evencount);
		System.out.println("Odd numbers count: "+oddcount);
		sc.close();
		
		
	}
}
	}
	

