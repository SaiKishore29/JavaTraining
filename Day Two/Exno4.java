package day2;

public class Exno4 {

	public static void main(String[] args) {
		Stack stack=new Stack();
		int ele;
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.display();
		ele=stack.pop();
		System.out.println("\n"+ele+" is removed");
		ele=stack.pop();
		System.out.println("\n"+ele+" is removed");
		ele=stack.pop();
		System.out.println("\n"+ele+" is removed");
		ele=stack.pop();
		System.out.println("\n"+ele+" is removed");
		ele=stack.pop();
		System.out.println("\n"+ele+" is removed");
		stack.display(); 
		stack.pop();
	}

}

class Stack{
	int[] a=new int[5];
	int top=0;
	void push(int n) {
		if(top==5) {
			System.out.println("Stack Overflow");
			top=4;
		}
		else {
		a[top]=n;
		top++;
		}
	}
	int pop() {
		int n=0;
		if(top==-1)
			System.out.println("\nStack Underflow");
		else if(top==5)
			top=4;
		else {
		n=a[top];
		top--;
		}
		return n;
	}
	void display() {
		System.out.println("");
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+" ");
		}
	}
}