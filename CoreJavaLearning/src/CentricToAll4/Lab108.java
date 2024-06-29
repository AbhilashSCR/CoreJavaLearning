package CentricToAll4;

public class Lab108 {
	
	public static void main(String[] args)
	{
		
		int[][] array= new int[3][7];
		//3 represents rows
		//7 represents columns
		
		
		 array[0][0] =16;
		 array[0][1] =16;
		 array[0][2] =16;
		 array[0][3] =16;
		 array[0][4] =16;
		 array[0][5] =16;
		 array[0][6] =16;
		 
		 
		 
		
		 array[1][0] =32;
		 array[1][1] =32;
		 array[1][2] =32;
		 array[1][3] =32;
		 array[1][4] =32;
		 array[1][5] =32;
		 array[1][6] =32;
		 
		 
		 array[2][0] =48;
		 array[2][1] =48;
		 array[2][2] =48;
		 array[2][3] =48;
		 array[2][4] =48;
		 array[2][5] =48;
		 array[2][6] =48;
		 
		 
		 for(int i=0; i<=array.length-1;i++)
		 {
			 for(int j=0; j<=array[i].length-1;j++)
			 {
				 
				 System.out.print(array[i][j] + "  "); //It creates a space 
			 }
			 System.out.println();
		 }
		
	}

}
