package CentricToAll4;

public class Lab112 {
	
	public static void main(String[] args)
	{
		
		float f=sum();
		System.out.println(f);
		float f1=sum(14.2f,17.3f);
		System.out.println(f1);
		float f2=sum(14.3f,45.3f,67.3f);
		System.out.println(f2);
		
		
			
	}
	
	
	static float sum(float input1, float input2)
	{
		return input1+input2;
	}
    
	static float sum(float input1, float input2, float input3)
	{
		return input1+input2+input3;
	}
	static float sum()
	{
		return 123;
	}
	
}
