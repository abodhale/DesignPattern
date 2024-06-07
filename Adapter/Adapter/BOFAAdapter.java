package Adapter;

import ThirdParty.BOFABank;

public class BOFAAdapter implements BankAPI 
{
	private BOFABank bofabank = new BOFABank();
	
	@Override
	public void sendMoney(String from, String to, String amt)
	{
		bofabank.transferMoney(from, to, amt);
	}	
}
