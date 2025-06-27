package Hierarchial_inheritance;

public class Lab139 {

	
	public static void main (String args [])
	{
		
		Appointedbypresident ap=new Appointedbypresident("Comptroller and Auditor General of India ",2);
		ap.printdetails();
		
		Appointedbypresident ap1=new Appointedbypresident("Chief Election Commissioner and Election Commissioners",3);
		ap1.printdetails();
		
		Appointedbypresident ap2= new Appointedbypresident("Union Public Service Commission chariman",2);
		ap2.printdetails();
		
		Appointedbypresident ap3= new Appointedbypresident("Chief Justice of India and Supreme Court Judges",2);
		ap3.printdetails();
		
		Appointedbypresident ap4 = new Appointedbypresident("Attorney General of India",3);
		ap4.printdetails();
		
		Appointedbypresident ap5 = new Appointedbypresident("Governor of states",5);
		ap5.printdetails();
		
	}
}
