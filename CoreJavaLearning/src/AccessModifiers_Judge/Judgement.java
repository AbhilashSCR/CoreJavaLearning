package AccessModifiers_Judge;

public class Judgement {
	
	public String punishtheaccused;
	
	
	public Judgement(String punishtheaccused) {
		this.punishtheaccused = punishtheaccused;
	}
	
	private void verdict()  //private is a concept of encapsulation
	{
		System.out.println("Supreme authority to provide justice");
	}
	
	
	protected void verdict1()
	{
		System.out.println("Fasttrack movement of judgements");
	}


//Note:If we declare as public, granting access to Accused class and Lawyer class
//Note: If we declare as protected, only lawyer class can access
//Note: If we declare as private, only Accused class  can access

  
public static void main(String[] args)
{
	Judgement jd= new Judgement("All evidences are produced");
	jd.verdict();
	System.out.println("Justice will always prevails");
	
}
}