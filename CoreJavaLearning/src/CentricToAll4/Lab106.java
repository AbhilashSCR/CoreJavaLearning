package CentricToAll4;

public class Lab106 {
	
	public static void main(String[] args)
	{
		//Concept of 2D array
		
		
		int[][] array= new int[3][3];
		
		//FirstArray[3] represents rows;
		//SecondArray[3] represents columns;
		
		
		//Declaring the values for the 1stArray/row
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;


        //Declaring the values for the 2ndArray/2nd row
        array[1][0] = 40;
        array[1][1] = 50;
        array[1][2] = 60;

        //Declaring the values for the 3rdArray/3rd row
        array[2][0] = 70;
        array[2][1] = 80;
        array[2][2] = 90;
        
        //Nested for loop to validate rows and columns
        
        for(int i=0; i<=array.length-1;i++)     //i denotes columns
        {
        	for(int j=0; j<=array[i].length-1;j++)   //j denotes rows
        	{
        		System.out.print(array[i][j] + "\t");
        		
        	}
        	System.out.println();
        }
        
        
		
	}

}
