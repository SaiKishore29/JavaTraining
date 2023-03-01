package VisitorPattern;

import java.util.Scanner;

public class Visitor {

	public static void main(String[] args) {
		People chennaiPeople= new People();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter......");
		String Case=scan.nextLine();
		City chennai=new City();
		chennaiPeople.fileCase(chennai, Case);
	}
}