package CentricToAll4;

public class Lab111 {
	
	public static void main(String[] args)
	{
		int i = sum(16,15);
		System.out.println(i);
		int i1= sum(22);                  //Declaring of arguments
		System.out.println(i1);
		int i2=sum();
		System.out.println(i2);
		
		
}
	
	
	
	static int sum(int input1, int input2)     //Definition of the function
	{
		return input1+input2;
	}
	
	static int sum(int input1)
	{                                           //Sum: Name of the function
		return input1;
	}
	
	static int sum()
	{
		return 100;
	}
}
