package Multithreading.Threads;

public class t2 {

	public static void main(String[] args)
	{
		
		
		Thread t= Thread.currentThread();
		for(int i=0;i<=9;i++)
		{
			System.out.println(t.getThreadGroup()  + "--> " + t.getName() + i +  "--> "+t.getPriority());
		}
	}
}
