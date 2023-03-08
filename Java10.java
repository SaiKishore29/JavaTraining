package Exno7;

import java.io.File;
import java.io.IOException;

public class Java10 {
	
	
	public static void main(String[] args) throws IOException {
		FileOperation fileOperation=new FileOperation();
		File file=new File("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7/File.txt");
		file.createNewFile();
		file=fileOperation.fileRename(file);
		fileOperation.fileSize(file);
		fileOperation.fileDelete(file);
	}
}
class FileOperation{	
	File fileRename(File file) {
		File newFile = new File("/Users/saikishore/eclipse-workspace/Java_Training/src/Exno7/File.txt");
		if (file.renameTo(newFile)) {
			System.out.println("File name succesfully changed");
		} else {
			System.out.println("Rename failed");
		}
		return newFile;
	}
	void fileSize(File file) {
		System.out.println(file.length());
	}
	void fileDelete(File f) {
		try {
			while (true) {
				if (f.delete()) 
				{
					System.out.println(f.getName() + " deleted");
					return;
				} else {
					f.createNewFile();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
