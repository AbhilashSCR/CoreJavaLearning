package CentricToAll2;
import java.util.Scanner;
public class Lab035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//if else condition using scanner class.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number below");
		int number= sc.nextInt();
		
		if (number%2==0)
		{
			System.out.println("Given number is an even number");
		}
		else
		{
			System.out.println("Given number is an odd number");
		}
		
		
	}

}
