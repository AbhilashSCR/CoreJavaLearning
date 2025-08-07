package Map;

import java.util.Map;
import java.util.TreeMap;

public class MapExample3 {
	
	public static void main(String[] args)
	{
		
		
		Map<Integer,String> Zohoproducts3= new TreeMap<>();  //In natural order
		Zohoproducts3.put(20, "Zoho expense");
		Zohoproducts3.put(19, "subscriptions");
		System.out.println(Zohoproducts3);
		
		
		for(Map.Entry<Integer, String> display3 : Zohoproducts3.entrySet())
		{
			System.out.println(display3.getKey() + "--> "+ display3.getValue());
		}
		
	}

}
