package CentricToAll3;

public class Lab061 {

	public static void main(String[] args)
	{
		//Breaking the even condition in reverse order
		
		for(int i =10; i>=1; i--)
		{
			System.out.println(i);
			{
				if(i%2==0);
				{
					break;
				}
			}
		}
			System.out.println("Printing and then breaking the statement");
		
		
	
		//one more with different logic
		
		for(int j=10; j>=1; j--)
		{
			if(j%3==0)
			{
				break;
			}
			System.out.println(j);
			}
		
		System.out.println("Breaking the condition and then printing");
	}

}

		

