package Abstraction;

public abstract class Animal {
	
	Animal()
	{
		
	}
     void domesticanimal()   //Complete (concrete) method
     {
    	 System.out.println("I am a domestic animal");
     }
	
     abstract void pet();  //incomplete method
}
