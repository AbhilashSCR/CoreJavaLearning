package Single_inheritance;

public class Mobilenetworks {
	
	String reliancejio;
	String bharatiairtel;
	String vodafoneidea;
	String bsnl;
	double users;
	
	
	Mobilenetworks(String RJ, String BA, String VI, String BL, double US)
	{
		this.reliancejio=RJ;
		this.bharatiairtel=BA;
		this.vodafoneidea=VI;
		this.bsnl=BL;
		this.users=US;
	}
	
	public void printdetails()
	{
		System.out.println("There are four moible operators in india: Reliancejio,BharatiAirtel,VodafoneIdea,BSNL");
		System.out.println("Jio has more number of users:"+this.users);
	
	}
	
	
	
	

}
