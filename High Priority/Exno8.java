package day2;

public class Exno8 {

	public static void main(String[] args) {
		Singleton obj1=Singleton.newInstance();
		System.out.println(obj1);
		Singleton obj2=Singleton.newInstance();
		System.out.println(obj2);
		Singleton obj3=Singleton.newInstance();
		System.out.println(obj3);

	}

}
class Singleton{
	static Singleton obj=null;
	static Singleton newInstance() {
		if(obj==null)
			obj=new Singleton();
		return obj;
	}
	
}
