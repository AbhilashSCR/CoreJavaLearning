package CentricToAll2;

import java.util.Scanner;

public class Lab042 {
  public static void main(String[] args)
  {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the month:");
	  String month=sc.nextLine();
	  
	  switch(month)
	  {
	  case "January":
		  System.out.println("It consist of 31 days");
		  break;
	  case "February":
		  System.out.println("It consist of 28 days");
		  break;
	  case "March":
		  System.out.println("It consist of 31 days");
		  break;
	  case "April":
		  System.out.println("It consist of 30 days");
		  break;
	  case "May":
		  System.out.println("It consist of 31 days");
		  break;
	  case "June":
		  System.out.println("It consist of 30 days");
		  break;
	  case "July":
		  System.out.println("It consist of 31 days");
		  break;
	  case "August":
		  System.out.println("It consist of 31 days");
		  break;
	  case "September":
		  System.out.println("It consist of 30 days");
		  break;
	  case "October":
		  System.out.println("It consist of 31 days");
		  break;
	  case "November":
		  System.out.println("It consist of 30 days");
		  break;
	  case "December":
		  System.out.println("It consist of 31 days");
		  break;
	  default :
	      System.out.println("Out of context");
		  
	  }
	  }
	  
  }
  
  
	  
	  
