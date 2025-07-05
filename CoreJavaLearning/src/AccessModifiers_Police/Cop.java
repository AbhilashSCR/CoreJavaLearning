package AccessModifiers_Police;

public class Cop {

	public int gunwithbullets;
	
  //Modifier with return type and name_variable
	
	public Cop(int gunwithbullets) 
	{
		this.gunwithbullets = gunwithbullets;
	}
		
	private void CanIshoot()
	{
		System.out.println("I can shoot at site");
			
		}
	
	protected void CanIshoot1()
	{
		System.out.println("I can shoot when needed");
	}


//Note:If we declare as public, access granted to thief class and junior cop class
//Note: If we declare as protected, only junior cop class can access
//Note: If we declare as private, only cop class  can access
  public static void main(String[] args)
  {
	  Cop cop= new Cop(4);
	  System.out.println("I don't have to seek for orders");
	  cop.CanIshoot();
  }
}
