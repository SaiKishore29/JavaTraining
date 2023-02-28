package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMessage {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(3);//creating 3 threads
		PrintMessage printMessage=new PrintMessage();
		executorService.execute(()->{
			printMessage.print("Hello");
			printMessage.print("Message");
			printMessage.print("World");
		});
		//executorService.execute(()->{
		//	pm.print("hai");
		//});
		executorService.shutdown();
	}

}
class PrintMessage{
	
	synchronized void print(String msg) {
		//System.out.println(Thread.currentThread().getName());
		System.out.println("[-----"+msg+"-----]");
	}
	
}
