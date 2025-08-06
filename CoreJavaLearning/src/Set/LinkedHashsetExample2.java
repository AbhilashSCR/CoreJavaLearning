package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample2 {
	
	public static void main(String[] args)
	{
		
		Set<Integer> Tier3cities=new LinkedHashSet();
		Tier3cities.add(2);
		Tier3cities.add(4);
		//Tier3cities.add("5"); Restricts since it is a string
		Tier3cities.add(8);
		Tier3cities.add(12);
		
		//Using for each loop
		
		for(Integer i:Tier3cities)
		{
			System.out.println(i);
		}
		
		
		Set<String> Tier3cities1= new LinkedHashSet();
		Tier3cities1.add("Guntur");
		Tier3cities1.add("Udaipur");
		Tier3cities1.add("Meerut");
		Tier3cities.add(14);  //Not restricted because we are using the proper object reference
		Tier3cities1.add("Warangal");
		
		for(String s :Tier3cities1)
		{
			System.out.println(s);
		}
		
		
	}

}
