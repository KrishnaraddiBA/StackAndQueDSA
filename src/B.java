//Stack implementation by using singly Linked list

import java.util.Scanner;

class Stack1{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node top=null;
	public void push() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data");
		int data=scan.nextInt();
		Node newnode=new Node(data);
//in the linked list there might not arise an overflow condition
		if (top==null) {
			top=newnode;
			newnode.next=null;
		}
		else {
			newnode.next=top;
			top=newnode;
		}
		System.out.println("Element pushed sucessfully!!!");
	}
	public void pop() {
		if (top==null) {
			System.out.println("It falls under underflow condition!!!");
		}
		else {
			top=top.next;
			System.out.println("Element deleted sucessfully!!!");
		}
	}
	
	public void displayElements() {
		if (top==null) {
			System.out.println("There is no elements present in the stack!!");
		}
		else {
			Node temp=top;
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
}

public class B {
	public static void main(String[] args) {
		
		boolean flag=true;
		Scanner scan=new Scanner(System.in);
	Stack1 stack=new Stack1();
		while (flag) {
			System.out.println("Hit 1 to push the elements");
			System.out.println("Hit 2 to pop the elements");
			System.out.println("Hit 3 to display elements");
			System.out.println("Hit any other keys to terminate or go out");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				stack.push();
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.displayElements();
				break;

			default:
				System.out.println("Hog ba");
				flag=false;
				break;
			}
		}
		
	}

}
