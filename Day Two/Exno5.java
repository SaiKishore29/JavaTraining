package day2;

public class Exno5 {

	public static void main(String[] args) {
		UserDefined ud1=new UserDefined();
		UserDefined ud2=new UserDefined();
		UserDefined ud3=new UserDefined();
		UserDefined ud4=new UserDefined();
		UserDefined ud5=new UserDefined();
		System.out.println(UserDefined.n);

	}

}
class UserDefined{
	static int n=0;
	UserDefined(){
		n++;
	}
}
