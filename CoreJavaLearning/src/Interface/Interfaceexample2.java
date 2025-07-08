package Interface;

public class Interfaceexample2 {
	
	public static void main(String[] args)
	{
		System.out.println(A1.a);
		System.out.println(B1.b);
		//System.out.println(A1.b);
		//System.out.println(B1.a);
	}

}

interface A1
{
	int a =10;
	
}

interface B1
{
	int b=20;
}