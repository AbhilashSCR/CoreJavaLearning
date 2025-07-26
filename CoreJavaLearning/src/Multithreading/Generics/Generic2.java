package Multithreading.Generics;

public class Generic2 {

	
	public static <DT> void school(DT components)
	{
		System.out.println(components);
		
	}
	
	public static void main(String[] args)
	{
		school("Name of the school --> Pratibha");
		school("Student strength in each class--> "+10);
		school("School timings --> "+ 8.5);
		school("For admissions please contact -->"+ 6985247563l);
		
	}
}
