package CentricToAll2;
import java.util.Scanner;
public class Lab038 {

	public static void main(String[] args)
	{
		
		
		//Grade calculator based on obtained marks/6 subjects
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the obtained total marks:");
		int marks=sc.nextInt();
		
		if(marks>=540 && marks<550)
		{
			System.out.println("You have secured A+");
		}
		else if(marks>=480 && marks<500)
		{
			System.out.println("You have secured A");
			
		}
		else if(marks>=450 && marks<480)
		{
			System.out.println("You have secured B");
		}
		else if(marks>=420 && marks<450)
		{
			System.out.println("You have secured C");
		}
	   
		else if(marks>=390 && marks<420)
		{
			System.out.println("You have secured D");
		}
		else if(marks>=360 && marks<390)
		{
			System.out.println("You have secured E");
		}
		else
		{
			System.out.println("Not intrested in securing marks");
		}
		
	}
}
