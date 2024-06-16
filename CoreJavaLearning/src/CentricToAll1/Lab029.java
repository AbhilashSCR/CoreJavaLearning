package CentricToAll1;

public class Lab029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="Narendra Modi"; //SCP
		String name1="Narendra Modi"; //Since it is similar it is pointing to the same string
		String name2="Narendra Damodardas Modi"; //Creates a new string in SCP
		String name3= new String("Narendra Modi");  //It creates a new string in a object/heap area
		
		System.out.println(name==name1); //It checks for references
		System.out.println(name.equals(name1)); //It checks for values
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		System.out.println(name==name3);
		
		
		
		
		
	}

}
