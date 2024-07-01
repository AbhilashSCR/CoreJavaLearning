package CentricToAll4;

public class Lab113 {

	public static void main(String[] args)
	{
		double d= sub(1654132,4865312,8645312);
		System.out.println(d);
		double d1= sub(45987,6358);
        System.out.println(d1);
        double d2= sub(645654);
        System.out.println(d2);
		
		
		
	}
	
	static double sub(double input1, double input2)
	{
		return input1-input2;
	}
	static double sub(double input1)
	{
		return input1;
	}
	static double sub(double input1,double input2, double input3)
	{
		return input3-input1;
	}
	
}


