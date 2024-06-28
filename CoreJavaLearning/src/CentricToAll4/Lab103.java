package CentricToAll4;

public class Lab103 {
	
	public static void main(String[] args)
	{
		
		 /*Important in terms of interview. This understanding is based on declaring the final keyword for the length,
        which is static However, the values are varied*/


        final int[] a = new int[2];
        //a[0] to a[2] =0
        System.out.println(a[0]);
        System.out.println(a[1]);
        
        
        final int[] table= {12,24,36,48,60};  //Elements in the array are replaced with the new one's
        
        table[0]=72;
        table[1]=84;
        table[2]=96;
        table[3]=108;
        table[4]=120;
       
        for (int i=0; i<=table.length-1;i++)
        {
        	System.out.println(table[i]);
        }
		
		
	}

}
