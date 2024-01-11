package QueueDs;

import java.util.Scanner;

//this is a queue datastructure using Linked list
class Queue1{
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node front=null;
	Node rear=null;
	public void enque(Scanner scan) {
		System.out.println("Enter the data");
		int data=scan.nextInt();
		
		Node newnode=new Node(data);
		if (front==null&&rear==null) {
			front=newnode;
			rear=newnode;
		}
		else {
			rear.next=newnode;
			rear=newnode;
		}
	}
	public void deque() {
		if (front==null) {
			System.out.println("There is no elements in the queue to delete");
		}
		else {
			front=front.next;
			System.out.println("Item deleted successfully!!");
		}
	}
	public void display() {

		if (front==null&&rear==null) {
			System.out.println("There is no elements in the queue to display");
		}
		else {
			Node temp1=front;
			while (temp1!=null) {
				System.out.println(temp1.data);
				temp1=temp1.next;
			}
		}
	}
}
public class B {
	public static void main(String[] args) {
		boolean flag=true;
	
		Queue1 queue=new Queue1();
		Scanner scan=new Scanner(System.in);
		while (flag) {
			System.out.println("Press 1 to enque an element");
			System.out.println("Press 2 to deque an element");
			System.out.println("Press 3 to traverse an element");
			System.out.println("Press other keys to exit or terminate");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				queue.enque(scan);
				break;
			case 2:
				queue.deque();
				break;
			case 3:
				queue.display();
				break;
			default:
				System.out.println("Hog ba");
				flag=false;
				break;
			}
		}
	}
}
