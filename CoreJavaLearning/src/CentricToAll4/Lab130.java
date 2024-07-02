package CentricToAll4;

public class Lab130 {

	public static void main(String[] args)
	{
		
		StringBuilder NotThreadSafety=new StringBuilder("It is used in Single-Threaded environment");
		NotThreadSafety.append("It is Faster and more efficient");
		NotThreadSafety.reverse();
		System.out.println(NotThreadSafety);
	}
}
;