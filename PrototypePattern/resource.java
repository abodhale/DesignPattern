import java.time.LocalDateTime;

public class resource 
{

	public static void main(String[] args) 
	{
		//Databaseconnection conn =Databaseconnection.getInstance();
		
		//		PaymentBuilder payment1 = new PaymentBuilder.Builder()
		//				.setAmount(0)
		//				.setCurrency("USD")
		//                .setPaymentMethod("Credit Card")
		//                .setRecipient("John Doe")
		//                .setTimestamp(LocalDateTime.now())
		//                .setDescription("Payment for services")
		//                .build();
		//
		//        System.out.println(payment1);

		
		
		DevConfiguration dev=new DevConfiguration("jdbc:mysql://localhost:3306/dev","http://api.example.com/dev","400 ms",true);
		
		DevConfiguration dev2 = dev.clone();
		dev2.apply();
		
		System.out.println("--------------------------------------------------------");
		
		
		ProdConfiguration prod=new ProdConfiguration("jdbc:mysql://localhost:3306/prod","http://api.example.com/prod","400 ms",true);
		Registry registry = new Registry();
		registry.register("production", prod);
		Configuration prod2=registry.get("production");
		
		prod2.apply();
		
		
	}

}
