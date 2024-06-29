package CentricToAll4;

public class Lab109 {
	
	public static void main(String[] args)
	{
		int[][] array= new int[5][3];
		//5 represents rows
		//3 represents columns
		
		
		 array[0][0] =10;
		 array[0][1] =10;
		 array[0][2] =10;
		
		 array[1][0] =20;
		 array[1][1] =20;
		 array[1][2] =20;
		 
		 
		 array[2][0] =30;
		 array[2][1] =30;
		 array[2][2] =30;
		
		 
		 array[3][0] =40;
		 array[3][1] =40;
		 array[3][2] =40;
		
		 array[4][0] =50;
		 array[4][1] =50;
		 array[4][2] =50;
		 
		 
		 for (int i=0;i<=array.length-1; i++)
		 {
			 
			 for(int j=0; j<=array[i].length-1;j++)
			 {
				 System.out.print(array[i][j]+ "  ");
				
			 }
			 System.out.println();
		 }
	}

}
