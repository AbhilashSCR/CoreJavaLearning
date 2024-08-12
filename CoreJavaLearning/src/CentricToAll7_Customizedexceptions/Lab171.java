package CentricToAll7_Customizedexceptions;

public class Lab171 {
	
	
	public static void main(String[] args) throws Exception
	{
		
		//Note: Throw keyword is used at the object level and throws keyword is used at the method level
        //Note:We are using  throw and throws keyword, in-order to create a customized exception
		
		//int a=10/0;
		//System.out.println(a);
		
		//In this case JVM will throw an exception
		
		
		//Here we are extracting using private keyword
		extracted(5);  //Passing the parameter
		throw new Exception("Exceptions are something which is handeled  by the user");
		
	}

	private static void extracted(int c) {
		int b;
		if(c==5)
		{
			throw new ArithmeticException("Intentionally falling case");
		}
		b=10/c;
		System.out.println(b);
	}
	
	

}


