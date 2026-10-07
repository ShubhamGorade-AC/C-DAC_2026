import java.util.*;
public class Linkedlist {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	Node head;
	int size;
	
	public void addFirst(int add) {
		Node newNode = new Node(add);
		if(head==null) {
			head = newNode;
			size++;
			return;
		}
		
		newNode.next = head;
		head = newNode; 
		size++;
	}
	
	public void addLast(int add) {
		Node newNode = new Node(add);
		if(head==null) {
			head = newNode;
			size++;
			return;
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		size++;
		
	}
	
	public void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("LinkedList is empty");
			return;
		}
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("null");
		System.out.println();
	}
	
	public void sizee() {
		System.out.println("Size"+" "+size);
	}
	
	

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.addFirst(1);
		list.addLast(2);
		list.addFirst(0);
		list.addLast(3);
		
		list.display();
		
		list.sizee();
	}

}
