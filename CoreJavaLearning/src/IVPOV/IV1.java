package IVPOV;

public class IV1 {

	public static void main(String[] args)
	{
		
		person p=new person();
		person p1=new person(12,false);
		person p2=new person(112);
		
		System.out.println(p.a);   //Default value of integer is 0
		System.out.println(p.b);  //Default value of boolean is false
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		System.out.println(p2.b);  
		System.out.println(p2.a);
		
	
}
}

class person
{
	int a;
	
	boolean b;
	
	//Default constructor
	
	person()
	{
		
	    this.a=a;
	    }
	
	//Parameterized constructor
	
	person(int b)
	{
		this.a=b;
	}

	//Parameterized constructor
	
	person(int b, boolean a)
	{
		this.a=b;
		this.b=a;
		
	}

	
		
	}
	
	

