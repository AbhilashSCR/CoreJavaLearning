package Multithreading.NonGenerics;

public class NonGeneric3 {

	public static void main(String[] args)
	{
		
		double minimumnumber=mininum(78.9,83.6,97.5,99.6);
		System.out.println(minimumnumber);
		
	}


public static double mininum(double a, double b, double c,double d)
{
	double minimum=a;
	
	if(b<minimum)
	{
		minimum=b;
	}
	if(c<minimum)
	{
		minimum=c;
	}
	if(d<minimum)
	{
		minimum=d;
	}
	return minimum;
}
}