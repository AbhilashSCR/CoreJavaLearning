package Multithreading;

public class NonGeneric {
	
	public static void main (String[] args)	{
		
		
		int maxnumber=maxnumber(14,25,74);
		System.out.println(maxnumber);
	}
	
	
	public static int maxnumber(int a, int b, int c)
	{
		int max= a;
		{
			if (b>max)
			{
				max=b;
			}
			if (c>max)
			{
				max=c;
			}
			return max;
		}
	}

}
