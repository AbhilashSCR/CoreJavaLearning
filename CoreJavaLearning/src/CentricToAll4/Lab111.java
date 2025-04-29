package CentricToAll4;

public class Lab111 {
	
	public static void main(String[] args)
	{
		
		int a=sum(14,17);
		System.out.println(a);
		int b=sub(74,32);
		System.out.println(b);
		int c=mul(15,18);
		System.out.println(c);
		int d=div(145,25);
		System.out.println(d);
		int e=mod(625,25);
		System.out.println(e);
		
		
	}
	
	//Defining the code outside the main method is known as function
	
	static int sum(int input_1, int input_2)
	{
	     return input_1+input_2;
}
	
	static int sub(int input_3, int input_4)
	{
		return input_3-input_4;
	}
	
	static int mul(int input_5, int input_6)
	{
	return input_5*input_6;
}
	static int div(int input_7,int input_8)
	{
		return input_7/input_8;
	}
	static int mod(int input_9,int input_10)
	{
		return input_9%input_10;
	}
}


