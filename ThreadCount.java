package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCount {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		Count count=new Count();
		executorService.execute(()->{
			count.countNumber();
		});
		executorService.shutdown();
	}

}
class Count{
	synchronized void countNumber() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%10==0) {
				System.out.println("Hello");
				}
			}
		}
}