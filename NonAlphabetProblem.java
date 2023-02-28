package day5;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonAlphabetProblem {

	public static void main(String[] args) {
		ExecutorService executionService=Executors.newFixedThreadPool(1);//creating 1 thread
		CharacterCount characterCount=new CharacterCount();
		executionService.execute(()->{
			while(true)
			characterCount.getChar();
		});
		executionService.shutdown();
	}

}
class CharacterCount{
	char c;
	int count=0;
	void getChar() {
		System.out.println("Enter a Character: ");
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		try {
		if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z'))) {
			throw new NonAlphabeticChar("Enter Only Alphabets");
		}else {
			count++;
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Total Characters: "+count);
			System.exit(0);
		}
	}
}
class NonAlphabeticChar extends Exception{
	public NonAlphabeticChar(String s) {
		super(s);
		}
	
}
