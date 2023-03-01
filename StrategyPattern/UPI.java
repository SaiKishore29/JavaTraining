package StrategyPattern;

class UPI extends PaymentMethod{

	@Override
	void pay() {
		System.out.println("Payment using UPI");
	}
	
}