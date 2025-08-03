package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ALlistExample1 {
	
	public static void main(String[] args)
	{
		
		List studentlist= new ArrayList();
		studentlist.add("Prerana");
		studentlist.add("Sakshi");
		studentlist.add("Shravan");
		studentlist.add("Vijay");
		
		
		List rollnolist=new LinkedList();
		rollnolist.add(14);
		rollnolist.add(23);
		rollnolist.add(31);
		rollnolist.add(47);
		
		
		studentlist.addAll(rollnolist);
		System.out.println(studentlist);
		
		//Note: addAll() method is used to add all the specified elements to the collection
		
		
		Iterator iterator=studentlist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}



