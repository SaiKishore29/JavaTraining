package day4;
import java.util.Scanner;
public class Exno7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Quit q=new Quit();
		Division div=new Division();
		String n,d;
		int num,den;
		while(true) {
			System.out.println("Enter two number:");
			n=scan.next();
			q.check(n);
			d=scan.next();
			q.check(d);
			num=Integer.parseInt(n);
			den=Integer.parseInt(d);
			div.divide(num,den);
			}
			
		}

	}
class Quit{
	void check(String str) {
		if(str.equals("q")||str.equals("Q"))
			System.exit(0);
		
	}
}
class Division{
	void divide(int num,int den) {
		int res;
		try {
			res=num/den;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
