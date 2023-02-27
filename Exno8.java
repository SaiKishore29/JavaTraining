package day5;

public class Exno8 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("A");
		ThreadClass tc1=new ThreadClass(s);
		ThreadClass tc2=new ThreadClass(s);
		ThreadClass tc3=new ThreadClass(s);
		tc1.start();
		tc2.start();
		tc3.start();
	}

}
class ThreadClass extends Thread{
	StringBuffer sb=new StringBuffer();
	char ch;
	public ThreadClass(StringBuffer sb) {
		this.sb=sb;
		}
	@Override
	public void run() {
		synchronized(sb) {
			for(int i=0;i<100;i++)
				System.out.print(sb);
			sb.replace(0,1,""+(char)(sb.charAt(0)+1));
			System.out.println("");
		}
		super.run();
		}
}
