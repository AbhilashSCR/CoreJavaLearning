package CentricToAll2;
import java.util.Scanner;
public class Lab047 {
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the counter number, will let you know the operations");
		int counter=sc.nextInt();
		
		switch(counter)
		{
		case 1,2,3:  //Adding multiple values in the case is allowed from JDK 13 version
			System.out.println("They are dedicated for cash deposits");
		break;
		case 4,5:
			System.out.println("They are dedicated for cash withdrawl");
		break;
		case 6,7,8:
			System.out.println("They are dedicated for phonebanking service");
		break;
		case 9,10:
			System.out.println("They are dedicated for managerial team");
		break;
		default:
			System.out.println("End of the counters");
			
		}
		
		
	}

}
