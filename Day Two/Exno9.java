package day2;

public class Exno9 {
	public static void main(String[] args) {
		A obj=new B();
		obj.method();
		
		
	}

}
abstract class A{
	public int a=2;
	private int b=5;
	protected int c=10;
	abstract void method();
	
}
class B extends A{
	void method() {
		System.out.println(a);
		System.out.println(b);//Private can't be accessed
		System.out.println(c);
	}
	
	
	
}