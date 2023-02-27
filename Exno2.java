package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno2 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		PrintMessage pm=new PrintMessage();
		es.execute(()->{
			pm.print("[------");
		});
		es.execute(()->{
			pm.print("Message");
		});
		es.execute(()->{
			pm.print("------]");
		});
		es.shutdown();
	}

}
class PrintMessage{
	
	synchronized void print(String msg) {
		System.out.print(msg);
	}
	
}
