package Encapsulation;

public class Netbanking {

	
	public static void main(String[] args)
	{
		ICICInetbanking netbankinglogin= new ICICInetbanking("Abhilash","wipeout");
		
        boolean check= netbankinglogin.isloggedin("ABHILASH", "NOTNEEDED");
        System.out.println(check);
        
        netbankinglogin.setUsername("abhilash");
        String username=netbankinglogin.getUsername();
        System.out.println(username);
        
        //User able to set and get the username and pwd, since we are enabling it.
        
        netbankinglogin.setPassword("teddy");
        String password=netbankinglogin.getPassword();
        System.out.println(password);
		
        boolean check2= netbankinglogin.isloggedin("Abhilash", "tEddy");
        System.out.println(check2);
	}
}


class ICICInetbanking
{
	private String username;
	private String password;
	
	public ICICInetbanking(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


 boolean isloggedin(String username,String password)
 {
	 if(this.username.toLowerCase().equalsIgnoreCase(username)&& this.password.toLowerCase().equalsIgnoreCase(password))
	 {
		 System.out.println("User loggedin successfully");
		 return true;
	 }
	 else
	 {
		 System.out.println("Invalid credentials");
		 return false;
	 }
 }
}

