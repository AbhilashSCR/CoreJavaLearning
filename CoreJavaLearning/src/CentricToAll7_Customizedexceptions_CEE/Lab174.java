package CentricToAll7_Customizedexceptions_CEE;

public class Lab174 {
	public static void main(String[] args) throws Exception 
	{
		thanking("Abhilash Sharma Vemula");
	
	}
	//Note:It is mandate to pass a "throws exception" in the function and also in the main method
	static void thanking(String person) throws Exception {
	
		//Note: Since the condition is false, get to see the customized exception
		if (person.equals("Abhilash Sharma Vemula"))
		{
			throw new ArithmeticException();
		}
		System.out.println("Throwing customized exception");
	}

}


