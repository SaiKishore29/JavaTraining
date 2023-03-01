package SingletonPattern;

public class Singleton {

	public static void main(String[] args) {
		SingletonClass obj=SingletonClass.getInstance();
		System.out.println(obj);
		SingletonClass obj1=SingletonClass.getInstance();
		System.out.println(obj1);
		SingletonClass obj2=SingletonClass.getInstance();
		System.out.println(obj2);
		//SingletonClass obj3=new SingletonClass();

	}

}

