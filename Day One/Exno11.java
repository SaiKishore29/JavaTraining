package Day1;

public class Exno11 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int a=0;
			for(int i=0;i<4;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(arr[a]+" ");
					a++;
				}
				System.out.println("");
			}
	}
}
