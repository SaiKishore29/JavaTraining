package StrategyPattern;

class DebitCard extends PaymentMethod{

	@Override
	void pay() {
		System.out.println("Payment using Debit card");
	}
	
}

