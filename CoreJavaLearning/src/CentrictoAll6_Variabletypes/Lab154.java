package CentrictoAll6_Variabletypes;

public class Lab154 {

	public static void main(String[] args)
	{
		
	NONStaticDemo nsd= new NONStaticDemo();
	nsd.printname();
	nsd.printmarks();
	
	nsd.Type_Of_graduation="MBA";
	nsd.consolidatedmarksmemorandam=70;
	
	System.out.println(nsd.Type_Of_graduation);
	System.out.println(nsd.consolidatedmarksmemorandam);
	
	nsd.printname();
	nsd.printmarks();
		
	}
}
