package CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorexample {
	
	public static void main(String[] args)
	{
		
		Vector vector=new Vector();
		vector.add('J');
		vector.add("Pratibha");
		vector.add(1);
		vector.add(true);
		
		
		Enumeration e= vector.elements();
		while(e.hasMoreElements())
        {
	       System.out.println(e.nextElement());
        }
	}

}
