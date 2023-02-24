package day4;

public class Exno3 {
	public void mth1() {
		mth2();
		System.out.println("Caller");
	}
	public void mth2() {
		try {
			int a=1/0;
			System.exit(0);
		}catch(Exception e) {
			System.out.println("catch-mth2");}
		finally{
			System.out.println("Finally-mth2");}
		}

	public static void main(String[] args) {
		Exno3 s=new Exno3();
		s.mth1();

	}

}
