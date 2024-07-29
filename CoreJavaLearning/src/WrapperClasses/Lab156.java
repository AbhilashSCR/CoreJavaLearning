package WrapperClasses;

public class Lab156 {
	
	public static void main(String[] args)
	{
		
  //Converting primitive data type to wrapper class
		
		int a =10;
		Integer a2= Integer.valueOf(a);
		System.out.println(a);   
		System.out.println(a2);

		
       double d=12.3d;
       Double D= Double.valueOf(d);
	   System.out.println(D);
	   
	   //Conversion of primitive to string
	   String s= String.valueOf(d);
	   System.out.println(s);
	   
	   
	   
	   // Converting of  wrapper classes to primitive
       Character ch='a';  //This concept is known as unboxing
       char c= ch;
       System.out.println(ch);
       System.out.println(c);

       
       Integer I= 100;
       int i= I;
       System.out.println(I);
       System.out.println(i);
       
       

       System.out.println(Integer.valueOf("119"));
       System.out.println(Integer.max(54,44));
       System.out.println(Integer.min(31,54));
       System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);
       System.out.println(Double.MAX_VALUE);
       System.out.println(Double.MIN_VALUE);
       
       
       
       
       
       
       
       
       
	}

}
