package Threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpoolexample {
	
	public static void main(String[] args)
	{
		
		mythread mt= new mythread();
		ExecutorService es1= Executors.newFixedThreadPool(1);
	    for(int i=0;i<=2;i++)
	    es1.execute(mt);
	    ExecutorService es2= Executors.newFixedThreadPool(1);
	    for(int i=0;i<=2;i++)
	    es2.execute(mt);
	    
	    es1.shutdown();
	    es2.shutdown();
	    }
	}




class mythread extends Thread
{
	public void run()
	{
		Thread t1= Thread.currentThread();
		for(int i=1;i<=3;i++)
		{
			System.out.println(i + " work is displayed on "+ t1.getName());
		}
		try
		{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}