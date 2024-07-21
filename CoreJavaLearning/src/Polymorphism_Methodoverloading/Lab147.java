package Polymorphism_Methodoverloading;

public class Lab147 {
	
	public static void main(String[] args)
	{
		new Organization().employee("Vicky");
		new Organization().employee(2020);
		//new Organization().employee(1500);
		new Organization().employee(10000000l);
		new Organization().employee(11.34);
		
	}

}
