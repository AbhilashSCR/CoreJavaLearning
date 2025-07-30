package JoinExample;

public class Join2 {

	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		Forceresignation fr= new Forceresignation();
		Mythread1 mt1= new Mythread1(fr,"Fired");
		mt1.start();
		mt1.join();
		
		
		Thread t2=Thread.currentThread();
		for(int i=0;i<=10;i++)
		{
			System.out.println(t2.getName()+ "-->"+i);
			
		}
		try{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		{
			
			
		}
	}
	
		
	}



class Mythread1 extends Thread
{
	Forceresignation fr;
	String threadname;
	public Mythread1(Forceresignation fr, String threadname) {
		this.fr = fr;
		this.threadname = threadname;
	}
	
	public void run()
	{
		Thread.currentThread().setName(threadname);
		fr.firing();
	}
}






class Forceresignation
{
	
	void firing()
	{
	Thread t1=Thread.currentThread();
	for(int i=0;i<=10;i++)
	{
		System.out.println(t1.getName()+ "-->"+i);
		
	}
	try{
		Thread.sleep(1000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	{
		
		
	}
}
}