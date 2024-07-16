package Multilevel_inheritance;

public class Lab140 {

	public static void main(String[] args)
	{
		Highlevelprogramminglanguages pl=new Highlevelprogramminglanguages();
		pl.language();
		
		Highlevelprogramminglanguages P= new Python();
	    P.language();
	    
	    Highlevelprogramminglanguages J= new Java();
	    J.language();
	    
	    Highlevelprogramminglanguages Js=new Javascript();
	    Js.language();
	    
	    Highlevelprogramminglanguages cpp=new Cplusplus();
	    cpp.language();
	    
	    Highlevelprogramminglanguages Cs= new Csharp();
	    Cs.language();
		
		
		
	}
}
