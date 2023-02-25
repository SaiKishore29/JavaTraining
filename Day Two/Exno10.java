package day2;

public class Exno10 {

	public static void main(String[] args) {
		Cclass cobj=new Cclass();

	}

}
class Aclass{
	Aclass(){
		System.out.println("Constructor of class A");
	}
	
}
class Bclass{
	Bclass(){
		System.out.println("Constructor of class B");
	}
	
}
class Cclass extends Aclass{
	Bclass bobj=new Bclass();
}
