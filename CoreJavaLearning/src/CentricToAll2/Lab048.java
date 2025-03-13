package CentricToAll2;
import java.util.Scanner;
public class Lab048 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Department code, will help you with the respective team");
		int departmentcode=sc.nextInt();
		
		switch(departmentcode)
		{
		//Note:We are not using break statement,hence it is an enhancement which works as break
        // just by adding arrow symbol before the print statement. This is allowed from jdk 13
		case 1 ->System.out.println("It is related to HR team");
		case 2 ->System.out.println("It is related to Finance and accouting team");
		case 3 ->System.out.println("It is related to Opertions team");
		case 4 ->System.out.println("It is related to Sales");
		case 5 ->System.out.println("It is related to Marketing");
		case 6 ->System.out.println("It is related to Digital marketing");
		case 7 ->System.out.println("It is related to Backend");
		
		}
	}

}
