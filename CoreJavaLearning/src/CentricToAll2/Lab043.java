package CentricToAll2;
import java.util.Scanner;
public class Lab043 {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  name of the browser, it reveals who owned it: ");
		String browser= sc.next();
		
		switch (browser)
		{
		case "Chrome":
			System.out.println("It is owned by Google");
			break;
		case "Edge":
			System.out.println("It is owned by Microsoft");
			break;
		case "Firefox":
			System.out.println("It is owned by Mozilla");
			break;
		case "Safari":
			System.out.println("It is owned by Apple");
			break;
		default:
			System.out.println("Out  of web");
			break;
		}
		System.out.println("End of program");

	}

}
