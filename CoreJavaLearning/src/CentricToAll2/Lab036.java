package CentricToAll2;
import java.util.Scanner;

public class Lab036 {
	
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Entered the number 1");
		int number1=sc.nextInt();
		System.out.println("Entered the number 2");
		int number2=sc.nextInt();
		
		if(number1>number2)
			
		{
			System.out.println("Fetched the maximum number-->" + number1);
		}
		else
		{
			System.out.println("Given number is doesnot satisfy the condition");
		}
	}

}
