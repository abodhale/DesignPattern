import java.time.LocalDateTime;

public class PaymentBuilder {
	private double amount;
	private String currency;
	private String PaymentMethod;
	private String recipient;
	private LocalDateTime timestamp;
	private String Description;
	
	private PaymentBuilder(Builder bld)
	{
		this.amount=bld.amount;
		this.currency=bld.currency;
		this.PaymentMethod=bld.PaymentMethod;
		this.recipient=bld.recipient;
		this.timestamp=bld.timestamp;
		this.Description=bld.Description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	  @Override
	    public String toString() {
	        return "Payment{" +
	                "amount=" + amount +
	                ", currency='" + currency + '\'' +
	                ", paymentMethod='" + PaymentMethod + '\'' +
	                ", recipient='" + recipient + '\'' +
	                ", timestamp=" + timestamp +
	                ", description='" + Description + '\'' +
	                '}';
	    }
	  
	public static class Builder
	{

		private double amount;
		private String currency;
		private String PaymentMethod;
		private String recipient;
		private LocalDateTime timestamp;
		private String Description;
		
		
		public Builder() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Builder setAmount(double amt) {
			amount = amt;
			return this;
		}
		public Builder setCurrency(String cur ) {
			currency=cur;
			return this;
		}
		public Builder setPaymentMethod(String mtd) {
			 PaymentMethod=mtd;
			 return this;
		}
		public Builder setRecipient(String rcp) {
			
			recipient=rcp;
			return this;
		}

		public Builder setTimestamp(LocalDateTime ldt) {
			timestamp=ldt;
			return this;
		}
	
		public Builder setDescription(String description) {
			Description = description;
			return this;
		}
		
		public PaymentBuilder build()
		{
			return new PaymentBuilder(this);
		}
		
	}
	
	
}
