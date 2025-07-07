package IVPOV;

public class IV2 {
	
	public static void main(String[] args)
	{
		student s= new student();
		student s1=new student();
		student s2=new student();
		student s3=null;
		
		System.out.println(s.a);
		s.learn();
		s1.learn();
		s2.learn(); 
		s3.learn();
		//It must throw an exception, since no object is declared for student s3 in this case.
		
		
	}

}


class student{
	
	int a;
		
	student()
	{
	this.a=10;
    }
   void learn()
   {
	   System.out.println("Students are the ambitious");
   }
	
}
	