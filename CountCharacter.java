package Exno7;

import java.util.Scanner;

public class CountCharacter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=0;
		System.out.println("Enter Characters:");
		while (scan.hasNext()) {
	           String line = scan.nextLine();
	           char[] character = line.toCharArray();
	           count+=character.length;
	        }
			System.out.println("The total count ="+count);
	}

}


