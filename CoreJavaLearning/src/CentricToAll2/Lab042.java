package CentricToAll2;
import java.util.Scanner;
public class Lab042 {
  public static void main(String[] args)
  {
	  
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the name of the month, I will reveal the no. of days");
	  String month=sc.next();
	  
	  switch(month)
	  {
	  case "January":
		  System.out.println("Jan. consists of 31 days");
		  break;
	
	  case "February":
		  System.out.println("Feb. consists of 28 days");
		  break;
	  
	  case "March":
		  System.out.println("Mar consists of 31 days");
		  break;
		  
	  case "April":
		  System.out.println("Apr consists of 30 days");
		  break;
		  
	  case "May":
		  System.out.println("May consists of 31 days");
		  break;
		  
	  case "June":
		  System.out.println("Jun consists of 30 days");
		  break;
		  
	  case "July":
		  System.out.println("Jly consists of 31 days");
		  break;
		  
	  case "August":
		  System.out.println("Aug consists of 31 days");
		  break;
		  
	  case "Septemeber":
		  System.out.println("Sep consists of 31 days");
		  break;
		  
	  case "October":
		  System.out.println("Oct consists of 31 days");
		  break;
		  
	  case "November":
		  System.out.println("Nov consists of 30 days");
		  break;
	  case "December":
		  System.out.println("Dec consists of 31 days");
		  break;
	  default:
		  System.out.println("No such month name");
		  
	  }
	  
  }
}
