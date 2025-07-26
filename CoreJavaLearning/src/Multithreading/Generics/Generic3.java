package Multithreading.Generics;

public class Generic3 {

	
	
	//Using  comparable interface which can even compare strings and characters
	public static <maximumnumber extends Comparable<maximumnumber>> maximumnumber maximumof(maximumnumber a, maximumnumber b, maximumnumber c)
	{
		
		maximumnumber max =a;
		
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
		
		System.out.println(maximumof("Abhilash","Sharma","Vemula"));
		System.out.println(maximumof('A','S','V'));
		System.out.println(maximumof(12,24,36));
		System.out.println(maximumof(7.5,15.75,32.15));
		
	}
}
