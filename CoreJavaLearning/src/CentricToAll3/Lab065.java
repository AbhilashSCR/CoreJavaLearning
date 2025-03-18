package CentricToAll3;

public class Lab065 {
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			{
				if(i==5)
				{
					continue;
				}
				
			}
		}
		System.out.println("It prints the condition without skipping");
		
		 //In reverse order
		
		for (int i=10; i>=1; i--)
		{
		
			System.out.println(i);
			{
				if(i==7)
				{
					continue;
				}
			}
           }
		
	System.out.println("It prints the condition without skipping");
	
	//Checking for a String
	
	for(int i=1;i<=6;i++)
	{
		System.out.println("Abhilash");
		{
			if(i==6)
			{
				continue;
			}
		}
	}
	System.out.println("It prints the condition as specified");
}
}
