package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab167 {

	public static void main(String[] args) 
	{
	
	try {
		String Software_installation_path="C/Programfiles/Java";
		File file= new File(Software_installation_path);
		FileReader filereader= new FileReader(file);
		
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}

	
	//Handling the file not found exception using try-catch block
}
}