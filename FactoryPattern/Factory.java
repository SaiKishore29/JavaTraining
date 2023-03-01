package FactoryPattern;

import java.util.Scanner;

public class Factory{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter which type of shoe you need:");
		String shoeType=scan.next();
		ShoeFactory factory= new ShoeFactory(shoeType);
		Shoe shoe=factory.makeShoe();
		shoe.ShoeName();
	}

}