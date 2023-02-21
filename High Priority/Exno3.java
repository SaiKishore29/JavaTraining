package day3;
import java.util.*;
public class Exno3 {

	public static void main(String[] args) {
		FixedStack fs=new FixedStack();
		int ele;
		System.out.println("Fixed Stack");
		fs.display();
		fs.push(1);// 1 is pushed
		fs.push(2);// 2 is pushed
		fs.display();// displays 1 2
		fs.push(3);// 3 is pushed
		fs.push(4);// 4 is pushed
		fs.display();// displays 1 2 3 4
		fs.push(5);// 5 is pushed
		fs.display();// displays 1 2 3 4 5
		fs.push(6);// stack overflow
		fs.display();// displays 1 2 3 4 5
		ele=fs.pop();//5 is removed
		System.out.println("\n"+ele+" is Removed");
		fs.display();//displays 1 2 3 4
		ele=fs.pop();//4 is removed
		System.out.println("\n"+ele+" is Removed");
		fs.display();//displays 1 2 3
		ele=fs.pop();//3 is removed
		System.out.println("\n"+ele+" is Removed");
		fs.display();//displays 1 2
		ele=fs.pop();//2 is removed
		System.out.println("\n"+ele+" is Removed");
		fs.display();//displays 1
		ele=fs.pop();// 1 is removed
		System.out.println("\n"+ele+" is Removed");
		fs.display();// stack is empty
		DynamicStack ds=new DynamicStack();
		System.out.println("Dynamic Stack");
		ds.push(5);//5 is pushed
		ds.push(4);//4 is pushed
		ds.push(3);//3 is pushed
		ds.push(2);//2 is pushed
		ds.push(1);//1 is pushed
		ele=ds.pop();//1 is removed
		System.out.println("\n"+ele+" is Removed");
		ds.display();
		

	}

}
interface stack{
	void push(int n);
	int pop();
}
class FixedStack implements stack{
	int[] a=new int[5];
	int size=5;
	int top=-1;
	@Override
	public void push(int n) {
		if(top==4) {
			System.out.println("\nStack Overflow");
		}
		else {
			top++;
			a[top]=n;
		}
		
	}

	@Override
	public int pop() {
		int v=0;
		if(top==0) {
			System.out.println("\nStack Underflow");
		}
		if(top==5) {
			top=4;
		}
		else {
		v=a[top];
		a[top]=0;
		top--;
		}
		return v;
	}
	public void display() {
		System.out.println("");
		if(top==5)
			top=4;
		if(top==-1)
			System.out.println("Stack is empty");
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}
class DynamicStack implements stack{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	
	@Override
	public void push(int n) {
		arr.add(n);
	}

	@Override
	public int pop() {
		int v=arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return v;
	}
	public void display() {
		System.out.println(arr);
	}
	
}