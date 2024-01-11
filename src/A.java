import java.util.Scanner;

class Stack{
	//first by using arrays
	static Scanner scan=new Scanner(System.in);
	int n=10;
	int []a=new int[n];
	int top=-1;
	
	public void push() {
		
		//to push the element we have to check weather it is overflow in nature
		if (top==(n-1)) {
			System.out.println("It is under overflow condition!!!");
		}
		else {
			System.out.println("Enter the data to add in the stack element");
			int data=scan.nextInt();
			top=top+1;
			a[top]=data;
			System.out.println("Elements pushed sucessfully!!1");
		}
	}
	public void pop() {
		if (top==-1) {
			System.out.println("It is a condition of underflow condition!!!");
		}
		else {
			top=top-1;
			System.out.println("Item popped sucessfully!!!");
		}
	}
	public void display() {
		if (top==-1) {
			System.out.println("There are no elements in the stack");
		}
		else {
			for (int i = top; i >=0 ; i--) {
				System.out.println(a[i]);
			}
		}
	}
	
}
public class A {
public static void main(String[] args) {
	boolean flag=true;
	Stack stack=new Stack();
	Scanner scan=new Scanner(System.in);
	while(flag) {
		System.out.println("Hit 1 to push the element into stack");
		System.out.println("Hit 2 to delete the  element from the stack");
		System.out.println("Hit 3 to display elements from the stack");
		int key=scan.nextInt();
		switch (key) {
		case 1:
			stack.push();
			break;
		case 2:
			stack.pop();
			break;
		case 3:
			stack.display();
			break;

		default:
			System.out.println("Hog ba");
			flag=false;
			break;
		}
		
	}
}
}
