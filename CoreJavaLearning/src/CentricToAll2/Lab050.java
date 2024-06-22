package CentricToAll2;
import java.util.Scanner;
public class Lab050 {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a =sc.nextDouble();
		System.out.println("Enter the value of b");
		double b=sc.nextDouble();
		System.out.println("Enter th value of c");
		double c=sc.nextDouble();
		
		double result;
		
		result=Math.sqrt(Math.pow(a, b)+Math.pow(b, a)-Math.abs(c));
		System.out.println(result);
		
		
	}

}
