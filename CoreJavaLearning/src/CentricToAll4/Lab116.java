package CentricToAll4;

public class Lab116 {
	public static void main(String[] args)
	{
		char c=num('0','1');
		System.out.println(c);
		char c1=num1('1','1');
		System.out.println(c1);
		
	}

	
  static char num(char input1, char input2)
  {
	  return (char) (input1+input2);  //
  }
  static char num1(char input1, char input2)
  {
	  return (char)  (input1+input2);
  }
}

