package Innerclass;

public class Lab152 
{
    public static void main(String[] args)
    {
    	OTT ott= new OTT("Amazon has control over prime video ott platform");
    	OTT.PreRequsite prerequisite= ott.new PreRequsite("User must have a account registered with moible number");
    	ott.typeofsubscription();
    	prerequisite.typeofaccessing();
    }
}

class OTT {
	
	String primevideo;

	public OTT(String primevideo) {
		this.primevideo = primevideo;
	}
	 void typeofsubscription()
	 {
	System.out.println("Mine is paid one");
	
}
	 
class PreRequsite
{
	String account;

	public PreRequsite(String account) {
		this.account = account;
	}
	
	void typeofaccessing()
	{
		System.out.println("Over the browser or login to specific ott account");
	}
}
}






