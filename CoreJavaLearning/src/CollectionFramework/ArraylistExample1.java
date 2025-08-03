package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample1 {
	
	public static void main(String[] args)
	{
		
		List l1 =new ArrayList();
		l1.add("Abhilash");
		l1.add("Varma");
		l1.add("Vemula");
		l1.add('V');
		l1.add(147);
		l1.add(true);
		
		//System.out.println(l1);
	     l1.set(1, "Sharma");
		//System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);;
		
		
		
		for(int i=0; i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		
		//Enhanced for loop
		for(Object O: l1) {
			System.out.println(O);
			
		}
			
			//Iterator approach
			Iterator iterator= l1.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			
		}
	}


