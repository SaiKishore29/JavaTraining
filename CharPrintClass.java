package day5;

public class CharPrintClass {

	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("A");
		ThreadClass threadClass1=new ThreadClass(stringBuffer);
		ThreadClass threadClass2=new ThreadClass(stringBuffer);
		ThreadClass threadClass3=new ThreadClass(stringBuffer);
		threadClass1.start();
		threadClass2.start();
		threadClass3.start();
	}

}
class ThreadClass extends Thread{
	StringBuffer stringBuffer=new StringBuffer();
	char character;
	public ThreadClass(StringBuffer sb) {
		this.stringBuffer=sb;
		}
	@Override
	public void run() {
		synchronized(stringBuffer) {
			for(int i=0;i<100;i++)
				System.out.print(stringBuffer);
			stringBuffer.replace(0,1,""+(char)(stringBuffer.charAt(0)+1));
			System.out.println("");
		}
		}
}
