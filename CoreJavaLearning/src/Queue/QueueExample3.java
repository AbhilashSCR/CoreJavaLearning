package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample3 {
	
	public static void main(String[] args)
	{
		
		//For String defined in alphabetical order follows FIFO approach
		
		Queue <String> accountholder= new PriorityQueue<String>();
		accountholder.offer("Abhilash");
		accountholder.offer("Amith");
		accountholder.offer("Amrith");
		accountholder.offer("Anuradha");
		//accountholder.offer(12);
		System.out.println(accountholder);
		
		Iterator it= accountholder.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
