package CentricToAll7_Customizedexceptions;

public class Lab175 {
	public static void main(String[] args) throws Exception 
	{
		main("Abhilash");
	
	}
	//Note:It is mandate to pass a "throws exception" in the function and also in the main method
	static void main(String a) throws Exception {
	
		//Note: Since the condition is true, get to see the default exception
		if (a.equals(a))
		{
			throw new ArithmeticException();
		}
		System.out.println("Throwing customized exception");
	}

}



