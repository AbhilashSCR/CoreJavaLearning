package CentricToAll7_Customizedexceptions_CEE;

public class Bank {

	private String Currency;
	private Integer Amount;
	
	public Bank(String currency, Integer amount) {
		Currency = currency;
		Amount = amount;
	}
	
	
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public Integer getAmount() {
		return Amount;
	}
	public void setAmount(Integer amount) {
		Amount = amount;
	}
	
	
	public Integer add(Bank bankname) throws CustomException
	{
		if(bankname.Currency.equals("USD"))
		{
			throw new CustomException("USD is not supported to INR");
		}
		Integer sum=this.Amount+bankname.Amount;
		return sum;
	}
	
	
}
