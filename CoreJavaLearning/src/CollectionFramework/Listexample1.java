package CollectionFramework;

import java.util.List;

public class Listexample1 {

	
	public static void main(String [] args)
	{

	List G_Vegetables= List.of("Potato","Carot","Beetroot","Radish","Onion");
	List P_Vegetables= List.of("Tomato","Lady'sfinger","bittergourd","Cabbage");
	
	System.out.println(G_Vegetables.get(2));
	System.out.println(G_Vegetables.indexOf("Radish"));
	System.out.println(G_Vegetables.size());
	System.out.println(P_Vegetables.isEmpty());
	
		
	}
}
