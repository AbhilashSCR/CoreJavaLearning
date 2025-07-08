package Interface.POSsettlementprocess;

public class Possettlement implements Transactioninitiation,Authorization,TransactionCompletion,Batching,Clearingandsettlement,Merchantfunding,Reconcilation{

		
		void postransaction()
		{
			System.out.println("Following is the step by step process of pos txn settlement");
			
			transactioninitiation();
			authorization();
			transactioncompletion();
			batching();
			clearingandsettlement();
			merchantfunding();
			reconcilation();
			
			
		}
		
		
	
	
	@Override
	public void reconcilation() {
		// TODO Auto-generated method stub
		System.out.println("Issuer bank refelects the charge in the customer's statement");
	}

	@Override
	public void merchantfunding() {
		// TODO Auto-generated method stub
		System.out.println("Merchant discount rate/Service charages");
	}

	@Override
	public void clearingandsettlement() {
		// TODO Auto-generated method stub
		System.out.println("Clears the transaction, debits issuer bank and credits acquirer bank");
	}

	@Override
	public void batching() {
		// TODO Auto-generated method stub
		System.out.println("Closes the batch and all the approved transactions are sent to the acquirer's bank");
	}

	@Override
	public void transactioncompletion() {
		// TODO Auto-generated method stub
		System.out.println("If approved, receipt is printed");
	}

	@Override
	public void authorization() {
		// TODO Auto-generated method stub
		System.out.println("Sends the request to paymentprocessor, cardnetwork and issuer bank ");
	}

	@Override
	public void transactioninitiation() {
		// TODO Auto-generated method stub
		System.out.println("Captures card details and transaction amount");
	}

}
