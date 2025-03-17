package CentricToAll3;
import java.util.Scanner;
public class Lab051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Using PDT and NON-PDT
		
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter an employee name");
	     String employeename=sc.next();
	     
	     System.out.println("Enter an employee id ");
	     int employeeid=sc.nextInt();
	     
	     System.out.println("Enter the blood group");
	     char bloodgroup=sc.next().toCharArray()[0];
	     
	     System.out.println("Enter the contact number");
	     long contactnumber=sc.nextLong();
	     
	     
		
		System.out.println("Here are employee details "+ employeename+ "/" + employeeid+ "/" + bloodgroup + "/"+contactnumber);
		
        sc.close();
	}

}
