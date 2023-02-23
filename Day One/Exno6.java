package Day1;

import java.util.Arrays;

public class Exno6 {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Existing Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//Resizing
		int ReArr[]=Arrays.copyOf(arr, 10);
		System.out.println("\nResized array");
		for(int i=0;i<ReArr.length;i++) {
			System.out.print(ReArr[i]+" ");
		}
		
	}

}
