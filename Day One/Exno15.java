package Day1;
import java.util.Scanner;
public class Exno15 {

	public static void main(String[] args) {
		PrimeNum pm=new PrimeNum();
		pm.findPrime();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=scan.nextInt();
		scan.close();
		CheckNum cn=new CheckNum();
		cn.checkNum(num);

	}

}
 class PrimeNum{
	 void findPrime() {
		 int f=1;
		 System.out.println("Prime Numbers 1-100");
		 System.out.println("1\n2");
		 for(int i=3;i<=100;i++) {
			 f=1;
			 for(int j=2;j<=i/2;j++) {
				 if(i%j==0) {
					 f=0;
					 break;
				 }
			 }
			 if(f==1)
				 System.out.println(i);
		 }
	 }
 }
 class CheckNum{
	 void checkNum(int n) {
		 if(armstrong(n)) {
			 System.out.println("It is Armstrong Number");
		 }
		 if(palindrome(n)) {
			 System.out.println("It is Palindrome Number");
		 }
		 if(perfect(n)) {
			 System.out.println("It is Perfect Number");
		 }
		 if(!(armstrong(n))&&!(palindrome(n))&&!(perfect(n))) {
			 System.out.println("None of these");
		 }
		 
	 }
	 static boolean armstrong(int n) {
		 int n1 = n;  
		  String str = Integer.toString(n);  
		  int rem;  
		  int result = 0;  
		  while (n > 0) {  
		   rem = n % 10;  
		   n = n / 10;  
		   result = result + ((int) Math.pow(rem, str.length()));  
		  }  
		  if (result == n1) {  
		   return true;  
		  } 
		  else {  
		   return false; 
		   }
	 }
	 static boolean palindrome(int n) {
		 int n1 = n;  
		  int rem;  
		  int result = 0;  
		  while (n > 0) {  
		   rem = n % 10;  
		   n = n / 10;  
		   result = (result + rem) * 10;  
		  }  
		  result /= 10;  
		  if (result == n1) {  
		   return true;  
		  } else {  
		   return false;  
		  } 
	 }
	 static boolean perfect(int n) {
		 int sum=0;
		 for(int i=1;i<=n/2;i++) {
			 if(n%i==0)
				 sum+=i;
		 }
		 if(sum==n)
			 return true;
		 else
			 return false;
	 }
 }