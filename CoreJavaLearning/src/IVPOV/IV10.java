package IVPOV;

public class IV10 {

	public static void main(String[] args)
	{
	  Hello h= new Hello();
	  h.bro();
		
	}
}

class Hello {
	public int bro()
	{
		int a=0;
		a=10/a;          //This throws AE
		
		throw new NullPointerException();  //It throws NPE
	}
}
