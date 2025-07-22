package Multithreading.Threads;

public class t2 {

	public static void main(String[] args)
	{
		
		
		Thread t= Thread.currentThread();
		for(int i=0;i<=10;i++)
		{
			System.out.println(t.getName() + i + " " + t.getThreadGroup() + " "+t.getPriority());
		}
	}
}
