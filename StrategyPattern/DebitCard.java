package StrategyPattern;

class DebitCard implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println("Payment using Debit card");
	}
	
}

