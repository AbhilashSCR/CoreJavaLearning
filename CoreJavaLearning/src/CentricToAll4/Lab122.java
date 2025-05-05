package CentricToAll4;

public class Lab122 {

	public static void main(String[] args)
	{
		
      String str1="Abhilash ";
      System.out.println(str1.concat("Vemula"));
      String str2="Sharma";
      System.out.println(str1.concat(str2));
      System.out.println(str1.contains("H"));  //Since java is case sensitive , it is particular
      
		//Alternate for concatenation
      System.out.println("Abhilash" +str2);
      System.out.println(str1+"Vemula");
		
		
		
	//Using contains method to check the sequence of characters in string
		//Which return boolean result
      
      String password="Vemula@369";
      String confirmpassword="Vemula#369";
      
      if(password.equals(confirmpassword))
      {
    	  System.out.println("True");
      }
      else
      {
    	  System.out.println("False");
      }
		
		
		
		
		
	}
}
