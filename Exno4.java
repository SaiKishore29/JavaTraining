package day5;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno4 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		DigitalClock dc=new DigitalClock();
		es.execute(()->{
			dc.hours();
		});
		es.execute(()->{
			dc.min();
		});
		es.execute(()->{
			dc.sec();
		});
		es.shutdown();

	}

}
class DigitalClock{
	int h,m,s;
	
	void hours() {
		while(true) {
			Date d=new Date();
			h=d.getHours();
		}
	}
	void min() {
		while(true) {
			Date d=new Date();
			m=d.getMinutes();
		}
		
	}
	void sec() {
		while(true) {
			Date d=new Date();
			s=d.getSeconds();
			System.out.println(h+" : "+m+" : "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
