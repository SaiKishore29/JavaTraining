package Day1;
import java.util.Scanner;
public class Exno24 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value for a,b and c");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println("Enter value for x: ");
		int x=scan.nextInt();
		Quadratic q=new Quadratic(a,b,c);
		int res=q.compute(x);
		System.out.println("Result="+res);
		

	}

}
class Quadratic{
	int a,b,c;
	Quadratic(){
		this.a=1;
		this.b=1;
		this.c=1;
	}
	Quadratic(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int compute(int x) {
		int f=a*x*x+b*x+c;
		return f;
	}
}