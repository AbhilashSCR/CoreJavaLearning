package Set;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample1 {

	public static void main(String[] args)
	{
		
		Set biscuits= new HashSet();
		biscuits.add("Britania");
		biscuits.add("Parle");
		biscuits.add("Sunfeast");
		biscuits.add("Patanjali");
		biscuits.add("Anmol");
		System.out.println(biscuits);
		
		System.out.println(biscuits.remove("Anmol"));
		System.out.println(biscuits.contains("Priyagold"));
		System.out.println(biscuits.add("Unibic"));
		System.out.println(biscuits.size());
		System.out.println(biscuits);
		
		
		
		
	}

}
