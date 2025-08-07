package Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class MapExample6 {

	
	public static void main(String[] args)
	{
		
		Map<Integer, String> zohoproducts6= new Hashtable<>();
		zohoproducts6.put(30, "Zoho one");
		zohoproducts6.put(31,"Zoho workplace");
		
		

Enumeration<Integer> e = ((Hashtable<Integer, String>) zohoproducts6).keys();

// Iterating through the Hashtable object

// Checking for next element in Hashtable object with the help of hasMoreElements() method
while (e.hasMoreElements()) {

    // Getting the key of a particular entry
    int key = e.nextElement();

  
    System.out.println("Key : " + key
            + "\t product : "
            + zohoproducts6.get(key));
}
}
}