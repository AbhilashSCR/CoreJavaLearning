package CentricToAll7_Customizedexceptions_CEE;

public class Lab173 {
	
	public static void main(String[] args) throws Exception 
	{
		
		name("Abhilash");
	}
	
	
	
	static void name(String Name) throws Exception
	{
		if(Name.length()==8)   //Since the condition is correct, it is throwing arithmeticexception
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Throwing customized exception");
		}
	}
}
