package Day1;
import java.util.*;
public class Exno5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		Avg a=new Avg();
		a.findAvg(arr);

	}

}
class Avg{
	public void findAvg(int a[]) {
		int s=0,avg;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
			
		}
		avg=s/5;
		System.out.println("Average="+avg);
		
	}
}
