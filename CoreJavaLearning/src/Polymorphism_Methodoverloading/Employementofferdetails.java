package Polymorphism_Methodoverloading;

public class Employementofferdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Employementofferdetails().employee('F');
		new Employementofferdetails().employee("Abhilash");
		new Employementofferdetails().employee(10000000l);
		new Employementofferdetails().employee(4.8);
		
		
	}

	
	
	void employee(char employmenttype)
	{
		System.out.println("Type of an employment:"+employmenttype);
	}
	
	void employee(String name)
	{
		System.out.println("Name of a employee :"+ name);
	}
	
	void employee(long salary)
	{
		System.out.println("Fixed salary:"+salary);
	}
	
	void employee(double variablepay)
	{
		System.out.println("Variable pay of :"+variablepay);
	}
}
