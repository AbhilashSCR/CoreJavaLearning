package CentricToAll4;

import java.util.Scanner;

public class Lab096 {
	
	public static void main(String[] args)
	{
		
	/***int[] elements= {12,24,36,48,60};
	
    int sum=0;
    
    for(int i=0;i<=elements.length-1;i++)
    {
    	sum=sum+elements[i];
    }
      int average=sum/elements.length;
      System.out.println("Average of the array is:"+average);***/
	
		
     //Using scanner class		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int number= sc.nextInt();
		
		int elements[]=new int[number];
		
		//Read the inputs from the user
		System.out.println("Enter the array elements");
		
		for(int i=0;i<=elements.length-1;i++)
		{
			elements[i]=sc.nextInt();
		}
		
		int sum=0;
		
		//Calculating the average
		
		for(int i=0;i<=elements.length-1;i++)
		{
			sum=sum+elements[i];
			
		}
		int average=sum/elements.length;
		System.out.println("Average of the array is :"+ average);
	}

}


