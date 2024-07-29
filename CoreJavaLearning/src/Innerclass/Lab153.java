package Innerclass;

import Innerclass.socialmedia.Shareofthoughts;

public class Lab153 {
	
	public static void main(String[] args)
	{
		socialmedia sc= new socialmedia("Global platform to connect remotely");
		socialmedia.Shareofthoughts shareofthoughts=new socialmedia.Shareofthoughts(100);
		sc.jobsearch();
		shareofthoughts.conversation();
	}

}

//Note: Incase of static class syntax is changing

class socialmedia
{
	String LinkedIn;

	public socialmedia(String linkedIn) {
		LinkedIn = linkedIn;
	}
		void jobsearch()
		{
			System.out.println("Platform for professionals to help remotely");
		}
	
	
static class Shareofthoughts
{
	int connections;

	public Shareofthoughts(int connections) {
		this.connections = connections;
	}
	
	void conversation()
	{
	  System.out.println("Sharing of knowledge of particular domain, industry");
	}
}
}
