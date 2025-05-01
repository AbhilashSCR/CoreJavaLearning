package CentricToAll4;
import java.util.Scanner;
public class Lab119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1 ");
		int input_1=sc.nextInt();
		System.out.println("Enter the number 2 ");
		int input_2=sc.nextInt();
		System.out.println("Sum of both-->" + sum(input_1,input_2));
	
	
	}
	static int sum(int input_1,int input_2)
	{
		return input_1+input_2;
	}
	
	

	
}
