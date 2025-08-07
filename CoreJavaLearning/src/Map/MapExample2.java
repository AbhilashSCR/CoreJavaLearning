package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample2 {
	
	public static void main(String[] args)
	{
		
		Map<Integer,String> Zohoproducts2= new LinkedHashMap<>();  //In defined order
		Zohoproducts2.put(13, "Zoho campaigns");
		Zohoproducts2.put(14, "Zoho social");
		Zohoproducts2.put(15, "Zoho pagesense");
		Zohoproducts2.put(16, "Zoho survey");
		Zohoproducts2.put(17, "Zoho forms");
		Zohoproducts2.put(18, "Zoho marketing automation");
		System.out.println(Zohoproducts2);
		
		for(Map.Entry<Integer, String> display2: Zohoproducts2.entrySet())
		{
			System.out.println(display2.getKey() + "-->"+ display2.getValue());
		}
		
		
	}

}
