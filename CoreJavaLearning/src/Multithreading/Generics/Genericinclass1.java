package Multithreading.Generics;

public class Genericinclass1 {
	
	public static void main(String[] args)
	{
		
		
		bank <String> name=new bank <String>("ICICbank");
		System.out.println(name.getObjects());
		bank <Long> accountnumber=new bank<Long>(1236987456321L);
		System.out.println(accountnumber.getObjects());
		bank <Integer> balance=new bank<Integer>(1000);
		System.out.println(balance.getObjects());
		
	}
	
	
}
class bank <b>
{
	b objects;

	public bank(b objects) {
		this.objects = objects;
	}

	public b getObjects() {
		return objects;
	}


}