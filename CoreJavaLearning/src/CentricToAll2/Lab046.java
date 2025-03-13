package CentricToAll2;
import java.util.Scanner;
public class Lab046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character, will let you know the number");
		char Char= sc.next().toCharArray()[0];
		
		switch(Char)
		{
		case 'A':
			System.out.println("First letter of name");
			break;
		case 'B':
			System.out.println("Second letter of name");
			break;
		case 'H':
			System.out.println("Third letter of name");
			break;
		case 'I':
			System.out.println("Fourth letter of name");
			break;
		default:
			System.out.println("No such letter in name");
		}
		
		
		
	}
}