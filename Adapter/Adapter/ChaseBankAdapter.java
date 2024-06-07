package Adapter;

import ThirdParty.ChaseBank;

public class ChaseBankAdapter implements BankAPI {

	private ChaseBank chasebank = new ChaseBank();
	@Override
	public void sendMoney(String from, String to, String amt) {
		
		chasebank.sendMoney(to, from, amt);
	}	
}
