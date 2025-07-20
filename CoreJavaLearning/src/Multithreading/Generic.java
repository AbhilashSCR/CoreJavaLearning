package Multithreading;

public class Generic {
	
	
	public static <Abhilash extends Comparable<Abhilash>> Abhilash Maxout(Abhilash a, Abhilash b, Abhilash c)
	{
		
		Abhilash max =a;
		if(b.compareTo(max)>0)
		{
			max=b;
		}
		if(c.compareTo(max)>0)
       {
	       max=c;

	   
       }
       return max;
}
	

	public static void main(String[] args)
	{
		System.out.println(Maxout("Vimal","Vishal","Venkatesh"));
		System.out.println(Maxout('S','P','R'));
		System.out.println(Maxout(145,236,123));
		System.out.println(Maxout(23.6,37.5,44.3));
		
	}
}
