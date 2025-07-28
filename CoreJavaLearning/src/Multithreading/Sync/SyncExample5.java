package Multithreading.Sync;

public class SyncExample5 {
	
	public static void main(String[] args)
	{
		
		Sync5 object= new Sync5();
		T9 t9= new T9(object,"Thread1");
		t9.start();
		T10 t10=new T10(object,"Thread2");
		t10.start();
		
	}

}




class T9 extends Thread
{
	Sync5 object;
	String threadname;
	public T9(Sync5 object, String threadname) {
		this.object = object;
		this.threadname = threadname;
	}
	
	public void run()
	{
		object.m1();
	}
}



class T10 extends Thread
{
	Sync5 object;
	String threadname;
	public T10(Sync5 object, String threadname) {
		this.object = object;
		this.threadname = threadname;
	}
	
	public void run()
	{
		object.m2();
	}
}
class Sync5
{
	synchronized void m1()
	{
		Thread t1= Thread.currentThread();
		for(int i=0;i<=10;i++)
		{
			System.out.println(t1.getName()+ " M1 method is calling thread1--> "+i);
			
		}
		try
		{
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

//May be inconsistent result in random order

  static void m2()
  {
	  Thread t2= Thread.currentThread();
	  for(int i=11;i<=20;i++)
	  {
		  System.out.println(t2.getName()+ " M2 method is calling thread2--> "+i);
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