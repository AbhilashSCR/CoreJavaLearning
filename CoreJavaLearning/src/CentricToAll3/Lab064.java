package CentricToAll3;

public class Lab064 {

	public static void main(String[] args)
	{
		
		for(int i=1;i<=10;i++)
		{
			if(i==4)
			{
				continue; //It skips the condition
			}
			System.out.println(i);
		}
		System.out.println("It skips the specified condtion, continues to print rest");
		
		
		
		
		//In reverse order
		for(int i=10;i>=1;i--)
		{
			if(i==7)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("It skips the specified condition, continues to print rest");
		
		
		//Checking for a String
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println("Abhilash");
		}
		System.out.println("It skips the specified condition, continues to print rest");
	}
}


