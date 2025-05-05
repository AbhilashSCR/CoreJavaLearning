package CentricToAll4;

public class Lab130 {

	public static void main(String[] args)
	{
		
		StringBuilder NotThreadSafety=new StringBuilder("It is used in Single-Threaded environment");
		NotThreadSafety.append("It is Faster and more efficient");
		NotThreadSafety.reverse();
		System.out.println(NotThreadSafety);
		
		
		StringBuffer sb=new StringBuffer("It is safer");
		sb.append("It is thread saftey, recommended to use in multi-threaded environments");
		System.out.println(sb.reverse());
	}
}
;