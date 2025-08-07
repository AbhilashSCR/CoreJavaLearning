package Map;

import java.util.Hashtable;
import java.util.Map;

public class MapExample5 {

	
	public static void main(String[] args)
	{
		
		Map<Integer,String> Zohoproducts5= new Hashtable<>();  // descending order
		Zohoproducts5.put(25, "Zoho writer");
		Zohoproducts5.put(26, "Zoho sheet");
		Zohoproducts5.put(27, "Zoho show");
		Zohoproducts5.put(28, "Zoho workdrive");
		Zohoproducts5.put(29, "Zoho notepad");
		System.out.println(Zohoproducts5);
		
		for(Map.Entry<Integer, String> display5 : Zohoproducts5.entrySet())
		{
			System.out.println(display5.getKey() +"-->"+ display5.getValue());
		}
		
	}
}
