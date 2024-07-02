package CentricToAll4;

public class Lab121 {
	
	public static void main(String[] args)
	{
		
		//Strings are immutable in nature
		
	String name="Vemula Abhilash"; 
	//Since it is a initially created string it will be stored permanently in SCP
	System.out.println(name);	
	String name2= new String("Abhilash"); //It creates a new string in heap area
    name="Vikcy";
    System.out.println(name);  //It replaced
    System.out.println(name2);
		
		
    
    //Concatenation : Merging/Joining
    
    String str1="Vemula";
    String str2=str1.concat("Abhilash");
    String str3="Sharma";
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    
    
    //For IPV
    
    String str4="Hello";
    str4=str4.concat("Vicky"); //It is a combination of two strings
    System.out.println(str4);
    String str5="Hello"; //string 5  and string 6 are referring to the string 4 in scp
    String str6="Hello";  //Since they are similar in value
    System.out.println(str5);
    System.out.println(str6);
    
    
		
    String str7="Hi";
    str7.concat("Vicky");  //It is not assigned with any string 
    System.out.println(str7); //Output is independent string
    
		
	}

}
