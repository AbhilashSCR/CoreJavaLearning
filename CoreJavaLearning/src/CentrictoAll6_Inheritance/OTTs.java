package CentrictoAll6_Inheritance;

public class OTTs {
	
	String netflixinda;
	String amazonprimevideo;
	String disneyhotstar;
	String zee5;
	String sonyliv;
	String Jiocinema;
	String aha;
	String sunnxt;
	String erosnow;
	String mxplayer;
	float revenueearned;

	
	OTTs(String NF, String APV, String DH, String Z, String SL, String JC, String AH, String SN, String EN, String MP,float RE)
	{
	this.netflixinda=NF;
	this.amazonprimevideo=APV;
	this.disneyhotstar=DH;
	this.zee5=Z;
	this.sonyliv=SL;
	this.Jiocinema=JC;
	this.aha=AH;
	this.sunnxt=SN;
	this.erosnow=EN;
	this.mxplayer=MP;
	this.revenueearned=RE;
		
}

 public void printdetails()
 {
	 System.out.println("It has more number of subscribers: "+disneyhotstar);
	 System.out.println("Highest revenue genearation in billions: "+revenueearned);
 }
}