package Enacapsulation;

public class Encapsulation1 {
	
	public static void main(String[] args)
	{
		
		//
		
		hotstar hstr=new hotstar("abhi@gmail.com","Test@123");
		
		//Incorrect password , unable to login
		boolean check=hstr.isloggedin("Abhi@gmail.com", "Test@123");
		System.out.println(check);    
		
		//Manipulating the username and password since we are not hiding
		
		hstr.emailaddress="abhi369@gmail.com";
		hstr.password="Test@369";
		
		//New credentials are created
		System.out.println(hstr.emailaddress);
		System.out.println(hstr.password);
		
		
		boolean check1=hstr.isloggedin("abhi369@gmail.com", "Test@369");
		System.out.println(check1);
	}

}

    

class hotstar{
	
	public String emailaddress;
	public String password;
	
	public hotstar(String emailaddress, String password) {
		this.emailaddress = emailaddress;
		this.password = password;
	}
	

	boolean isloggedin(String emailaddress,String password)
	{
		if(this.emailaddress.equals(emailaddress) && this.password.equals(password))
		{
			System.out.println("LoggedIn successfully");
			return true;
		}
		else
		{
			System.out.println("Incorrect crdentials");
			return false;
			
		}
	}
	
}