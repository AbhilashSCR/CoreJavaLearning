package Hierarchial_inheritance;

public class Appointedbypresident {
	
	String constitutionalofficeholders;
	int service;
	
	

	Appointedbypresident(String constitutionalofficeholders, int service)
	{
		
		this.constitutionalofficeholders=constitutionalofficeholders;
		this.service=service;
	}
		
		void printdetails()
		{
			System.out.println("COH -->"+ this.constitutionalofficeholders + "," + " For the period of --> "+this.service + " Years ");
		}
		
	}

