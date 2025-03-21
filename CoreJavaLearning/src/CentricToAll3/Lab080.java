package CentricToAll3;
import java.util.Scanner;
public class Lab080 {
 
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+ number + " is "+ fact);
		
	}
}
