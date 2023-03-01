package StrategyPattern;

import java.util.Scanner;

public class Strategy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Payment payment=new Payment();
		//System.out.println("Choose Your Payment option:");
		//String paymentOption=scan.next();
		//Pay pay=new Pay(paymentOption);
		//if(paymentOption.equals("UPI"))
			payment.payMethod=new DebitCard();
		//else if(paymentOption.equals("Debitcard"))
		//	payment.payMethod=new DebitCard();
		
		payment.payUsing();
		
	}
}
	



