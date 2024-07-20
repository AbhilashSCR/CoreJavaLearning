package Enacapsulation;

public class Encapsulation2 {

	public static void main(String[] args)
	{
		
		//Enabling and setter and getter method for username only
		
		ICICInetbanklogin login=new ICICInetbanklogin("Abhilash","explore");
		
		boolean check=login.isLoggedin("Abhil@sh","explore");
		System.out.println(check);
		

		login.setUsername("Abhilash@412");
		String username=login.getUsername();
		//Able to retrieve the password using get method
		System.out.println(username);
		
		
//Since we did defined getter/setter for password, it does not shown as suggestions 
//when trying to manipulate for password
		
		
	}
}



class ICICInetbanklogin
{
	private String username;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String password;
	
	
	public ICICInetbanklogin(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	boolean isLoggedin(String username,String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
		{
			System.out.println("LoggedIn");
			return true;
		}
		else
		{
			System.out.println("Invalid credentials");
			return false;
		}
		
	}
}