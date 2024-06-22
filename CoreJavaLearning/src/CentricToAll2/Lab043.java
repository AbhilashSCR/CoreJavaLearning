package CentricToAll2;
import java.util.Scanner;
public class Lab043 {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the browser, will let you know who owns it");
		String browser=sc.next();
		
		switch(browser)
		{
		case "Chrome":
			System.out.println("Chrome is owned by Google");
			break;
	
		case "Firefox":
			System.out.println("Firefox is owned by Mozilla foundation");
			break;
			
		case "Edge":
			System.out.println("Edge is owned by Microsoft");
			break;
			
		case "Safari":
			System.out.println("Safari is owned by Apple");
			break;
		
		case "Opera":
			System.out.println("Opera is owned by Opera software");
			break;
			
        default:
        	System.out.println("There is no such browser");
		
		
		
		}

	}

}
