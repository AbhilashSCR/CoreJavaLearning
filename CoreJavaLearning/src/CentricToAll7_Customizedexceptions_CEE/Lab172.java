package CentricToAll7_Customizedexceptions_CEE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab172 {
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
	readfile("C://Abhilash");
		
}


	static void readfile(String Filename) throws FileNotFoundException {
		
		File file= new File(Filename);
		FileReader filereader= new FileReader(Filename);
		if(Filename.length()==0)
		{
			throw new FileNotFoundException();
		}
		System.out.println("Not vulnerable code");
		
	}
}