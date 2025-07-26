package Multithreading.NonGenerics;

public class NonGeneric2 {
	
	
public static void main(String[] args)
{
	
	int maximumnumber=maxnum(25,75,150);
	System.out.println(maximumnumber);
	
}


//Non-Generic, here we are specifying the specific datatype

public static int maxnum (int a, int b, int c)
{
	int max=a;
	
	if(b>max)
	{
		max=b;
	}
	if(c>max)
	{
		max=c;
	}
	return max;
}
}
