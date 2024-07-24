package Interface;

public class UPIPayment implements MobileServer,Bankserver,NPCI{

	
	void UPIPaymenttransaction()
	{
	System.out.println("UPI transaction payment routing channels");
	mobileserver();
	bankserver();
	NPCI();
	
    }

	

	@Override
	public void mobileserver() {
		// TODO Auto-generated method stub
		System.out.println("First transition txn hit to mobile server");	
		
	}
	

	@Override
	public void bankserver() {
		// TODO Auto-generated method stub
		System.out.println("From mobile server to bank server");
	}

@Override
public void NPCI() {
	// TODO Auto-generated method stub")
	System.out.println("Bank server to NPCI server");
	
}


}