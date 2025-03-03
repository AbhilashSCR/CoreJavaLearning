package CentricToAll1;

public class Lab026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Casting is also called as Mold
		
		//Widening: Is a process of converting lower data type to higher data type. It's a default operation
		
		byte b=34;
		int i=b; //Implicit casting
		System.out.println(i);
		
		
		//Narrowing : Is a process of converting higher data type to lower data type. It's a critical operation and cannot predict o/p
		
		int i1=236;
		byte b1= (byte)i1;  //Explicit casting
		System.out.println(b1);
	   
       long l=98632l;
       short s= (short)l;
       System.out.println(s);
       
		
	}

}
