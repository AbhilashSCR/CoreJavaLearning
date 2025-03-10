package CentricToAll2;

import java.util.Scanner;

public class Lab041 {
 public static void main(String[] args)
 {
	 //Break loop or Switch statement is used to Break the current flow of the code at the specified condition
     //It executes one statement from multiple conditions
     //Each case statement can have a break statement, which is optional.
     //If the break statement is not found, it executes the next case/cases as well

	 
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.print("Given Daynumber represents:");
	 int daynumber=sc.nextInt();
	 
	 
	 switch(daynumber)
	 {
	 case 1:
	    System.out.println("Sunday is named after sun");
	 break;
	 case 2:
		 System.out.println("Monday is named after moon");
	 break;
	 case 3:
		 System.out.println("Tuesday is named after mars");
	 break;
	 case 4:
		 System.out.println("Wednesday is named after mercury");
	 break;
	 case 5:
		 System.out.println("Thursday is named after jupiter");
	 break;
	 case 6:
		 System.out.println("Friday is named after venus");
	 break;
	 case 7:
	     System.out.println("Saturday is named after saturn");
	 break;
	 default:
		 System.out.println("No such day enlisted");
	 
	 }
	 
 }
 }

