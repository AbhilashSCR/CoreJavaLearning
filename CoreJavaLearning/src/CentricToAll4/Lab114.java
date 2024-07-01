package CentricToAll4;

public class Lab114 {

	public static void main(String[] args)
	{
		short s=mul((short) (12*12));
		System.out.println(s);
		short s1=mul((short) 17);
		System.out.println(s1);
		short s2=mul();
		System.out.println(s2);
	}
	
	
	static short mul(short input_1, short input_2)
	{
		return (short) ((input_1*input_2));
	}
    static short mul(short input2)
    {
    	return input2;
    }
	static short mul()
	{
		return 23;
	}
}
