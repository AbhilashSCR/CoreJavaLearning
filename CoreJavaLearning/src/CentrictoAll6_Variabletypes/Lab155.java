package CentrictoAll6_Variabletypes;

public class Lab155 {

	public static void main(String[] args)
	{
		
		
		A a= new A();
		A a1= new A();
		
		a.m1();
		a.m2();
		
		A a2= null;
		//a2.m1();  //When we invoking the null object reference with non-static function. It will throw an "nullpointerexception"
		a2.m2();    //When we are invoking the null object reference with static function. It will return variables declared the static function

		
	}
	
	
}

class A{
	
	static {
		System.out.println("SIB");    //It works on no. of classes
	
	}
	
	{
		System.out.println("IIB");  //It works on no. of objects
	}
	
	
	
	int a =10;
	static int  b=20;
	
	void m1()
	{
		System.out.println("Printing the static and non-static variables");
		System.out.println(a);
		System.out.println(b);
			
	}
	
	static void m2()
	{
		//System.out.println(a);
		System.out.println(b);
	}
}
