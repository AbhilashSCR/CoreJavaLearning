package Multithreading.Threads;

public class t3 {

	
	public static void main(String[] args)
	{
	
		
		Worker w1=new Worker();
        w1.start();   //To start the thread

        Worker w2=new Worker();
        w2.start();
		
		
		
	}

}

class Worker extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		try{
			System.out.println(Thread.currentThread().getName()+ " Working simultaneously ");
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}