package CentricToAll4;

public class Lab107 {
	
	public static void main(String[] args)
	{
		
		int[][] arr=new int[4][5];
		
		//4 represents rows
		//5 represents columns
		
		 arr[0][0] =12;
		 arr[0][1] =12;
		 arr[0][2] =12;
		 arr[0][3] =12;
		 arr[0][4] =12;
		 
		 
		 
		 arr[1][0] =24;
		 arr[1][1] =24;
		 arr[1][2] =24;
		 arr[1][3] =24;
		 arr[1][4] =24;
		 
		 
		 arr[2][0] =36;
		 arr[2][1] =36;
		 arr[2][2] =36;
		 arr[2][3] =36;
		 arr[2][4] =36;
		 
		 
		 
		 arr[3][0] =48;
		 arr[3][1] =48;
		 arr[3][2] =48;
		 arr[3][3] =48;
		 arr[3][4] =48;
		 
		 
		
		 
		 for (int i=0;i<=arr.length-1;i++)
		 {
			 for(int j=0; j<=arr[i].length-1; j++)
			 {
				 
				 System.out.print(arr[i][j] + "\t");
			 }
			 System.out.println();
		 }
		 
	     
		 
	}

}
