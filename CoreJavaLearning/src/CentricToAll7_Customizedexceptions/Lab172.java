package CentricToAll7_Customizedexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab172 {
	public static void main(String args[]) throws Exception 
	{
		readfile("C://Abhilash.txt");
		
		
	}
	
	static void readfile(String Filename) throws Exception {
	File f= new File(Filename);
	FileReader filereader= new FileReader(Filename);
	if (Filename.length()==0)
	{
		throw new FileNotFoundException();
	}
	
	System.out.println("File not found exception");
	
}
}