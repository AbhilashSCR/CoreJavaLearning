package CentricToAll7_Customizedexceptions_CEE;

public class Lab177 {
	
	public static void main(String[] args) throws CustomException
	{
		
		Bank HSBC= new Bank("USD",100);
		Bank Bandhan= new Bank("INR",150);
		
		System.out.println(Bandhan.add(HSBC));
		
		
	}

}
