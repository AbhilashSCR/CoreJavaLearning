package Polymorphism_Methodoverloading;

public class Classroom {
	
	//Method overloading is a concept of multiple functions/methods with same name and different arguments

	
	
	void students(int i)
	{
		System.out.println("Represents no. of students : "+i);
	}
	
	void students(String classleader)
	{
		System.out.println("Based on academic marks: " + classleader );
	}
	
	void students(double passpercentage)
	{
		System.out.println("PassPercentage: "+passpercentage);
	}
	
}


