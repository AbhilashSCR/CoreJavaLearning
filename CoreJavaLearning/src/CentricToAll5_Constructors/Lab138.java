package CentricToAll5_Constructors;

import java.util.Scanner;

public class Lab138 {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first employee name");
		String employee=sc.next();
		emp e= new emp(employee);
		e.printdetails();;
		
		System.out.println("Enter the second employee name");
		String employee1=sc.next();
		emp e1= new emp(employee1);
		e.printdetails();
		
		
		System.out.println("Enter the third employee name");
		String employee2= sc.next();
		emp e2= new emp(employee2);
		e2.printdetails();
		
	}

}
