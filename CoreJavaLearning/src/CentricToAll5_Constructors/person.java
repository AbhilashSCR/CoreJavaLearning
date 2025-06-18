package CentricToAll5_Constructors;

public class person {
	
	
	//Attributes
	
	String name;
	String emailaddress;
	char gender;
	int age;
	long mobilenumber;
	

	
	person() //Default constructor assigning values to each attribute
	{
		
		name="Abhilash";
		emailaddress="abhi78@gmail.com";
		gender='M';
		age=30;
		mobilenumber=945121035;
	
	}
	
	
	person(String  valuefromrefobject)   //Parameterized constructor
	{
	
		this.name=valuefromrefobject;
		this.emailaddress=valuefromrefobject;
	}
		
	void printdetails()
	{
		System.out.println(name);
		System.out.println(emailaddress);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(mobilenumber);
	}
	
	
	
	{
		
	}
}
