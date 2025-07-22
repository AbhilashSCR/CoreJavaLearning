package Multithreading.Threads;

public class t4 {

	
	public static void main(String[] args)
	{
		
		Employee e1= new Employee();
		e1.start();
		
		Employee e2= new Employee();
		e2.start();
		
		for (int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
	}
}
	}
	}

class Employee extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	}
}
	
	
	
