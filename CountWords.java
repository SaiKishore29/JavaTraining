package Exno7;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
			String line;
			while(scan.hasNext()) {
				line=scan.nextLine();
				String[] words=line.split("\\s+");
				count+=words.length;
			}
		System.out.println("No.of words "+count);
	}

}

