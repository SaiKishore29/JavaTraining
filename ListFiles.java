package Exno7;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		File dirname = new File("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7");
		if (dirname.isDirectory()) {
			String string[] = dirname.list();
			for (int i = 0; i < string.length; i++) {
				System.out.println(string[i]);
			}
		}
	}

}
