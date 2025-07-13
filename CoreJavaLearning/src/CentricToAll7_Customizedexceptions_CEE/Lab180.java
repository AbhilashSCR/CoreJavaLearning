package CentricToAll7_Customizedexceptions_CEE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab180 {

	public static void main(String[] args)
	{
		String path="c://Abhilash.txt";
		try {
			FileReader f= new FileReader(new File("c://Abhilash.txt"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//In this case, we have a choice of using try&catch block or throws keyword at the method level
