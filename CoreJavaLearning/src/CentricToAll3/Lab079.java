package CentricToAll3;

public class Lab079 {

	public static void main(String[] args)
	{
		int i=1;
		int number=5;
		int fact=1;
		
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(" Factorial of " + number + " is "+fact);
	}

}