package CentricToAll7_Customizedexceptions_CEE;

public class Lab178 {
	
	public static void main(String[] args) throws CustomException1
	{
		
		Loan handloan= new Loan("Handloan",500);
		Loan personalloan= new Loan("Personalloan",1000);
		
		System.out.println(personalloan.add(handloan));
		
		
	}

}
