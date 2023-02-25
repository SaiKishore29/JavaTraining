package day2;

public class Exno1 {

	public static void main(String[] args) {
		int a=10;
		System.out.println("Before passing variable "+a);
		PassByValue pbv=new PassByValue();
		pbv.passVariable(a);
		System.out.println("After passing variable "+a);
		int arr[]= {1,2,3,4,5};
		System.out.println("Before Passing array");
		printArray(arr);
		PassByReference pbr=new PassByReference();
		pbr.passArray(arr);
		System.out.println("\nAfter Passing array");
		printArray(arr);
		System.out.println("\nBefore Passing Object:"+pbv.s);
		pbr.passObject(pbv);
		System.out.println("After Passing Object:"+pbv.s);

	}
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
class PassByValue{
	int s=10;
	void passVariable(int n) {
		n=15;
	}
}
class PassByReference{
	void passArray(int[] a) {
		a[3]=11;
	}
	void passObject(PassByValue obj) {
		obj.s=5;
	}
	
}
