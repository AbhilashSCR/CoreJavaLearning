package Polymorphism_Methodoverriding;

public class Lab149 {
	
	public static void main(String[] args)
	{
		
		Languages lg=new Languages();
		lg.languages();
		
		Languages lg1= new Hindi();
		lg1.languages();
		
		Languages lg2= new Bengali();
		lg2.languages();
		
		Languages lg3= new Marathi();
		lg3.languages();
		
		Languages lg4= new Telugu();
		lg4.languages();
		
		Languages lg5=new Tamil();
		lg5.languages();
		
		
		Languages lg6=new English();
		lg6.languages();
	}

}
