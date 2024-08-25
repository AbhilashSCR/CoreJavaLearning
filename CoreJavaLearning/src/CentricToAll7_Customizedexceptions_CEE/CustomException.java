package CentricToAll7_Customizedexceptions_CEE;

public class CustomException extends Exception{

	CustomException(String msg)
	{
		super(msg);
		System.out.println("This is custom exception");
	}
}
