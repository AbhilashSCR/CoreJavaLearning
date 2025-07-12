package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab169 {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		myage(32);
		
	}
	
	
	static void myage(int eligibilityage) throws FileNotFoundException
	{
		
	
		if(eligibilityage>35)
		{
			throw new ArithmeticException("I cannot apply for psc services, anymore");
		}
		else
		{
			System.out.println("You meets the criteria of applying");
		}
		
		FileReader fr= new FileReader("D://Documents/Aadhar");
	}
}