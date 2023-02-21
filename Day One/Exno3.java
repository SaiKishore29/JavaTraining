package Day1;

public class Exno3 {
	public static void main(String args[]) {
		int a=5;
		char b=70;
		boolean c=true;
		System.out.println("Initialization");
		System.out.println("Interger: "+a);
		System.out.println("Char: " +b);
		System.out.println("Boolean: "+c);
		byte d=(byte)a;
		long e=(long)a;
		double f=(double)b;
		System.out.println("Explicit type casting");
		System.out.println("Converting int to byte: "+d);
		System.out.println("Converting int to long: "+e);
		System.out.println("Converting char to double: "+f);
		short g=d;
		float h=a;
		System.out.println("Implicit type casting");
		System.out.println("Converting byte to short"+g);
		System.out.println("Converting int to float"+h);
		
	}

}