package Day1;
import java.util.*;
public class Exno8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6};
		int f=0;
		System.out.println("Enter a number: ");
		int find=scan.nextInt();
		scan.close();
		for(int i=0;i<5;i++) {
			if(arr[i]==find)
			{
				System.out.println("Element found at "+(i+1));
				f=1;
			}
		}
		if(f==0) {
			System.out.println("Element not found");
		}
		
	}

}
