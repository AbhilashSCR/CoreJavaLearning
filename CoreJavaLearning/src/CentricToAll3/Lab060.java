package CentricToAll3;

public class Lab060 {
	
	public static void main(String[] args)
	{
		//Breaking the even condition 
		
		for(int i=3;i<=15;i++)
		{
			System.out.println(i);
		if(i%2==0)
		{
			break;
		}
		}
		System.out.println("Printing and then breaking the condition");
		
		//one more with different logic
		
		for(int i =1; i<=10; i++)
		{
			if(i==3)
			{
				break;
			}
				System.out.println(i);
			}
		
		System.out.println("Breaking the statement and then printing");
		
		
	}
}



