package Multithreading.Threads;

public class t4 {

	
	public static void main(String[] args)
	{
		
	  employee e1= new employee();
	  e1.start();
	  
	  employee e2= new employee();
	  e2.start();
	  
	  employee e3= new employee();
	  e3.start();
	  
	  for(int i=0;i<3;i++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName());
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
	
	class employee extends Thread
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		
		for(int i=0;i<=9;i++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName() + " Working parallely ");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		}
	}

		
		
	



