package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEvenOdd {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);//creating 2 threads
		es.execute(()->{
			printEven();
			printOdd();
		});
		es.shutdown();
	}
	static void printEven() {
		System.out.println("Even Number");
		System.out.println(Thread.currentThread().getName());
		for(int i=2;i<=100;i+=2)
			System.out.println(i);
	}
	static void printOdd() {
		System.out.println("Odd Number");
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=100;i+=2)
			System.out.println(i);
	}

}

