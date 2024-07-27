package IVPOV;

public class IV6 {
	
	public static void main(String[] args)
	{
		System.out.println(Abhi.a);
		//Vemula v = new Vemula();
		//v.m1();
		//v.m2();
		
		Abhi v= new Vemula();  
		v.m1();
		
		//Dynamic dispatch 
		vicky v1= new Vemula();
		v1.m1();
		v1.m2();
		
		Vemula v2= new Vemula();
		v2.m1();
		v2.m2();
		
		
		//Abhi a= new Abhi();
		//a.m1();
		
	//Not possible to create a object reference of interface class	
		
	}

}


interface Abhi
{
	int a=10;  //Static variable
	
	void m1();
}

abstract class vicky implements Abhi
{
	 abstract void m2();
}

class Vemula extends vicky
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("It is a static function");
		
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("It is a concrete class");
		
	}
	
}