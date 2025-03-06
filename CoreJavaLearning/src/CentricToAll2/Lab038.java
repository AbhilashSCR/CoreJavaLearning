package CentricToAll2;
import java.util.Scanner;
public class Lab038 {

	public static void main(String[] args)
	{
		
		
		//Grade calculator based on obtained marks/6 subjects
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the total marks obtained:");
		int marks=sc.nextInt();
		
		
		if(marks >=540 && marks <=550)
		{
			System.out.println(" You secured grade A");
		}
		
		else if (marks >=450 && marks <=539)
		{
			System.out.println("You secured grade B");
		}
		
		else if (marks >=350 && marks<=449)
		{
			System.out.println("You secured grade C");
		}
		else if (marks >=300 && marks <=349)
		{
			System.out.println("You secured grade D");
		}
		else if(marks >=210 && marks<=299)
		{
			System.out.println("You secured grade E");
		}
		else
		{
			System.out.println("You secured grade F");
		}
		
	}
}