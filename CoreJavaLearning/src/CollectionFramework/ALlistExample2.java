package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ALlistExample2 {
	
	public static void main(String[] args)
	{
		
		List emp= new ArrayList();
		emp.add("Abhilash");
		emp.add("Kamlesh");
		emp.add("Adanan");
		emp.add("Mirza");
		
		List empid= new LinkedList();
		empid.add(61);
		empid.add(72);
		empid.add(124);
		empid.add(141);
	
		
		ListIterator listiterator= emp.listIterator(emp.size());
		while(listiterator.hasPrevious())
		{
			System.out.println(listiterator.previous());
		}
		
		
		
		ListIterator listiterator2=empid.listIterator(empid.size());
		while(listiterator2.hasPrevious())
		{
			System.out.println(listiterator2.previous());
 		}
	   
		
	}

}


