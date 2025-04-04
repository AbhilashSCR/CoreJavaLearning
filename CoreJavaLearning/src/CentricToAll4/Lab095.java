package CentricToAll4;

import java.util.Scanner;

public class Lab095 {

	
	public static void main(String[] args)

	{
		//Subtraction of array
		
	/***int[] elements= {95,65,10,5,1};
		int sub=elements[0];
		
		for(int i=elements.length-1; i>0;i--)
		{
			sub=sub-elements[i];
		}
		System.out.println("Subtraction of an array "+ sub);  ***/
		
		//Using scanner class
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int elements=sc.nextInt();
		int[] arr= new int [elements];
		
		//Read the array inputs from the user
		
		System.out.println("Enter the elementes of an array");
		for(int i=arr.length-1; i>=0; i--)
		{
		    arr[i]=sc.nextInt();
		}
		
		int sub=arr[arr.length-1];
		
		//Calculating the sub
		
		for(int i=arr.length-2; i>=0;i--)
		{
			sub=sub-arr[i];
		}
		
		System.out.println("Subtraction of array elements "+ sub);
		sc.close();
	}
}
