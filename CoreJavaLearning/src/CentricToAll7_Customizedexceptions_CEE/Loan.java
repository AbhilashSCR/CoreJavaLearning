package CentricToAll7_Customizedexceptions_CEE;

public class Loan {
	
	private String Handloan;
	public Loan(String handloan, Integer interest) {
		Handloan = handloan;
		Interest = interest;
	}
	
	private Integer Interest;
	
	
	public String getHandloan() {
		return Handloan;
	}
	public void setHandloan(String handloan) {
		Handloan = handloan;
	}
	public Integer getInterest() {
		return Interest;
	}
	public void setInterest(Integer interest) {
		Interest = interest;
	}
	
   public Integer add(Loan OtherInterest) throws CustomException1
   {
	   if(!(OtherInterest.Handloan.equals("OtherInterest")))
	   {
		   throw new CustomException1("Cannot append both");
	   }
	   Integer sum=this.Interest+OtherInterest.Interest;
	   return sum;
   }
	
}
