package day3;

public class Exno4 {

	public static void main(String[] args) {
		ImplementingClass imp=new ImplementingClass();
		imp.method1();
		imp.method2();
		imp.method3();
		imp.method4();
		imp.method5();
		imp.method6();
		imp.newMethod();

	}

}
interface interface1{
	void method1();
	void method2();
}
interface interface2{
	void method3();
	void method4();
}
interface interface3{
	void method5();
	void method6();
}
interface interface4 extends interface1,interface2,interface3{
	void newMethod();
	
}
class ImplementingClass implements interface4{

	@Override
	public void method1() {
		System.out.println("Method 1 is called");		
	}

	@Override
	public void method2() {
		System.out.println("Method 2 is called");
	}


	@Override
	public void method3() {
		System.out.println("Method 3 is called");
	}

	@Override
	public void method4() {
		System.out.println("Method 4 is called");
	}

	@Override
	public void method5() {
		System.out.println("Method 5 is called");
	}

	@Override
	public void method6() {
		System.out.println("Method 6 is called");
	}
	
	@Override
	public void newMethod() {
		System.out.println("New Method is called");
	}
	
}