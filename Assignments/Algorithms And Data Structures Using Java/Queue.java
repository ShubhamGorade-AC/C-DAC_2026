import java.util.*;
public class Queue {
	int queue[] = new int[5];
	int front=-1;
	int rear=-1;
	
	public void enqueue(int a) {
		if(rear==queue.length-1) {
			System.out.println("Queue overflow");
			return;
		}
		
		if(front==-1) {
			front = 0;
		}
		
		rear++;
		queue[rear]=a;	
	}
	
	public void dequeue() {
		if(front==-1 && front>rear) {
			System.out.println("Queue underflow");
			return;
		}
		
		System.out.println("Remeoved Element is"+queue[front]);
		front++;
	}
	
	public void display(){
		if(front == -1 && front>rear) {
			System.out.println("Queue unferflow");
			return;
		}
		for(int i=front; i<=rear; i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		int choice;
		
		do {
			System.out.println("We are implementing the queue");
			System.out.println("Enter your choice");
			System.out.println("1. For enqueue");
			System.out.println("2. For dequeue");
			System.out.println("3. For Display");
			System.out.println("4. For exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : {
				System.out.println("Enter element to be add");
				int a = sc.nextInt();
				q.enqueue(a);
				break;
			}
			
			case 2: {
				q.dequeue();
				break;
			}
			
			case 3: {
				q.display();
				break;
			}
			
			case 4: {
				System.out.println("Exiting the program");
				break;
			}
			
			default: {
				System.out.println("Enter correct choice");
				break;
			}
			
			}
			
		} while(choice!=4);

	}

}
