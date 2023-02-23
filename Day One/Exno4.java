package Day1;
import java.util.*;
public class Exno4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PrimeNumber pm=new PrimeNumber();
		System.out.println("Enter a Number: ");
		int num=scan.nextInt();
		scan.close();
		pm.findPrime(num);
	}

}
class PrimeNumber{
	public void findPrime(int n) {
		int f=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				f=0;
				break;
			}
		}
		
		String s=(f==1)? "It is a Prime":"It is not a Prime";
		System.out.println(s);
		
		
	}
	
}
