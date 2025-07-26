package Multithreading.Generics;

public class Generic4 {
	
	//Using comparable interface which can even compare strings and characters
	public static <minimumnumber extends Comparable<minimumnumber>> minimumnumber minimumof(minimumnumber a, minimumnumber b, minimumnumber c)

	{
		minimumnumber min =a;
		
		if(b.compareTo(min) <0)
		{
			min=b;
		}
		
		if(c.compareTo(min)<0)
		{
			min=c;
				}
		
		return min;
	}
	
	public static void main(String[] args)
	{
		System.out.println(minimumof("Abhilash","Sharma","Vemula"));
		System.out.println(minimumof('A','S','V'));
		System.out.println(minimumof(12,24,36));
		System.out.println(minimumof(7.5,15.75,32.15));
	}
}
