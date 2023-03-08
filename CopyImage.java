package Exno7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImage {
	public static void main(String[] args) throws IOException {
		try(InputStream in=new FileInputStream("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7/kholi.jpeg");
			OutputStream out=new FileOutputStream("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7/dhoni.jpeg")){
			byte[] buffer=new byte[1024];
			int bytesRead;
			while((bytesRead=in.read(buffer))!=-1) {
				out.write(buffer,0,bytesRead);
				
			}
			System.out.println("Image copied");
		}catch(Exception e) {
			e.printStackTrace();	
			
		}
	}

}
