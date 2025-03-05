package CentricToAll2;
import java.util.Scanner;

public class Lab036 {
	
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Number 1");
		short number1=sc.nextShort();
		System.out.println("Number 2");
		short number2=sc.nextShort();
		
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
