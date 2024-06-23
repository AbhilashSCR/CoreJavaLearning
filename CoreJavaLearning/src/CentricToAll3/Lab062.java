package CentricToAll3;

public class Lab062 {

	public static void main(String[] args)
	{
		//Breaking the odd condition
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			{
				if(i%2==1)
				{
					break;
				}
			}
		}
		System.out.println("Printing the condition and then breaking");
		
		//one more with different logic
		for(int j=2; j<=10;j++)
		{
			if(j%2==1)
			{
				break;
			}
			System.out.println(j);
		}
		System.out.println("Breaking the condition and then printing");
}
}