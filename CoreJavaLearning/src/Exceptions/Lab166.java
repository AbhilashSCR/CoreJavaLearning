package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab166 {
	
	//Handling the exception using throws keyword and relevant packages
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		
		
		
		String path="D/Personaldoc/Pancard.jpg";
		File file= new File(path);
		FileReader filereader= new FileReader(file);
		
	}

}
