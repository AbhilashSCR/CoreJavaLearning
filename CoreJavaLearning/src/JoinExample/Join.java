package JoinExample;

public class Join {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		Recruitment recruitment= new Recruitment();
		Mythread t1= new Mythread(recruitment,"Hired");
		t1.start();
		t1.join();
		Thread t2= Thread.currentThread();
		for(int i=1;i<=10;i++)
		{
			System.out.println(t2.getName()+ "-->"+ i);
			try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				
		     e.printStackTrace();
		
		}
	}
	}
}
	




class Mythread extends Thread
{
	Recruitment recruitment;
	String threadname;
	
	public Mythread(Recruitment recruitment, String threadname) {
		this.recruitment = recruitment;
		this.threadname = threadname;
	}
	
  public void run()
  {
	  Thread.currentThread().setName(threadname);
	  recruitment.hiring();
  }


}

class Recruitment{
	
	void hiring()
	{
		Thread t1= Thread.currentThread();
			for(int i=1;i<=10;i++)
			{
				System.out.println(t1.getName()+ "-->"+ i);
				try {
					Thread.sleep(1000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
	}
}


			
	
