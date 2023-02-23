package Day1;

public class Exno23 {

	public static void main(String[] args) {
		AnotherClass obj=new AnotherClass();
		int sum=obj.a+obj.b;
		System.out.println(sum);

	}

}
class AnotherClass{
	protected int a=5;
	protected int b=10;
}
