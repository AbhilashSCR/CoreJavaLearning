package Multithreading.Sync;

public class SyncExample1 {
	
	public static void main(String[] args)
	{
		
		
		Sync1 obj1= new Sync1();
		Sync1 obj2= new Sync1();
		T1 t1=new T1(obj1,"Thread1");
		t1.start();
		T2 t2=new T2(obj2,"Thread2");
		t2.start();
		
		
		
	}
}



class T1 extends Thread
{
	 Sync1 obj;
	 String threadname;
	public T1(Sync1 obj, String threadname) {
		this.obj = obj;
		this.threadname = threadname;
	}
	
	public void run()
	{
		obj.m1();
	}
}

class T2 extends Thread
{
	Sync1 obj;
	String threadname;
	public T2(Sync1 obj, String threadname) {
		this.obj = obj;
		this.threadname = threadname;
	}
	public void run()
	{
		obj.m2();
	}
}

class Sync1
{
	void m1()
	{
	Thread t1= Thread.currentThread();
	for(int i=0;i<=5;i++)
	{
		System.out.println(t1.getName()+ " M1 method calling thread1--> "+ i);	
	}
	try
	{
		Thread.sleep(1000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 //Consistent results in random order

void m2()
{
	Thread t2= Thread.currentThread();
	for(int i=100;i<=105;i++)
	{
		System.out.println(t2.getName()+ " M2 method calling thread2--> "+ i);	
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


