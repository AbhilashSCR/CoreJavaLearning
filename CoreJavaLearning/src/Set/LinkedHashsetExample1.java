package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample1 {
	
	public static void main(String[] args)
	{
		//Gets printed in the defined order and no duplicates allowed
		Set Tier3cities= new LinkedHashSet();
		Tier3cities.add("Guntur");
		Tier3cities.add("Hubli");
		Tier3cities.add("Belgaum");
		Tier3cities.add("Gwalior");
	    Tier3cities.add("Jabalpur");
	    Tier3cities.add("Udaipur");
	    Tier3cities.add("Meerut");
	    Tier3cities.add("jalandar");
	    Tier3cities.add("Trichy");
	    Tier3cities.add("Asansol");
	    Tier3cities.add("Bagalpur");
	    Tier3cities.add("Siliguri");
	    Tier3cities.add("Warangal");
	    Tier3cities.add("Aligarh");
	    Tier3cities.add("Kolhapur");
	    Tier3cities.add("Trichy");
	    
	    System.out.println("Tier3cities are known for -->Smaller cities and towns, less urbanized, with growing infrastructure and potential for growth");
	    
	    Iterator it= Tier3cities.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	}
}
