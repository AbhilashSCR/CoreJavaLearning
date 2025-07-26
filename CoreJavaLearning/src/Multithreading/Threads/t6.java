package Multithreading.Threads;

public class t6 {

	
	public static void main(String[] args)
	{
		
		Runnable r1= new sheet();
		Thread t1= new Thread(r1);
        t1.start();
        
        
        Runnable r2= new sheet();
		Thread t2= new Thread(r2);
        t2.start();		
		
        
        for(int i=0;i<=2;i++)
    	{
    		try {
    			System.out.println(Thread.currentThread().getName() + " Both are working on different sheets ");
    		}catch (Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
        
	}
}


class sheet implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	for(int i=0;i<=4;i++)
	{
		try {
			System.out.println(Thread.currentThread().getName() + " Both are working on different sheets ");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
}