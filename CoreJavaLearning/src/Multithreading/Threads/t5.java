package Multithreading.Threads;

public class t5 {

	
	public static void main(String[] args)
	{
		
		Runnable r1=new person();
		Thread t1= new Thread(r1);
		t1.start();
		
		Runnable r2= new person();
		Thread t2= new Thread(r2);
		t2.start();
		
		
		for(int i=0;i<5;i++)
			try{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
	}
}
}

//Creating class  using runnable interface 

class person implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	for(int i=0;i<=10;i++)
	try{
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	
}