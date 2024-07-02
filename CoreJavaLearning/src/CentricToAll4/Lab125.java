package CentricToAll4;

public class Lab125 {

  public static void main(String[] args)
  {
	  
	  String s1="Abhilash";
	  String s2= new String("abhilash");
	  String s3= new String("Abhilash");
	  
	  
	  //Compare the strings with == operator and equals methods
	  
	  
	  System.out.println(s1==s3);  //checks the reference/location
	  System.out.println(s1.equals(s3)); //checks the values
	  System.out.println(s2==s3);
	  System.out.println(s2.equalsIgnoreCase(s3));
	  
	  
  }
}
