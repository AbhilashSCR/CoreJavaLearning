package Innerclass;

public class Jobportal {
	
	public static void main(String[] args) {
		
		
		jobhunt jh= new jobhunt("Desparately looking for job");
		jobhunt.jobportal jp= jh.new jobportal("Actively updating profile");
		jh.lookingforjobchange();
		jp.accesstoaccount();
		
		
	
	}
}


class jobhunt{
	
	String jobsearch;
	
	public jobhunt(String jobsearch) {
	this.jobsearch=jobsearch;
}
 
	void lookingforjobchange()
	{
		System.out.println("Looking for better carrer opportunities");
	}


class jobportal{

   String accountcreation;
 
   public jobportal(String accountcreation)
   {
	   this.accountcreation= accountcreation;
   }
   
 void accesstoaccount()
 {
	 System.out.println("Able to apply relevant job profiles");
 }
}
}



