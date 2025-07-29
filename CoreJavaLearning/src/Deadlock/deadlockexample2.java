package Deadlock;

public class deadlockexample2 {
	
	public static void main(String[] args)
	{
		
		
		deadlock2 dl= new deadlock2();
		Thread t1= new Thread(()->dl.method1(),"Thread A");
		t1.start();
		Thread t2= new Thread(()->dl.method2(),"Thread B");
		t2.start();
		
	}

}






class deadlock2
{
	private final Object resourceA= new Object();
	private final Object resourceB= new Object();
	
	
	public void method1() {
		
		synchronized (resourceA)
		{
			System.out.println(Thread.currentThread().getName()+ " Locked Resource A");
		}
		try
		{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		synchronized (resourceB)
		{
			System.out.println(Thread.currentThread().getName()+ " Locked Resource B");
		}
	}
	
	
	public void method2()
	{
		synchronized (resourceB)
		{
			System.out.println(Thread.currentThread().getName()+ " Locked Resource B");
		}
		try
		{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		synchronized (resourceA)
		{
			System.out.println(Thread.currentThread().getName()+ " Locked Resource A");
		}
	}
	
	
}