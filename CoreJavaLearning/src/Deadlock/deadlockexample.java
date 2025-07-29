package Deadlock;

public class deadlockexample {
	
	
	public static void main(String[] args)
	{
		
		
		deadlock dl= new deadlock();
		
		Thread t1= new Thread(()->dl.m1(),"Thread A-->");
		t1.start();
		Thread t2= new Thread(()->dl.m2(),"Thread B-->");
		t2.start();
		
	}


}


class deadlock
{
	private final Object lock1= new Object();
	private final Object lock2= new Object();
	
	public void m1()
	{
		synchronized(lock1)
		{
			System.out.println(Thread.currentThread().getName()+ " Locked lock1 ");
		}
		try
		{
		  Thread.sleep(1000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		synchronized(lock2)
		{
			System.out.println(Thread.currentThread().getName()+ " Locked lock2 ");
	    }
}


public void m2()
	{
		synchronized (lock2)
		{
			System.out.println(Thread.currentThread().getName()+ " Locked lock2");
		}
		try
		{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		synchronized(lock1)
		{
			System.out.println(Thread.currentThread().getName()+ "Locked lock1");
		}
	}
	
}
