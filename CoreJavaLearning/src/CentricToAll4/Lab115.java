package CentricToAll4;

public class Lab115 {

	public static void main(String[] args)
	{
		
		int i= div(56,6);
		System.out.println(i);
		int i1= div(256,112,64);
		System.out.println(i1);
		
	}
	
	static int div(int input_1, int input_2)
	{
		return  (input_1/input_2);     //It displays quotient as a result
	}
	
	static int div (int input_1, int input_2,int input_3)
	{
		return  (input_1/input_3);
	}
}
