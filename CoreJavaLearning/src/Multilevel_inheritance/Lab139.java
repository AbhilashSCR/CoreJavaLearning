package Multilevel_inheritance;

public class Lab139 {
	
	public static void main(String[] args)
	{
		
		Father F=new Father();
		F.position();
		
		Son S= new Son();
		S.position();
		
		Grandson Gs=new Grandson();
		Gs.position();
		

        //Multi-level inheritance concept like 1st gen,2nd gen, 3rd gen
		
		
	     Father f=new Son();
	     f.position();
	     
	     Father f1=new Grandson();
	     f1.position();
	     
	    
	     Son s1= new Grandson();
	     s1.position();
	     
	     
	}

}
