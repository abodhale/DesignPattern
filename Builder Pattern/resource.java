import java.time.LocalDateTime;

public class resource 
{

	public static void main(String[] args) 
	{
		//Databaseconnection conn =Databaseconnection.getInstance();
		
		PaymentBuilder payment1 = new PaymentBuilder.Builder()
							    .setAmount(0)
							    .setCurrency("USD")
                  				            .setPaymentMethod("Credit Card")
                                                            .setRecipient("John Doe")
                				            .setTimestamp(LocalDateTime.now())
                                                            .setDescription("Payment for services")
                                                            .build();
           System.out.println(payment1);

	}

}
