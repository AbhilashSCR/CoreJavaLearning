package CentricToAll7_Customizedexceptions_CEE;

import java.io.File;
import java.io.FileReader;

public class Lab176 {
	
	public static void main(String[] args) throws Exception 
	{
		main(10);
	}
	
	//In-this case it throws default exception called java.lang.Exception
	static void main(int a) throws Exception 
	{
		//FileReader F= new FileReader(new File("C://Abhilash.txt"));
		if (a==10)
		{
			throw new Exception();  
		}
		else
		{
			System.out.println("Filtered");
		}
	}

}
