package Enacapsulation;

public class OTT {
	
	public static void main(String[] args)
	{
		
		netflixlogin netflixlogin= new netflixlogin("Abhi@gmail.com","Test");
		
		boolean check= netflixlogin.isloggedin("abhilash@gmail.com", "test");
	    System.out.println(check);
	    
	    netflixlogin.emailaddress="Abhi@set";
	    netflixlogin.password="Important";
	    
	    //User able to manipulate emailaddress and pwd
	}

}

class netflixlogin
{
	
	public String emailaddress;
	public String password;
	
	public netflixlogin(String emailaddress, String password) {
		this.emailaddress = emailaddress;
		this.password = password;
	}
	
	


//Creating a function

boolean isloggedin(String emailaddress, String password)
{
	if(this.emailaddress.toLowerCase().equals(emailaddress) && this.password.toLowerCase().equals(password))
	{
		System.out.println("Welcome to netflix account");
		return true;
	}
	else
	{
		System.out.println("Invalid credentials");
		return false;
	}
}
}