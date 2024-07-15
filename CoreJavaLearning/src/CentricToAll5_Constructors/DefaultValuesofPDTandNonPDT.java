package CentricToAll5_Constructors;

public class DefaultValuesofPDTandNonPDT 

{
	
	//Attributes
	
	//Applicant details
	
	String name;
	char gender;
	int age;
	boolean ismarried;
	byte pincode;
	short assetsearned;
	long contactnumber;
	double height;
	float weight;
	
	
	//behaviour
	
	void name()
	{
		System.out.println(name);
	}
	
	static boolean ismarried()
	{
		return ismarried();
	}
	
	
	public void printinfo()
	{
		System.out.println(name);  
		System.out.println(gender);
		System.out.println(age);
		System.out.println(ismarried);
		System.out.println(pincode);
		System.out.println(assetsearned);
		System.out.println(contactnumber);
		System.out.println(height);
		System.out.println(weight);
	}

}
