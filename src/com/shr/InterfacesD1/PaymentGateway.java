package com.shr.InterfacesD1;

public class PaymentGateway {
	
	public Payment initiatePayment(Payment payment)  {
		if(payment instanceof CreditCardPayment) {
			System.out.println("Initiating Credit Card Payment");
			
		}
		else if(payment instanceof UPIPayment)
		{
			System.out.println("Initiating UPI Payment");
		}
		
		return payment;
		
	}

}
