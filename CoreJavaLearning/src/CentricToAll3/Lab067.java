package CentricToAll3;

public class Lab067 {
	public static void main(String[] args)
	{
		//Skipping the even condition in reverse order
		for(int i=10;i>=1;i--)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("It skips the even numbers and prints the odd numbers");
	
		
	//Skipping the odd condition in reverse order
		
		for (int i=10; i>=1; i--)
		{
			if(i%2==1)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("It skips the odd numbers and prints the even numbers");
		
	
	}
}
