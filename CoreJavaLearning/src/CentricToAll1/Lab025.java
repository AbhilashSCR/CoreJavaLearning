package CentricToAll1;

public class Lab025 {
	
	public static void main(String[] args)
	
	{
		//Not operator is also a part of logical operator
		
		boolean b1= true;
		System.out.println(b1);
		boolean b2= false;
		System.out.println(!b2);  
		
		int i=54;
		int j=67;
		int k=99;
		System.out.println(i>j);
		System.out.println(j<k);
		System.out.println(!(k>i));
		
		 //Using logical operators
        boolean d= (i<j) && (j<k);
        boolean e= (i>j) || (k>j);
        System.out.println(d);
        System.out.println(e);

        //Using bitwise operators

       boolean f=(19<5)| (5<10);
       boolean g=(14>17) &(7>14);
       System.out.println(!(f));
       System.out.println(g);

		
		
	}

}


