package Exceptions;

public class Lab165 {

	public static void main(String[] args)
	{
		//Ideally it should throw an arithmetic exception, however we are customizing exception 
		
		try
		{
		int incorrect_amount=0;  
		int txn_amount_debited=1000;
		boolean txn_failure=true;
		int b=txn_amount_debited/incorrect_amount;
		}
		catch(Exception e)
		{
			System.out.println("Sorry for the inconvenience , debited amount will be auto credited in 10min");
		}
		
		
	}
}
