package BlockClass;

public class Blockclass {
	
	//IIB:Instance initialization block
	{
		System.out.println("IIB");
	}
	
	Blockclass()
	{
		System.out.println("Iam a default constructor");
	}
     //SIB:Static initialization block
   static
   {
	   System.out.println("SIB");
   }
}