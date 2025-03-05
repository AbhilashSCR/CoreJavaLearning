package CentricToAll2;

public class Lab033 
{
	public static void main(String[] args)
	{
		//Java provides statements that are used to control the flow of the code, such statements are called control statements
		//Which helps to  run  the smooth flow of the code.
		
		
		/*Decision statements:
		 * if condition executes,when the condition is true.
		 * if else condition executes when the if condition is false
		 * else if condition executes multiple conditions till it is found true
		 * Nested if is if condition with in if condition
		 */
		
		
		boolean b=false;
		
		if(b==false)
		{
			System.out.println("The value of the boolean declared as false");
		}
		
		boolean b1=true;
		
		if(b1=true)
		{
			System.out.println("The Value of the boolean declared as true");	
			
		}
		else
		{
			System.out.println("The value of the boolean declared as false");
		}
		
		byte rangeinbits=8;
		int rangeinbits2=64;
		
		if(rangeinbits>rangeinbits2)
		{
			System.out.println("Byte size: 8 bits");
		}
		
		else
		{
			System.out.println("Int size: 64 bits");
		}
	}

}