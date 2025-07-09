package Variabletypes;

public class Runnerclass {
	
	public static void main(String[] args)
	{
		
		
		System.out.println(Staticdemo.employeename);
	
		
		Staticdemo sd= new Staticdemo();
		sd.employee();
		
		
		Staticdemo sd1= new Staticdemo();
		sd1.employeeid=256;
		sd1.employeedetails();
		
	}

}
