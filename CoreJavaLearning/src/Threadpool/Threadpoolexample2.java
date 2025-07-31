package Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpoolexample2 {

	
	public static void main(String[] args)
	{
		ExecutorService es1=Executors.newFixedThreadPool(1);
		ExecutorService es2=Executors.newFixedThreadPool(2);
		
		
		for(int i=1;i<=2;i++)
			es1.execute(new mytask("Pool1- task "+i));
		
	
        for(int i=3;i<=4;i++)
        	es2.execute(new mytask("Pool2-task "+i));
        
        es1.shutdown();
        es2.shutdown();
}
}
class mytask implements Runnable
{
	private String taskname;
	
	public mytask(String taskname) {
		this.taskname = taskname;
	}

	public void run()
	{
		
		Thread t1= Thread.currentThread();
		System.out.println("Starting "+ taskname + " on "+t1.getName());
		for(int i=0;i<=1;i++)
		{
			
			System.out.println(taskname + " : "+ i + " is worked and displayed by "+t1.getName());
			try
			{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Finished "+ taskname + " on "+t1.getName());
	}
}