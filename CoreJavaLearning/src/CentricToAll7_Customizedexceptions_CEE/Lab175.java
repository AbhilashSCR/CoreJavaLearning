package CentricToAll7_Customizedexceptions_CEE;

public class Lab175 {
	public static void main(String[] args) throws Exception 
	{
		balance(100);
	
	}
	//Note:It is mandate to pass a "throws exception" in the function and also in the main method
	static void balance(int account) throws Exception {
	
		//Note: Since the condition is true, get to see the default exception
		if (account ==(1000))
		{
			throw new ArithmeticException();
		}
		System.out.println("Throwing customized exception");
	}

}



