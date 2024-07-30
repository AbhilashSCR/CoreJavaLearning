package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab167 {

	public static void main(String[] args) throws FileNotFoundException
	{
		
		String Software_installation_path="C/Programfiles/Java";
		File file= new File(Software_installation_path);
		FileReader filereader= new FileReader(file);
		
		
		
	}
}
