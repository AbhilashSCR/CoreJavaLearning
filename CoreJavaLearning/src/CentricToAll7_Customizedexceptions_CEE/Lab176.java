package CentricToAll7_Customizedexceptions_CEE;

import java.io.File;
import java.io.FileReader;

public class Lab176 {
	
	public static void main(String[] args) throws Exception
	{
		main("Abhilash");
	}
	
	//In-this case it throws default exception
	static void main(String a) throws Exception 
	{
		FileReader F= new FileReader(new File("C://Abhilash.txt"));
		if (a.equalsIgnoreCase("a"))
		{
			throw new ArithmeticException();
		}
	}

}
