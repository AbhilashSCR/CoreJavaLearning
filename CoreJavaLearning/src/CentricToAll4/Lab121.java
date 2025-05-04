package CentricToAll4;

public class Lab121 {
	
	public static void main(String[] args)
	{
		
		//Strings are immutable in nature
		
		
		String name="Abhilash";
		String name2="Vemula";
		
		name="AbhilashVemula";
		System.out.println(name);
		System.out.println(name2);
		
		//Concatenating
		String str1="Vemula ";
		String str2=str1.concat("Abhilash ");
		String str3=str2.concat("Sharma ");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		//IPV
		
        String str4="Hello";
        String str5="Java";
        String str6="World";
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        String str7="Hi";
        str7.concat("Vicky");  //It is not assigned with any string 
        System.out.println(str7); //Output is independent string

	}
}
