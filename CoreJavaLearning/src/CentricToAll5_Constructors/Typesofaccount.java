package CentricToAll5_Constructors;

public class Typesofaccount {

	
	//Attributes
	
	String accounttype;
	String accountcode;
	float interest;

	
	

   


  Typesofaccount(String accounttype, String accountcode, float interest)
  {
	  this.accounttype=accounttype;
	  this.accountcode=accountcode;
	  this.interest=interest;
	 
  }
  
  
  
  void printdetails() {
	  
	  System.out.println("accounttype-->"+this.accounttype);
      System.out.println("accountcode-->" +this.accountcode);
	  System.out.println("Interest -->"+this.interest+"%");
  }
}


