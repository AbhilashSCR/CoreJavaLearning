package AccessModifiers_Police_Judge;

public class Judgement {
	
	public String punishtheaccused;
	
	
	public Judgement(String punishtheaccused) {
		this.punishtheaccused = punishtheaccused;
	}
	
	private void verdict()  //private is a concept of encapsulation
	{
		System.out.println("Supreme authority to provide justice");
	}
	
	

}
//Note:If we declare as public, granting access to Accused class and Lawyer class
//Note: If we declare as protected, only lawyer class can access
//Note: If we declare as private, only Accused class  can access

