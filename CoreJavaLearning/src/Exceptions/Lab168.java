package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab168 {

	
	public static void main(String[] args) throws FileNotFoundException 
	
	
	{
		
		
		main("Abhilash");
		
	
	}
		
		
     static void main (String a) throws FileNotFoundException
     {
    	 
    	 
    	 FileReader f= new FileReader("C://Documents/Image");  //It throws the error and terminate the program
    	 
    	 if(a.equalsIgnoreCase(a))
    	 {
    		 throw new ArithmeticException();
    	 }
    	 
     }
		
		
		
		
		
	}



