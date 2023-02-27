package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno1 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		PrintNum pn=new PrintNum();
		es.execute(()->{
			pn.printEven();
		});
		es.execute(()->{
			pn.printOdd();
		});
		es.shutdown();
	}

}
class PrintNum{
	synchronized void printEven() {
		System.out.println("Even Number");
		for(int i=2;i<=100;i+=2)
			System.out.println(i);
	}
	synchronized void printOdd() {
		System.out.println("Odd Number");
		for(int i=1;i<=100;i+=2)
			System.out.println(i);
	}
}

