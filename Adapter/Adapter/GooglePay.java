package Adapter;

public class GooglePay {
	

	public static void main(String[] args)
	{
		BankAPI bankAPI = new ChaseBankAdapter();
		bankAPI.sendMoney("akash", "chris", "1000");	
	}
}
