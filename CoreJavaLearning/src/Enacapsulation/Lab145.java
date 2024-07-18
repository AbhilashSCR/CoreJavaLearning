package Enacapsulation;

public class Lab145 {
	
	public static void main(String[] args)
	{
		
		//Runner of both the classes
		
		BankAccountholder Bac=new BankAccountholder();
		Bac.printdetails(); 
		Bac.account_holder="Abhilash";
		Bac.account_number=124531464;
		Bac.balance=646541;
		System.out.println(Bac.account_holder);
		System.out.println(Bac.account_number);
		System.out.println(Bac.balance);
		
		//Now manipulating the data members, which is not a data hiding
		String account_holder="Abhishek";
		account_holder="Vicky";   
		int balance=654312;
		balance=132;  //Since there is no security and privacy someone accessed account and theft my money
		
		
		
		Employeedetails E1= new Employeedetails();
		String Employeedesignation="Junior software tester";
		Employeedesignation="Software tester";  //Manipulated the designation
		
		
	}

}

