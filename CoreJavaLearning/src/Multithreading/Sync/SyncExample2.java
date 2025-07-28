package Multithreading.Sync;

public class SyncExample2 {
	
	
	public static void main(String[] args)
	{
		
		
		
		Sync2 obj1=new Sync2();
		T3 t3= new T3(obj1,"Thread1");
		t3.start();
		T4 t4= new T4(obj1,"Thread2");
		t4.start();
		
	}

}


class T3 extends Thread
{
	Sync2 obj;
	String threadname;
	public T3(Sync2 obj, String threadname) {
		this.obj = obj;
		this.threadname = threadname;
	}
	
	public void run()
	{
		obj.m1();
	}
}


class T4 extends Thread
{
	Sync2 obj;
	String threadname;
	public T4(Sync2 obj, String threadname) {
		this.obj = obj;
		this.threadname = threadname;
	}
	
	public void run()
	{
		obj.m2();
	}
	
}


class Sync2{
	void m1()
	{
		Thread t1= Thread.currentThread();
		for(int i=0;i<=10;i++)
		{
			System.out.println(t1.getName()+ " M1 method is calling thread1-->" + i);
		}
		try
		{
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
}

//May be inconsistent result in random order

 void m2()
 {
	 Thread t2= Thread.currentThread();
	 for(int i=11;i<=15;i++)
	 {
		 System.out.println(t2.getName()+ " M2 method is calling thread2-->"+ i);
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

 
