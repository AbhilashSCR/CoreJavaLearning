package CentricToAll1;

public class Lab016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Unary operator: Prefix -->++expr/--expr  , Postfix -->expr++/expr--
		
		
		int i=127;
		byte b=113;
		System.out.println(+i);
		System.out.println(+b);
		System.out.println(++i);
		System.out.println(b++);
		System.out.println(b++);//Here the byte value is incremented for postfix
		System.out.println(++i + b++);
		System.out.println(b-- - b++);
		System.out.println(i++ - --b);
		
		
	
		
	}

}
