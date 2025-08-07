package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample2 {

	public static void main(String[] args)
	{
		//It does not follow any order , but the smallest number will be printed as first element
		Queue <Integer> accountid= new PriorityQueue<Integer>();;
		accountid.offer(632);
		accountid.offer(896);
		accountid.offer(125);
		accountid.offer(727);
		//accountid.offer("Serious"); Since it is a string it restricts
		System.out.println(accountid);
		
		
		Iterator it= accountid.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
}
