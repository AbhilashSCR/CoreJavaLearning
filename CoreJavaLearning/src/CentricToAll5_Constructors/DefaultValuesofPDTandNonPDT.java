package CentricToAll5_Constructors;

public class DefaultValuesofPDTandNonPDT 

{
	
	//Attributes
	
	//Billing information
	
	String customername;
	String emailaddress;
	byte shippingaddress;
	String landmark;
	char productcode;
	short pincode;
	int transactionid;
	long mobilenumber;
	float productheight;
	double productweight;
	boolean productdelivered;
	
	//Behaviour
	
	void customername()
	{
		System.out.println(customername);
	}
	
	void emailaddress()
	{
		System.out.println(emailaddress);
	}
	
	static byte shippingaddress() 
	{
		return shippingaddress();
	}
	
	static String landmark()
	{
		return landmark();
	}
	
	static char productcode()
	{
		return productcode();
	}
    
    static short pincode()
    {
    	return pincode();
    }
    static int transactionid()
    {
    	return transactionid();
    }
    
    static long mobilenumber()
    {
    	return mobilenumber();
    }
    
    static float productheight()
    {
    	return productheight();
    }
    
    static double productweight()
    {
    	return productweight();
    }
    
   public void printinfo() {
	   
	   System.out.println(customername);
	   System.out.println(emailaddress);
	   System.out.println(shippingaddress);
	   System.out.println(landmark);
	   System.out.println(productcode);
	   System.out.println(transactionid);
	   System.out.println(mobilenumber);
	   System.out.println(productheight);
	   System.out.println(productweight);
	   
   }
   }