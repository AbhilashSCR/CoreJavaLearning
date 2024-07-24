package Interface;

public class InterfaceImportantchecks {
	
	public static void main(String[] args)
	{
		
		hello h= new hello();
		h.say();  
		h.hello(); 
		
//Since hello() function  is common , if there is not child function declared, default will be invoked.
		
		I i= new hello();
		i.say();
		i.hello();
		
	}
}





interface I
{
	void say();

		default void hello()
		{
			System.out.println("Hello by-default");
		}
	}

interface I1
{
	
}

class hello implements I
{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Hello, how are you");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("I'm good, how about you");
	}
	
}