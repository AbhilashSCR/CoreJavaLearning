package IVPOV;

public class IV5 
{
  public static void main(String[] args)
  {
	  
	  //Without creating an objects we can invoke static variable in interface
	  
	  System.out.println(I.a);
	  System.out.println(I.b);
	  System.out.println(I.c);
  }
	
	
}


interface I
{
	int a=10;  // by-default they are public static final
	int b=20;
	public static final int c=20;
	
	void m1();
}
