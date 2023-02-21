package Day1;
import java.util.Scanner;
public class Exno16 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int a[]= {1,2,3,4,3,5,6,3};
		int count=0;
		System.out.println("Enter a number to be find: ");
		int num=scan.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				count++;
				System.out.println(num+" is present in "+(i+1));
			}
		}
		System.out.println(num+" occurs "+count+" times");

	}
}
