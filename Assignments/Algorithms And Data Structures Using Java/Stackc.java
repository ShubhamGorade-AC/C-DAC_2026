import java.util.Stack;
import java.util.*;
public class Stackc {
	
	Stack stack = new Stack();
	
	public void push(int a){
		stack.push(a);
	}
	
	public void pop(){
		stack.pop();
	}
	
	public void peek() {
		System.out.println(stack.peek());
	}
	
	public void display() {
		System.out.println(stack);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stackc st = new Stackc();
		
		int choice;
		
		do {
			System.out.println("We are implementing the stack");
			System.out.println("Enter your choice");
			System.out.println("1. For push");
			System.out.println("2. For pop");
			System.out.println("3. For peek");
			System.out.println("4. For display");
			System.out.println("5. For exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				System.out.println("Enter element to be add");
				int ele = sc.nextInt();
				st.push(ele);
				break;
			}
			
			case 2: {
				st.pop();
				break;
			}
			
			case 3: {
				st.peek();
				break;
			}
			
			case 4: {
				st.display();
				break;
			}
			
			case 5: {
				System.out.println("Exiting the program");
				break;
			}
			
			default: {
				System.out.println("Enter correct choice");
				break;
			}
			
			}
			
		}while(choice!=5);

	}

}
