package CollectionFramework;

import java.util.Stack;

public class StackExample1 {
	
	public static void main(String[] args)
	{
		
		 //Note: Stack follows the LIFO approach lastinfirstout & FILO firstinlastout
		
		Stack stack= new Stack();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		System.out.println(stack);
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
	}

}
