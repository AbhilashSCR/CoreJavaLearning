package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayExample2 {
	
	public static void main(String[] args)
	{
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(434);
		list.add(212);
		//list.add("36");
		list.addFirst(126);
		list.addLast(537);
		//list.add("Abhilash");
		//list.add(true);
		
		//Restricting the other datatypes
		
		System.out.println(list);
		list.set(1, 636);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("_____________");
		
		for(Integer i :list)
		{
			System.out.println(i);
		}
		
		System.out.println("____________");
		
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
			
		}
	}

}
