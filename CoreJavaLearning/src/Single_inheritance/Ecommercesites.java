package Single_inheritance;

public class Ecommercesites {
	
	
	String electronics;
	String industrialsupplies;
	String homeandgardenneeds;
	String furniture;
	String fashion;
	String homeappliances;
	int discount;
	
	
	Ecommercesites(String EC, String IS, String HGN, String FR, String FN, String HA, int DT)
	{
	this.electronics=EC;
	this.industrialsupplies=IS;
	this.homeandgardenneeds=HGN;
	this.furniture=FR;
	this.fashion=FN;
	this.homeappliances=HA;
	this.discount=DT;
	
	
}

	public void printdetails()
		{
		System.out.println("Amazon is good for :"+this.electronics);
		System.out.println("Alibaba is good for : "+this.industrialsupplies);
		System.out.println("Ebay is good for :"+this.homeandgardenneeds);
		System.out.println("Walmart is good for:"+this.furniture);
		System.out.println("myntra is good for:"+this.fashion);
		System.out.println("Flipkart is good for:"+this.homeappliances);
		System.out.println("Discount applied on above products in percentage:"+this.discount);
			
		}
	}
	