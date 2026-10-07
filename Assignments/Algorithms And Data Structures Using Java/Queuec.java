import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Queuec {
	Queue<Integer> queue = new LinkedList<>();
	
	public void enqueue(int a) {
		queue.offer(a);
	}
	
	public void dqueue() {
		if(queue.isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		queue.poll();
	}
	
	public void peek() {
		if(queue.isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.println(queue.peek());
	}
	
	public void display() {
		if(queue.isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.println(queue);
		
	}
	
	public void size() {
		System.out.println(queue.size());
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queuec q = new Queuec();
		int choice;
		
		do {
			System.out.println("We are implementing the queue");
			System.out.println("Enter your choice");
			System.out.println("1. For enqueue");
			System.out.println("2. For dequeue");
			System.out.println("3. For Display");
			System.out.println("4. For Peek");
			System.out.println("5. For Size");
			System.out.println("6. For exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : {
				System.out.println("Enter element to be add");
				int a = sc.nextInt();
				q.enqueue(a);
				break;
			}
			
			case 2: {
				q.dqueue();
				break;
			}
			
			case 3: {
				q.display();
				break;
			}
			case 4: {
				q.peek();
				break;
			}
			
			case 5 : {
				q.size();
				break;
			}
			
			case 6: {
				System.out.println("Exiting the program");
				break;
			}
			
			default: {
				System.out.println("Enter correct choice");
				break;
			}
			
			}
			
		} while(choice!=6);

	}

}
