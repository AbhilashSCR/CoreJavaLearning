package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
	
	public static void main(String[] args)
	{
		
		Map<Integer,String> Zohoproducts= new HashMap<>();  //Random order
		Zohoproducts.put(1, "Zoho crm");
		Zohoproducts.put(2,"Zoho mail");
		Zohoproducts.put(3, "Zoho books");
		Zohoproducts.put(4, "Zoho invoice");
		Zohoproducts.put(5, "Zoho inventory");
		Zohoproducts.put(6, "Zoho projects");
		Zohoproducts.put(7, "Zoho people");
		Zohoproducts.put(8, "Zoho recruit");
		Zohoproducts.put(9, "Zoho creator");
		Zohoproducts.put(10, "Zoho cliq");
		Zohoproducts.put(11, "Zoho meeting");
		Zohoproducts.put(12, "Zoho desk");
		System.out.println(Zohoproducts);
		System.out.println(Zohoproducts.isEmpty());
		System.out.println(Zohoproducts.size());
		System.out.println(Zohoproducts.containsKey(13));
		System.out.println(Zohoproducts.containsValue("Zoho meeting"));
		System.out.println(Zohoproducts.get(6));
		System.out.println(Zohoproducts.get("Zoho invoice"));//Returns as null
		System.out.println(Zohoproducts.values());  
		System.out.println(Zohoproducts.keySet());
		
		
		
		
		for (Map.Entry<Integer, String> display :Zohoproducts.entrySet())
		{
			System.out.println(display.getKey() + " --> " + display.getValue());
		}
	}

}
