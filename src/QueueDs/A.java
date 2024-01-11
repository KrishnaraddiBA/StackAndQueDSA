package QueueDs;

import java.util.Scanner;

class Queue{
	int n=10;
	int []a=new int[n];
	int f=-1;
	int r=-1;
	
	public void enque(Scanner scan) {
		if (r==(n-1)) {
			System.out.println("It false under overflow condition");
		}
		else if (f==-1&&r==-1) {
			System.out.println("Enter the data");
			int data=scan.nextInt();
			f=0;
			r=0;
			a[r]=data;
		}
		else {
			System.out.println("Enter the data");
			int data=scan.nextInt();
			r=r+1;
			a[r]=data;
			System.out.println("Item added sucessfully");
		}
	}
	
	public void deque(Scanner scan) {
		if (f==-1&&r==-1) {
			System.out.println("It falls under underflow condition");
		}
		else {
			f=f+1;
			System.out.println("Item deleted sucessfully!!");
		}
	}
	
	public void traverse() {
		if (f==-1||r==-1) {
			System.out.println("There is no elements in the Queue!!!");
		}
		else {
			for (int i = f; i <=r ; i++) {
				System.out.println(a[i]);
			}
		}
	}
}
public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		Queue queue=new Queue();
		boolean flag=true;
		while (flag) {
			System.out.println("Hit 1 to enque");
			System.out.println("Hit 2 to deque");
			System.out.println("Hit 3 to display elements");
			System.out.println("Hit other keys to terminate");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				queue.enque(scan);
				
				break;
			case 2:
				queue.deque(scan);
				break;
			case 3:
				queue.traverse();
				break;

			default:
				System.out.println("Hog ba");
				flag=false;
				break;
			}
		}
		
	}

}
