package CentricToAll5_Constructors;

public class Lab137 {

	public static void main(String[] args)
	{
		
		Typesofaccount savingsaccount= new Typesofaccount("Savings","SBA", 2.5f);
        savingsaccount.printdetails();
		
        Typesofaccount salaryaccount= new Typesofaccount("Salary","CRD",0.1f);
        salaryaccount.printdetails();
        
        Typesofaccount fdaccount= new Typesofaccount("Fixeddeposit", "FD", 45f);
        fdaccount.printdetails();
        
	}
}

		
		