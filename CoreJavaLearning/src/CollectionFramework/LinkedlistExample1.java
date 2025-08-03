package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample1 {

	public static void main(String[] args)
	{
		
		
		List<String> L1= new LinkedList<String>();
		L1.add("Dharma");
		L1.add("artha");
		L1.add("Kama");
		L1.add("Moksha");
		System.out.println(L1);
		
		List<Integer> L2= new LinkedList<Integer>();
		L2.add(4);
		L2.add(1);
		L2.add(11);
		L2.add(12);
		System.out.println(L2);
		
		
		Iterator iterator= L1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		Iterator iterator2=L2.iterator();
        while(iterator2.hasNext())
        {
        	System.out.println(iterator2.next());
			
		}
		
		
		
		
	
	}
}
