package Exno7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyContent {
	public static void main(String[] args) throws IOException {
		FileReader reader =new FileReader("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7/Source.txt");
		FileWriter writer =new FileWriter("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7/Destination.txt");
		try{
			int a;
			while((a=reader.read())!=-1) {
				writer.write(a);
			}
			System.out.println("file copied");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			writer.close();
			reader.close();
		}
	}

}
