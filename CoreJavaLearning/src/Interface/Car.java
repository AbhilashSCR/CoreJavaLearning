package Interface;

public class Car implements Accelerator,Clutch,Break,Gear,Horn{
	
	void starttheengine()
	{
		System.out.println("Engine is started");
		clutch();
		gear();
		accelerator();
		Break();
		horn();
		
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("Move the gear to 1st number");
	}
	
	@Override
	public void clutch() {
		// TODO Auto-generated method stub
		System.out.println("Long press on clutch");
		
	}
	
	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println("Lite race on accelerator");
		
	}
   
	@Override
	public void Break() {
		// TODO Auto-generated method stub
		System.out.println("Break when needed");
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		
			System.out.println("Horn when required, especially requesting someone to give a way");
		}
		
		
	}
	
	


	

