package Interface;

public class Interfaceexample {
	
	public static void main(String[] args)
	{
		
		//A a= new A();  //Cannot create the objects for interface class
		B b= new B();
		b.print();
		//C c= new C();  //Cannot create the objects for abstract class
		
	}

}

interface A
{
	
}
class B
{
	void print()
	{
		System.out.print("We can create object for normal class");
	}
}
abstract class C
{
	
}