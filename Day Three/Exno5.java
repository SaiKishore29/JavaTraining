package day3;

import newPackage.createInterface;

public class Exno5 implements createInterface{

	public static void main(String[] args) {
		Exno5 obj=new Exno5();
		obj.method1();
		obj.method2();
		obj.method3();
	}

	@Override
	public void method1() {
		System.out.println("Method 1 is called....");
		
	}

	@Override
	public void method2() {
		System.out.println("Method 2 is called.....");
		
		
	}

	@Override
	public void method3() {
		System.out.println("Mehtod 3 is called....");
		
	}

}
