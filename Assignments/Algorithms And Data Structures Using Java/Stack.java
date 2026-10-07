import java.util.*;
public class Stack {
	int stack[] = new int[5];
	int top = -1;
	
	public void push(int ele) {
		if(top==stack.length-1){
			System.out.println("Stack Overflow");
			return;
		}
		
		top++;
		stack[top]=ele;
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		
		System.out.println("Removed Element is"+stack[top]);
		top--;
	}
	
	public void peek() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Peek Element is"+stack[top]);
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		
		for(int i=top; i>=0; i--) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
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
