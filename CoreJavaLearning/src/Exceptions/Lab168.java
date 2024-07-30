package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab168 {

	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		String remoteserver_path= "Remoteserver/A/14";
		File file= new File(remoteserver_path);
		FileReader filereader= new FileReader(file);
		
		
	}
}


