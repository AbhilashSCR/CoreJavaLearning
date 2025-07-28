package Multithreading.Sync;

public class SyncExample3 {
	
	public static void main(String[] args)
	{
		
		Sync3 obj1= new Sync3();
		T5 t5= new T5(obj1,"Thread1");
		t5.start();
		T6 t6= new T6(obj1,"Thread2");
		t6.start();
		
	}

}

class T5 extends Thread
{
	Sync3 obj;
	String threadname;
	public T5(Sync3 obj, String threadname) {
		this.obj = obj;
		this.threadname = threadname;
	}
	
	public void run()
	{
		obj.m1();
	}
} 


class T6 extends Thread
{
	Sync3 obj;
	String threadname;
	public T6(Sync3 obj, String threadname) {
		this.obj = obj;
		this.threadname = threadname;
	}
	
	public void run()
	{
		obj.m2();
	}
	
}



class Sync3
{
	synchronized void m1()
	{
		Thread t1=Thread.currentThread();
		for(int i=0;i<=8;i++)
		{
			
			System.out.println(t1.getName()+ " M1 method is calling thread1 "+ i);
		}
		try
		{
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	
	//Consistent results  in order
	
 synchronized void m2()
{
Thread t2= Thread.currentThread();
for(int i=9;i<=15;i++)
{
	System.out.println(t2.getName()+ " M2 method is calling thread2 "+ i );
}
try
{
	Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
}