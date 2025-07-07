package IVPOV;

public class IV4 {

	public static void main(String[] args)
	{
		
		
		disciple d= new disciple();
		System.out.println(d.a); 
		//Cannot print the instance variable without creating an objects
		
		
		disciple d1= new disciple();
		d1.follower();
		
		//Cannot print the functions  without creating an objects
		
		System.out.println(disciple.b);
		//Static instance variable can be invoked without creating an objects
		
		
		disciple.followers();
		//Static function can be invoked without creating an objects
	}
	
	
}



class disciple{
	
	int a;   //IV
	
	static int b;  //SV
	
	
	void follower()
	{
		System.out.println("Disciple=Discipline");
	}
	
	static void followers()
	{
		System.out.println("Disciple=Discipline");
	}
}
