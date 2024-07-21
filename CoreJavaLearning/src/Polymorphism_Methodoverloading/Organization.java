package Polymorphism_Methodoverloading;

public class Organization {
	
	
	void employee(String founder)
	{
		System.out.println("Founder : "+founder);
	}
	void employee(int foundedin)
	{
		System.out.println("Founded in:"+foundedin);
	}
   
	/***void employee(byte employeesize)
	{
		System.out.println("Current employeesize:"+employeesize);
	}***/
	
	void employee(long companyvaluation)
	{
		System.out.println("Significant growth rate of :"+ companyvaluation);
	}
	
	void employee(double growthrate)
	{
		System.out.println("Evaluation of growth per annum :"+growthrate);
	}
}
