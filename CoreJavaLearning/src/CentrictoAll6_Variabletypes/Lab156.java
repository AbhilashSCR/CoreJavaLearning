package CentrictoAll6_Variabletypes;

public class Lab156 {
	
	public static void main(String[] args)
	{
		D d= new D();
		d.m1();
		d.m2();
		
	    D d1= null;
	    //d1.m1();  //When we invoking the null object reference with non-static function. It will throw an "nullpointerexception"
	    d1.m2();  //When we are invoking the null object reference with static function. It will return variables declared the static function
		
		
	}
	

}

class D
{
	int a =100;   //Instance or non-static
	static int b=200;  //Static


void m1()
{
	System.out.println("Able to print static and non-static variable for non static function");
	System.out.println(a);
	System.out.println(b);
}
static void m2()
{
	System.out.println("Only static variables be printed");
	//System.out.println(a);
	System.out.println(b);
}


}
