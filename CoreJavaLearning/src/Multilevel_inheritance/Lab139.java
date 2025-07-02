package Multilevel_inheritance;

public class Lab139 {
	
	public static void main(String[] args)
	{
		
		Father f= new Father();
		f.legalheir();
		
		Son s= new Son();
		f.legalheir();
		s.legalheir();
		
		Grandson gs= new Grandson();
		f.legalheir();
		s.legalheir();
		gs.legalheir();
		
	     
	}

}
