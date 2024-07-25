package CentrictoAll6_Variabletypes;

public class StaticDemo {
	
	//Static variable cannot be a local variable
	
	public static String college_name="TKRCET";
	
	//Non-Static variable=Local variable or Instance variable
    //Instance variable: Is declared with the class but outside the body of the method. It cannot be declared as static
    //local variable: Is declared with the body of the method. It cannot be declared as static

	
	public int passout=2018;
	
	
	//Static method
	public static void printname()
	{
		System.out.println("I studied in :"+college_name);
		//System.out.println(passout);
		//Cannot have an instance/non-static variable in static method
	}
	
	//Non-static method
	
	public void printyear()
	{
		System.out.println("Year of passout :"+passout);
		//But we can have static variable in non-static method
		System.out.println("From the branch ECE");
	}
}
