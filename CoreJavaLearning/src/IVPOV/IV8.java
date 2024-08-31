package IVPOV;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IV8 {

	
	public static void main(String[] args)
	{
		
		
		String path="C://Abhilash.txt";
		
		try {
			FileInputStream f= new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// Used try&catch block 