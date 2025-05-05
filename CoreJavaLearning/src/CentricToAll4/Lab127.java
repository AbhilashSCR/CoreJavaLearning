package CentricToAll4;

public class Lab127 {
	public static void main(String[] args)
	{
		
		//Real time example
		
		//Since string are immutable, passwords can't be changed,only be printed
		String password="Refine@123";
		System.out.println(password);
		
	
		
		
		//Since StringBuffer are mutable , passwords can be changed
		
		 StringBuffer sbf= new StringBuffer("Refine123"); 
		 sbf.append("4"); 
		 System.out.println(sbf);
		 
		//It's like able to update password multiple times
	
	}

}
