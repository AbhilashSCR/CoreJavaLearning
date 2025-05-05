package CentricToAll4;

public class Lab126 {
	
	public static void main(String[] args)
	{
		
		//String get concatenated , but the initial/old string will be remained in SCP
		   
        String str1="Pratiba ";
        str1=str1.concat("Intelligent ");
        str1=str1.concat("Higly matured ");
        System.out.println(str1);
        
         
		String str2=new String("My kind of girl");   //A new string will be created in the scp
		System.out.println(str2);
		
		//Understand the difference between strings , Stringbuilder and Stringbuffer
		
		
		//Stringbuilder and Stringbuffer are mutable in nature(Changeable)
		
		StringBuilder sb= new StringBuilder("May god bless you");
		sb.append(" With all you deserve for this life");
		System.out.println(sb);
		
		//When we append the value, it deletes the old string from SCP
		//Appended value is seen
		
		
		StringBuffer sbf= new StringBuffer("Keep smiling");
		sbf.append(" Be happy");
		System.out.println(sbf);
		

	}
	
}
