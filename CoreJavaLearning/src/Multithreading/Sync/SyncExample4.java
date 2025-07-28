package Multithreading.Sync;

public class SyncExample4 {
	
	public static void main(String[] args)
	{
		
		Sync4 objects=new Sync4();
		T7 t7= new T7(objects,"Thread1");
		t7.start();
		T8 t8= new T8(objects,"Thread2");
		t8.start();
		
	}

}

 class T7 extends Thread
 {
	 Sync4 objects;
	 String threadname;
	 public T7(Sync4 objects, String threadname) {
		this.objects = objects;
		this.threadname = threadname;
	}
	 

public void run()
{
     objects.m1();	
}


 }


 class T8 extends Thread
 {
	 Sync4 objects;
	 String threadname;
	 public T8(Sync4 objects, String threadname) {
		this.objects = objects;
		this.threadname = threadname;
	}
	
	 public void run()
	 {
		 objects.m2();
	 }
 }


class Sync4
{
	synchronized void m1()
	{
		Thread t1= Thread.currentThread();
		for(int i=0;i<=7;i++)
		{
			
			System.out.println(t1.getName()+ " M1 method is calling thread1--> "+ i);
		}
		try
		{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
 //Inconsistent result in random order

 void m2()
 {
	 Thread t2=Thread.currentThread();
	 for(int i=8;i<=17;i++)
	 {
		 System.out.println(t2.getName()+ " M2 method is calling thread2--> "+i);
	 }
	 try
	 {
		 Thread.sleep(5000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
}