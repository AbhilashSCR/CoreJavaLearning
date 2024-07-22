package IVPOV;

public class IV3 {
	
	public static void main(String[] args)
	{
		
		mentor m= new mentor();
		mentor m1=new mentor();
		
	    m.mentor();
	    System.out.println("With is equal to:"+m.a);
	    m1.mentor();
	    System.out.println("With is equal to:"+m1.a);
	}
	

}


class mentor{
	
	int a ;
	
	mentor()
	{
		this.a =a;
	}
	
	void mentor()
	{
		System.out.println("Resource without a mentor is clueless");
	}
}
