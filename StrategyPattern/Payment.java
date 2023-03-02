package StrategyPattern;

class Payment{
	PaymentMethod payMethod;
	void payUsing() {
		payMethod.pay();
	}
}
