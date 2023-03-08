package Exno7;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintFileContent {
	public static void main(String[] args) {
		try{
			BufferedReader reader=new BufferedReader(new FileReader("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7/Sample.txt"));
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
