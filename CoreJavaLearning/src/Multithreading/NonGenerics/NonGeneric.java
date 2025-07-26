package Multithreading.NonGenerics;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {
	
	public static void main (String[] args)	{
		
		
		
		 //Non-Generic allows only the specific datatype, which is defined with in the diamond operator
		
		
		List<Double> singledatatype= new ArrayList<Double>();
		
		singledatatype.add(14.3);
		singledatatype.add(76.7);
		System.out.println(singledatatype);
	}
}
