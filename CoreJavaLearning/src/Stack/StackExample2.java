package Stack;

import java.util.Stack;

public class StackExample2 {

	public static void main(String[] args)
	{
		
		stack2 stack= new stack2();
		Thread t1=new Thread(()->
		{
			for(int i=0;i<=10;i++)
			{
				stack.push(i);
			}
			try
			{
				Thread.sleep(2500);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		});
		
		
		Thread t2= new Thread(()->
		{
			for(int i=0;i<=10;i++)
			{
				stack.pop(i);
			}
			try
			{
				Thread.sleep(2500);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		});
		
		
		
		t1.start();
		t2.start();
		
	}
}

  






class stack2
{
	private final Stack<Integer> stack= new Stack<>();
	private final int limited=5;
	
              synchronized void push(int value)
              {
            	  while(stack.size()==limited)
            	  {
            		  try
            		  {
            		  System.out.println("T1 is Pushed");
            		  wait();
            	  }catch(Exception e)
            		  {
            		  e.printStackTrace();
            		  }
              }
            	  stack.push(value);
            	  System.out.println("Pushed "+value);
            	  notify();
              }
	          



   synchronized  void pop(int value)
   {
	   while(stack.isEmpty())
	   {
		   try
		   {
			   System.out.println("T2 is Pushed");
			   wait();
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   stack.pop();
	   System.out.println("Poped "+value);
	   notify();
   }
}