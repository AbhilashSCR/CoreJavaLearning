package CentricToAll7_Customizedexceptions_CEE;

public class CustomException1 extends Exception
{
	CustomException1(String msg)
	{
		super(msg);
		System.out.println("Since both are different kind of loans, cannot append");
	}
}
