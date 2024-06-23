package CentricToAll3;

public class Lab066 {
	
	public static void main(String[] args)
	{
		//Skiping the even condition
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	
	System.out.print("It skips the even numbers and prints the odd numbers");
	
	
	//Skiping the odd condition
	 for(int i=0;i<=10;i++)
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
