package StrategyPattern;

class UPI implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println("Payment using UPI");
	}
	
}