package CentricToAll4;

import java.util.Scanner;

public class Lab098 {
	
	public static void main(String[] args)
	{
		//Sum of even and odd numbers in an array
		/***int[] number= {14,12,25,27,64,43};
		
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<=number.length-1;i++)
		{
			if(number[i] %2==0)
			{
				evensum += number[i];
			}
			else
			{
				oddsum += number[i];
			}
		}***/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int number=sc.nextInt();
		
		int[] elements= new int[number];
		int evensum=0;
		int oddsum=0;
		
		//Read the input from the user
		
		System.out.println("Enter the elements in an array");
		for(int i=0;i<=elements.length-1;i++)
		{
			
			elements[i]=sc.nextInt();
			
		}
		
		//Calculating sum of even and odd numbers
		
		for(int i=0;i<=elements.length-1;i++)
			
			if(elements[i] %2==0)
			{
				evensum += elements[i];
			}
			else
			{
				oddsum += elements[i];
			}
		
		
		
		
		System.out.println("Sum of even numbers "+ evensum);
		System.out.println("Sum of odd numbers "+ oddsum);
	
	}

}
