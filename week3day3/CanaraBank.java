package week3day3;

public abstract class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() 
	{
	System.out.println("Cash on delivery");		
	}

	@Override
	public void upiPayments() {
		
		System.out.println("UPI payents");	
	}

	@Override
	public void cardPayments() {
		System.out.println("card Payments");	
	}

	@Override
	public void internetBanking() {
		System.out.println("InternetBanking");	
	}
	
	public void recordPaymentDetails() {
		System.out.println("Payment details Recorded");	
	}

}
