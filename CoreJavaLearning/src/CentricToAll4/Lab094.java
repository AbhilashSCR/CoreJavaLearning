package CentricToAll4;

import java.util.Scanner;

public class Lab094 {
	
	public static void main(String[] args)
	{
		
		//Sum of array elements 
/****		int[] elements= {45,65,47,78,41};
		
		int sum=0;
		
		for(int i=0;i<elements.length;i++)
		{
			sum=sum+elements[i];
		}
		
		System.out.println("Sum of Array elements : " +sum );***/
		
		//Using Scanner class
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int elements=sc.nextInt();
		
		int[] arr=new int[elements];
		
		//Read the elements from the user
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		
		//calculate the sum
		
		for(int i=0; i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of Array elements : "+sum);
		sc.close();
	
	}
}

