package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample2 {

	
	public static void main(String[] args)
	{
		
		List list= new LinkedList();
		list.add("Abhilash");
		list.add('V');
		list.add("Varma");
		list.add(true);
		list.add(123);
		
		
		System.out.println(list);
		list.set(0, 'V');
		list.remove(2);
		list.set(1, "Abhilash");
		list.set(2, "Sharma");
		System.out.println(list);
		
		
		Iterator iterator= list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
}
}