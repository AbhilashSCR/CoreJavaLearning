package CentricToAll4;

public class Lab116 {
	public static void main(String[] args)
	{
		int i=mod(145,23);
		System.out.println(i);
		int i1=mod(652,236,12);
		System.out.println(i1);
			
	}

	
  static int mod(int input_1, int input_2,int input_3)
  {
	  return input_1%input_3;   //It displays remainder as a quotient
  }
   
  static int mod(int input_1,int input_2)
  {
	  return input_1%input_2;
  }
}
