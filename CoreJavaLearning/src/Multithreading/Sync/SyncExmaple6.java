package Multithreading.Sync;

public class SyncExmaple6 {

	public static void main(String[] args)
	{
		
		Sync6 object= new Sync6();
		T11 t11= new T11(object,"Thread1");
		t11.start();
		T12 t12= new T12(object,"Thread2");
		t12.start();
		
		
		
	}
}




class T11 extends Thread
{
	Sync6 object;
	String threadname;
	public T11(Sync6 object, String threadname) {
		this.object = object;
		this.threadname = threadname;
	}
	
	public void run()
	{
		object.m1();
	}
	
}



class T12 extends Thread
{
	Sync6 object;
	String threadname;
	public T12(Sync6 object, String threadname) {
		this.object = object;
		this.threadname = threadname;
	}
	
	public void run()
	{
		object.m2();
	}
}
class Sync6
{
	static synchronized void m1()
	{
		Thread t1= Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.println(t1.getName()+" M1 method is calling thread1 "+i);
		}
		
		try
		{
			Thread.sleep(8000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

//Consistent result inorderg
static synchronized void m2()
{
	Thread t2= Thread.currentThread();
	for(int i=6;i<=10;i++)
	{
		System.out.println(t2.getName()+" M1 method is calling thread2 "+i);
	}
	
	try
	{
		Thread.sleep(8000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}