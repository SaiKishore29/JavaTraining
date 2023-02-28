package day5;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClockDemo {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		LocalDateTime time=LocalDateTime.now();
		int hrs=(int)time.getHour();
		int min=(int)time.getMinute();
		int sec=(int)time.getSecond();
		DigitalClock digitalClock=new DigitalClock(hrs,min,sec);
		executorService.execute(()->{
			while(true) {
				digitalClock.printSec();
				//digitalClock.printMin();
				//digitalClock.printHrs();
			}
		});
		executorService.execute(()->{
			while(true)
				digitalClock.printMin();
		});
		executorService.execute(()->{
			while(true)
				digitalClock.printHrs();
		});
	}

}
class DigitalClock{
	int hour,mintue,second;
	public DigitalClock(int h,int m,int s) {
		this.hour=h;
		this.mintue=m;
		this.second=s;
	}
	synchronized void printHrs() {
		if(mintue==59)
        {
            mintue=0;
            second=0;
            if(hour==23)
                hour=0;
            else
                hour++;
            notifyAll();
        }
        else
        {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
	synchronized void printMin() {
		 if(mintue<59 && second==60)
	        {
	            second=0;
	            mintue++;
	            notifyAll();
	        }
	        else
	        {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	}
	synchronized void printSec() {
		int i;
		if(second<60) {
		for(i=second;i<60;i++) {
			System.out.println(hour+":"+mintue+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		second=i;
		notifyAll();
		}
		
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
