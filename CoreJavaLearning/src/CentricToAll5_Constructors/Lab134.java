package CentricToAll5_Constructors;

public class Lab134 {
	
	public static void main(String[] args)
	{
		
		Applicantdetails Ad=new Applicantdetails();
		Ad.Applicant_name="Abhilash Vemula";
		Ad.Gender="Male";
		Ad.maritalstatus=false;
		Ad.Occupation="Test Engineer";
		System.out.println(Ad.Applicant_name);
		System.out.println(Ad.Occupation);
		System.out.println(Ad.maritalstatus);
		

		Applicantdetails Ad2=new Applicantdetails();
		Ad2.Applicant_name="Pratiba";
		Ad2.maritalstatus=false;
		Ad2.Occupation="Teacher";
		System.out.println(Ad2.Applicant_name);
		System.out.println(Ad2.Occupation);
		
		System.out.println("Invalid information");
	    new Applicantdetails();      //It creates a memory allocation
	    Applicantdetails Ad3=null;   //No creation of memory allocation
	    System.out.println(Ad3);
		
	    

		
	}
}
