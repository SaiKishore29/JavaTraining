package day2;

public class Exno11 {

	public static void main(String[] args) {
		C_class cobj=new C_class(5);

	}

}
class A_class{
	A_class(int a){
		System.out.println("Constructor of class A "+a);
	}
	
}
class B_class{
	B_class(int a){
		System.out.println("Constructor of class B "+a);
	}
	
}
class C_class extends A_class{
	C_class(int a) {
		super(a);
		B_class bobj=new B_class(a+5);
		
	}

	
}
