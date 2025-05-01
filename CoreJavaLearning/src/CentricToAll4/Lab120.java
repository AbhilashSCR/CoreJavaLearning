package CentricToAll4;

public class Lab120 {

	public static void main(String[] example)  //Replacing the argument with the name example
	
	{
		int i=main(141);
		System.out.println(i);
		byte b=(byte) main((byte)(0));
		System.out.println(b);
		String s=main("Jonty");
		System.out.println(s);
		String s1=main1("Jacques");
		System.out.println(s1);
		
		
	}
	
	//Defining the functions with PDT and NON-PDT
	static int main (int a)
	{
		return a+59;
	}
	static byte main(byte b)
	{
		return (byte) (b+66);
	}
	
	static String main(String c)
	{
		return c+"rhodes";
	}
	
	static String main1(String d)
{
	return d +"kallis";
}

}
