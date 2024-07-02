package CentricToAll4;

public class Lab126 {
	
	public static void main(String[] args)
	{
		String s1="Abhilash";
		s1=s1.concat("Sharma");
		s1=s1.concat("Vemula");
		System.out.println(s1);
		//String get concatenated , but the initial/old string will be remained in SCP
		
		String s2="VemulaAbhilashSharma";
		System.out.println(s2);
		
		
		//Understand the difference between strings , Stringbuilder and Stringbuffer
		
		//Stringbuilder and Stringbuffer are mutable in natur(Changeable)
		
		
		StringBuilder sb=new StringBuilder("Abhilash");
		sb.append("Sharma");//When we append the value, it deletes the old string from SCP
		System.out.println(sb); //Appended value is seen
		
		
		StringBuffer sbf=new StringBuffer("Vemula");
		sbf.append("Vicky");
		System.out.println(sbf);
		
	}

	
	
}
