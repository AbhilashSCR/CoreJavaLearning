package IVPOV;

public class IV7 {

	
	public static void main(String[] args)
	{
		
		enduser eur= new enduser();
		eur.m1();
	}
}



abstract class client{
	
	abstract void m1();
	
}

abstract class vendor extends client{
	abstract void m2();
}

class enduser extends client
{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("Client is responsible for enduser satisfaction");
	}
	
}