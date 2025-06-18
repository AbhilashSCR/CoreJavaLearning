package CentricToAll5_Constructors;

public class Lab135 {
	
	public static void main(String[] args)
	{
		person p= new person();
		p.printdetails();
		
		
		person p1= new person("Abhilash");
		System.out.println(p1.name);
		person p2= new person("vemulaabhilash8433@gmail.com");
		System.out.println(p2.emailaddress);
		
	}

}
