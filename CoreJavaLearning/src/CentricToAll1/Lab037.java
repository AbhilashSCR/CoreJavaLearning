package CentricToAll1;
import java.util.Scanner;

public class Lab037 {
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number 2");
		int number2=sc.nextInt();
		System.out.println("Enter the number 1");
		int number1=sc.nextInt();
		
		if(number2>number1)
		{
			System.out.println("Given number is larger-->"+number2);
			
		}
		else
		{
			System.out.println("Given number does not satisfy the condition");
		}
	}

}
