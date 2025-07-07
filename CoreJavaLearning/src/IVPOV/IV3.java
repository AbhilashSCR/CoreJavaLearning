package IVPOV;

public class IV3 {
	
	public static void main(String[] args)
	{
		
		mentor m= new mentor();
		mentor m1=new mentor();
		
	    m.withoutmentor();
	    System.out.println("Which is equal to:"+m.a);
	    m1.withmentor();
	    System.out.println("Which is equal to:"+m1.b);
	}
	

}


class mentor{
	
	int a ;
	int b=10;
	
	void withoutmentor()
	{
		System.out.println("Resource without a mentor is clueless");
	}
	
	void withmentor()
	{
		System.out.println("Resource with a mentor is aware");
	}
	
}

