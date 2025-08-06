package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample2 {
	
	public static void main(String[] args)
	{
		
		//They gets printed in the nutural order
		
		Set<Integer> Tier1cities= new TreeSet<Integer>();
		Tier1cities.add(5);
		
		Tier1cities.add(2);
		
		Tier1cities.add(3);
		
		Tier1cities.add(7);
		
		Tier1cities.add(1);
		
		Tier1cities.add(6);
		
		Tier1cities.add(4);
		
		Tier1cities.add(8);
		
		
		
		for (Integer i:Tier1cities)
		{
			System.out.println(i);
		}
	}

}
