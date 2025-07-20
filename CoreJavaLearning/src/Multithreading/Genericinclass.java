package Multithreading;

public class Genericinclass {
	
	public static void main(String[] args)
	{
		
		emp<String> name= new emp<String>("Abhilash");
		System.out.println(name.getObjects());
		emp<Character> gender= new emp<Character>('M');
		System.out.println(gender.getObjects());
		emp<String> occupation= new emp<String>("Associate Test engineer");
		System.out.println(occupation.getObjects());
		emp<Integer> empid=new emp<Integer>(234);
		System.out.println(empid.getObjects());
		emp<Float> experience=new emp<Float>(3.5f);
		System.out.println(experience.getObjects());
		emp<Double> CTC=new emp<Double>(5.6);
		System.out.println(CTC.getObjects());
		
		
	}

}


class emp <e>
{
	e Objects;

	public emp(e objects) {
		Objects = objects;
	}

	public e getObjects() {
		return Objects;
	}
}