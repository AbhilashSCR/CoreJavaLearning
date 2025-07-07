package IVPOV;

public class IV1 {

	public static void main(String[] args)
	{
		
		
		person p=  new person();
		person p1= new person();
		person p2= new person();
		System.out.println(p.a);
		System.out.println(p1.a);
		System.out.println(p2.a);
		System.out.println(p2.b);
		
	}
}

class person
{
	int a;
	boolean b;

//Default con.

person()
{
	this.a=10;
}

//Parameter.
person(int b)
{
	this.a=b;
}

//paramete.r
person(int b, boolean a)
{
	this.b=a;
	this.a=b;
}
}