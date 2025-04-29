package CentricToAll4;

public class Lab112 {
	
	public static void main(String[] args)
	{
		float a=sum(12,14,16);
		System.out.println(a);
		float b=sub(84,96);
		System.out.println(b);
		float c=mul(74,26);
		System.out.println(c);
		float d=div(143,7);
		System.out.println(d);
		float e=mod(185,36);
		System.out.println(e);
		
	}
	
	
	static float sum(int input_1, int input_2,int input_3)
	{
		return input_1+input_2+input_3;
	}
	
	static float sub(int input_4, int input_5)
	{
		return input_5-input_4;
		
	}
	static float mul(int input_6, int input_7)
	{
		return input_6*input_7;
	}
	static float div(int input_8,int input_9)
	{
		return input_8/input_9;
		
	}
	static float mod(int input_10,int input_11)
	{
		return input_10%input_11;
	}
	
	
	
	
}
