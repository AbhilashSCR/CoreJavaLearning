package Map;

import java.util.Map;
import java.util.WeakHashMap;

public class MapExample4 {

	public static void main(String[] args)
			{
		
		Map<Integer,String> Zohoproducts4= new WeakHashMap<>();  //Random order
		Zohoproducts4.put(21, "Zoho assist"); 
		Zohoproducts4.put(22, "Zoho lens");
		Zohoproducts4.put(23, "Zoho vault");
		Zohoproducts4.put(24, "Zoho sign");
		System.out.println(Zohoproducts4);
		
		
		for(Map.Entry<Integer,String> display4 : Zohoproducts4.entrySet())
		{
			System.out.println(display4.getKey() + "-->"+ display4.getValue());
		}
		
			}
}
