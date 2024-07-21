package AccessModifiers_Police_Judge;

public class Cop {

	public int gunwithbullets;
	
  //Modifier with return type and name_variable
	
	public Cop(int gunwithbullets) 
	{
		this.gunwithbullets = gunwithbullets;
	}
		
	public void CanIshoot()
	{
		System.out.println("Ofcourse, you can shoot");
			
		}
}
	
//Note:If we declare as public, access granted to thief class and junior cop class
//Note: If we declare as protected, only junior cop class can access
//Note: If we declare as private, only cop class  can access
