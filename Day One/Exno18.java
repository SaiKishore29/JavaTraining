package Day1;
import java.util.Scanner;

public class Exno18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=scan.nextInt();
		scan.close();
		int i=0;
		String str=Integer.toString(num);
		int a[]=new int[str.length()];
		while(num!=0) {
			a[i]=num%10;
			num=num/10;
			i++;
		}
		for(int j=a.length-1;j>=0;j--) {
			switch(a[j]) {
			case 0: System.out.print("Zero ");
			break;
			case 1: System.out.print("One ");
			break;
			case 2: System.out.print("Two ");
			break;
			case 3: System.out.print("Three ");
			break;
			case 4: System.out.print("Four ");
			break;
			case 5: System.out.print("Five ");
			break;
			case 6: System.out.print("Six ");
			break;
			case 7: System.out.print("Seven ");
			break;
			case 8: System.out.print("Eight ");
			break;
			case 9: System.out.print("Nine ");
			break;
			default: System.out.println("Enter Numbers only");
			}
		}


	}

}
