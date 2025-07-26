package Multithreading.Generics;

public class Generic1 {

	
	public static void main(String[] args)
	{
		
		datatypes("Abhilash");
		datatypes('M');
		datatypes(8977853645L);
		datatypes(5.5);
		
		
	}
	
	
	public static <DT> void datatypes(DT userdetails)
	{
		System.out.println(userdetails);
	}
	
}
