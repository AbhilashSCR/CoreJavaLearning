package CentricToAll2;
import java.util.Scanner;
public class Lab046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character,will reveal the category");
      char character=sc.next().toCharArray()[0];
      
      switch(character)
      {
      case 'a':
    	  System.out.println("Entered character is a vowel");
    	  break;
      case 'e':
    	  System.out.println("Entered character is a vowel");
    	  break;
      case 'i':
    	  System.out.println("Entered character is a vowel");
    	  break;
      case 'o':
    	  System.out.println("Entered character is a vowel");
    	  break;
      default:
    	  System.out.println("Entered character is a consonant");
      }
	}

}
