package Multithreading;

public class Generic1 {

	
	public static <Abhi extends Comparable<Abhi>> Abhi Minout(Abhi a, Abhi b, Abhi c)
	{
		
		Abhi min=a;
		{
			if (b.compareTo(min) <0)
			{
				b=min;
			}
			if(c.compareTo(min)<0)
			{
				c=min;
			}
			return c;
		}
		}
		
		public static void main(String[] args)
		{
			System.out.println(Minout("Krishna","Kumar","Kiran"));
			System.out.println(Minout('A','C','D'));
			System.out.println(Minout(44,66,79));
			System.out.println(Minout(32.4,44.7,66.5));
			
		
	}
}
