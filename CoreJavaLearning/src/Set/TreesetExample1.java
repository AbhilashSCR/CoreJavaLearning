package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample1 {
	
	public static void main(String[] args)
	{
		//They gets printed in the alphabetical order and no duplicates allowed
		Set Tier1cities= new TreeSet();
		Tier1cities.add("Delhi");
		Tier1cities.add("Mumbai");
		Tier1cities.add("Chennai");
		Tier1cities.add("Kolkata");
		Tier1cities.add("Bengaluru");
		Tier1cities.add("Hyderabad");
		Tier1cities.add("Pune");
		Tier1cities.add("Ahmedabad");
		Tier1cities.add("Bengaluru");
		
		System.out.println("Tier1 cities are known for --> Highly developed, urbanized, with strong infrastructure and high cost of living");
		
		Iterator it= Tier1cities.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
