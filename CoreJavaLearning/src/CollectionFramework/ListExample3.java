package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample3 {
	
	public static void main(String[] args)
	{
		
		
		List<Integer> percentage= new ArrayList<Integer>();
		percentage.add(60);
		percentage.add(65);
		percentage.add(75);
		
		
		Collections.sort(percentage);
		System.out.println(percentage);
		Collections.shuffle(percentage);
		System.out.println(percentage);
		
		
	}

}
