package CentrictoAll6_Variabletypes;

public class Lab153 {
	
	public static void main(String[] args)
	{
		
		System.out.println(StaticDemo2.Type_Of_graduation); 
		System.out.println(StaticDemo2.consolidatedmarksmemorandam);
		StaticDemo2.printname();
		StaticDemo2.printmarks();
		
		
		StaticDemo2 s2= new StaticDemo2();
		//s2.printname="MBA";  //Since we declared as static we cannot manipulate string
		//s2.printmarks=70; //Since we declared as static we cannot manipulate int
		s2.printname();
		s2.printmarks();
		
		
	}

}
