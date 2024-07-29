package Innerclass;

public class Innerclass {
	
	public static void main(String[] args)
	{
		outerclass oc= new outerclass();
		outerclass.innerclass ic= oc.new innerclass();
		oc.oc();
		ic.ic();
		
				
	}

}

class outerclass
{
	int a =10;
	void oc()
	{
		System.out.println(a);
		//System.out.println(b);
	}
	

class innerclass
{
	int b=20;
	void ic()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
}