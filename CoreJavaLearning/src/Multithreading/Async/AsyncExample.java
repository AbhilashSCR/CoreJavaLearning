package Multithreading.Async;

public class AsyncExample {

	public static void main(String[] args)
	{
		
		Bank b= new Bank();
	    Runnable run=new Account(b);
	    Thread t1= new Thread(run,"Abhilash");
	    t1.start();
	    Thread t2=new Thread(run,"Vicky");
	    t2.start();
	    
		
	}
}


class Account implements Runnable
{

	Bank bank;
	
	public Account(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	 for(int i=0;i<=5;i++)
	 {
		 bank.withdraw(500);
	 }
	 if(bank.getbalance()<=500)
	 {
		 System.out.println("Minimum amount cannot be withdrawn");
	 }
	}
	
}



class Bank
{
	int balance=5000;
	 void withdraw(int debitedamount)
	{
		Thread t1=Thread.currentThread();
		if(balance >=debitedamount)
		{
			System.out.println("Withdrawn amount-->"+ debitedamount+ "\t"+t1.getName());
	
		try
		{
			Thread.sleep(5000);	
			}catch (Exception e)
		{
				e.printStackTrace();
		}
		
		balance= balance-debitedamount;
		System.out.println(balance+ "-->\t"+t1.getName());
	}

	else
	{
		System.out.println("Low balance");
	}
	}
	public int getbalance()
	{
		return balance;
	}
}