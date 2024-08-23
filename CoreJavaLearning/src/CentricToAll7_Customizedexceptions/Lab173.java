package CentricToAll7_Customizedexceptions;

public class Lab173 {
	
	public static void main(String[] args) throws Exception 
	{
		main("Abhilash");
	
	}
	//Note:It is mandate to pass a "throws exception" in the function and also in the main method
	static void main(String a) throws Exception {
	
		//Note: Since the condition is false, get to see the customized exception
		if (a.equalsIgnoreCase("a"))
		{
			throw new ArithmeticException();
		}
		System.out.println("Throwing customized exception");
	}

}
