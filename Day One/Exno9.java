package Day1;

public class Exno9 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int temp;
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[4-i];
			a[4-i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
