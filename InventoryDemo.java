package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryDemo {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(2);//creating 2 thread
		Inventory inventory=new Inventory();
		executorService.execute(()->{
			//Thread.currentThread().setName("Producer");//one is producer
			for(int i=0;i<3;i++) {
				inventory.produce();
			inventory.consume();}
		});
		//es.execute(()->{
		//	Thread.currentThread().setName("Consumer");//one is consumer
			//for(int i=0;i<3;i++)
				//inv.consume();
		//});
		executorService.shutdown();

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