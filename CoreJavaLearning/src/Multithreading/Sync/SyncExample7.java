package Multithreading.Sync;

public class SyncExample7 {
	
	public static void main(String[] args)
	{
		
		Bank b= new Bank();
		Runnable runnable = new Account(b);
		Thread t1= new Thread(runnable, "Abhilash");
		t1.start();
		Thread t2=new Thread(runnable,"Pratiba");
        t2.start();
		
		
	}

}



class Account implements Runnable
{
	Bank bank;



public Account( Bank bank) {
		this.bank = bank;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	
	for (int i=0;i<=5;i++)
	{
		 bank.withdraw(1200);
	}
	if(bank.getbalnce() <=200)
	{
		System.out.println("Minimum balance cannot be withdrawn");
	}
}



}
class Bank{
	int balance =6000;
   synchronized void withdraw(int amounttowithdraw)
    {
    	Thread t=Thread.currentThread();
    	if(balance >=amounttowithdraw)
    	{
    		System.out.println("Withdraw-->" + amounttowithdraw +"\t"+t.getName() );
    	
    	try
    	{
    		Thread.sleep(1000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	balance=balance-amounttowithdraw;
    	System.out.println(balance + "-->"+ "\t"+t.getName());
    }
    else
    {
    	System.out.println("Low balance");
    }
}

    public int getbalnce()
    {
    	return balance;
    }

}





