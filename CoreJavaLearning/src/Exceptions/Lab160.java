package Exceptions;

import java.io.FileInputStream;

public class Lab160 {
	public static void main(String[] args)
	{
		
		
//Example of checked exception: They are known as compile time exception. It is like JVM is aware about the occurrence of an error and we are handling it with a customized exeception
        
		try
		{
		FileInputStream fs= new FileInputStream("Abhi.txt");
		}catch(Exception e)
		{
			System.out.println("Hadling the exceptions which are detected by JVM using 2 keywords called try-catch block");
		}
	


	

	String str= null;
	str.trim();
	//Example of Unchecked exception: They are  known as run time exception.		
	//In thiscase, though there is an error which  cannot detect by JVM.
    // Hence, it throws an error as "Nullpointerexception"	
}
}