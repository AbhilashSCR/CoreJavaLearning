package Single_inheritance;

public class OTTs {
	
	String netflixinda;
	String amazonprimevideo;
	String jiohotstar;
	String zee5;
	String sonyliv;
	String Jiocinema;
	String aha;
	String sunnxt;
	String erosnow;
	String mxplayer;
	float revenueearned;

	
	OTTs(String NF, String APV, String JH, String Z, String SL, String JC, String AH, String SN, String EN, String MP,float RE)
	{
	this.netflixinda=NF;
	this.amazonprimevideo=APV;
	this.jiohotstar=JH;
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
	 System.out.println("Revenue generated in crores by Jiohotstar: "+revenueearned);
 }
}