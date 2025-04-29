	package CentricToAll4;

public class Lab110 {
	
	public static void main(String[] args)
	{
		
		int[][] array= new int[8][4];
		//5 represents rows
		//3 represents columns
		
		
		 array[0][0] =10;
		 array[0][1] =10;
		 array[0][2] =10;
		 array[0][3] =10;
		 
		
		 array[1][0] =20;
		 array[1][1] =20;
		 array[1][2] =20;
		 array[1][3] =10;
		 
		 
		 array[2][0] =30;
		 array[2][1] =30;
		 array[2][2] =30;
		 array[2][3] =10;
		
		 
		 array[3][0] =40;
		 array[3][1] =40;
		 array[3][2] =40;
		 array[3][3] =10;
		
		 array[4][0] =50;
		 array[4][1] =50;
		 array[4][2] =50;
		 array[4][3] =10;
		 
		 array[5][0] =60;
		 array[5][1] =60;
		 array[5][2] =60;
		 array[5][3] =10;
		 
		 
		 array[6][0] =70;
		 array[6][1] =70;
		 array[6][2] =70;
		 array[6][3] =10;
		 
		 array[7][0] =70;
		 array[7][1] =70;
		 array[7][2] =70;
		 array[7][3] =10;
		 
		 
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
	


