package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample1 {
	
	public static void main(String[] args)
	{
		
		
		//It does not follow any order , but the smallest string will be printed as first element
		Queue dishes= new PriorityQueue(); 
		dishes.offer("Dosa");
		dishes.offer("Idly");
		dishes.offer("Puri");
		dishes.offer("Wada");
		System.out.println(dishes);
		 
		
		dishes.add("Samosa");
		dishes.add("Kachori");
		dishes.add("Jalebi");
		System.out.println(dishes);
		
	    System.out.println(dishes.peek());
	    System.out.println(dishes.poll());
	    System.out.println(dishes.element()); 
	    System.out.println(dishes);
	    
	}

}
