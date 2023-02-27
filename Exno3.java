package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno3 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Inventory inv=new Inventory();
		es.execute(()->{
			Thread.currentThread().setName("Producer");
			for(int i=0;i<3;i++)
				inv.produce();
		});
		es.execute(()->{
			Thread.currentThread().setName("Consumer");
			for(int i=0;i<3;i++)
				inv.consume();
		});
		es.shutdown();

	}

}
class Inventory{
	int product=0;
	synchronized void produce() {
		if(product==1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Produced Product");
		product=1;
		System.out.println("Inventory Product: "+product);
		notify();
	}
	synchronized void consume() {
		if(product==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed Product");
		product=0;
		System.out.println("Inventory Product: "+product);
		
		notify();
		
	}
}