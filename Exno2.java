package day4;

public class Exno2 {
	public void mth1() {
		mth2();
		System.out.println("Caller");
	}
	public void mth2() {
		try {
			int a=1/0;
			return;
			
			
		}catch(Exception e) {
			System.out.println("catch-mth2");}
		finally{
			System.out.println("Finally-mth2");}
		}

	public static void main(String[] args) {
		Exno2 s=new Exno2();
		s.mth1();

	}

}
