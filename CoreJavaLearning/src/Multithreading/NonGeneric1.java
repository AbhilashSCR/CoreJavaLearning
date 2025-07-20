package Multithreading;

public class NonGeneric1 {

	public static void main(String[] args)
	{
		 int minnumber=minnumber(14,15,18);
		 System.out.println(minnumber);
		
	}


public static int minnumber(int a, int b, int c)
{
	int min=a;
	
	{
		if (b>min)
		{
			b=min;
		}
		if (c>min)
		{
			c=min;
		}
		return c;
	}
}
}
