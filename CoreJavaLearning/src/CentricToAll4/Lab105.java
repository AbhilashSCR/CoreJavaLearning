package CentricToAll4;

public class Lab105 {

	public static void main(String[] args)
	{
		//Concept of 1D array
		
		int[] age= new int[4];
		age[0]=15;
		age[1]=18;
		age[2]=23;
		age[3]=28;
		
		
		for (int i=0; i<=age.length-1;i++)
		{
			
			System.out.println(age[i]);
		}
		
	   //Executing the same using while loop
		
		   int  i=0;
		   while(i<=age.length-1)
		   {
			   System.out.println(age[i]);
			   i++;
		   }
		
	
	}
}
