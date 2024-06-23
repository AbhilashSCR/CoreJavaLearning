package CentricToAll3;

public class Lab069 {
	public static void main(String[] args)
	{
	//Printing of odd numbers in different logic
 	for(int i=0;i<=10;i=i+1)
 	{
 	 if (i%2==0)
 	 {
 		 continue;
 	 }
	System.out.println(i);
 	}
 	
 	System.out.println();
 	
 	for(int i=10;i>=0;i=i-1)
 	{
 		if(i%2==1)
 		{
 			break;
 		}
 		System.out.println(i);
 	}
 	
 	System.out.println("New code in the next line");
 	
	//Printing of even numbers in different logic
	for(int i=1;i<=10;i=i+1)
	{
		 if (i%2==1)
	 	 {
	 		 continue;
	 	 }
		System.out.println(i);
	}
	System.out.println();
	
	for(int i=10;i>=1;i=i-1)
	{
		if(i%2==1)
 		{
 			break;
 		}
		System.out.println(i);
	}
	
}
}

