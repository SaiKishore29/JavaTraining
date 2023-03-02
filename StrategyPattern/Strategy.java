package StrategyPattern;

import java.util.Scanner;

public class Strategy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Payment payment=new Payment();
		payment.payMethod=new DebitCard();
		payment.payUsing();
		
	}
}
	



