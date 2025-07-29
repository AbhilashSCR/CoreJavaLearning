package Stack;

import java.util.Stack;

public class StackExample{
	
	public static void main(String[] args)
	{
		stack stack= new stack();
	 
	Thread producer= new Thread(()->{
		for(int i=0;i<=10;i++)
		{
		 stack.push(i);
		 try
		 {
			 Thread.sleep(1000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		}
	
	});
	
	Thread consumer= new Thread(()->{
		for(int i=0;i<=10;i++)
		{
			stack.pop(i);
			try
			{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	});
	
	producer.start();
	consumer.start();
}
}


		
class  stack{

	private final Stack<Integer> stack= new Stack<>();
	private final int  capacity=5;
	
	//Push method
	synchronized void push(int value)
	{
		while(stack.size()==capacity)
		{
		try
		{
			System.out.println("Stack is full, producer waiting--");
			wait();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		stack.push(value);
		System.out.println(" produced "+value);
		notify();
	}
		
	//Pop method
	  synchronized void  pop(int value)
	  {
		  while(stack.isEmpty())
		  {
			  try
			  {
				  System.out.println("Stack is empty, consumer is waiting");
				  wait();
			  }catch(Exception e)
			  {
				  e.printStackTrace();
			  }
		  }
		  
		  
		 stack.pop();
		  System.out.println(" Consumed "+value);
		  notify();
		  
		  }
	  }




