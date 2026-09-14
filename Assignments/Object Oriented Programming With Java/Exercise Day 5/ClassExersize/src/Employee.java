import java.util.Scanner;

public class Employee {
	int name;
	int id;
	String adress;
	
	public void accept(int n, int i, String a) {
		name = n;
		id = i;
		adress = a;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(adress);	
	}
	
	
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			
			int a;
			int b; 
			String c;
			
			System.out.println("Enter employee details");
			a = sc.nextInt();
			b = sc.nextInt();
			sc.nextLine();
			c = sc.nextLine();
			
			e1.accept(a,b,c);
			e1.display();
			e2.accept(a,b,c);
			e2.display();
			e3.accept(a,b,c);
			e3.display();
			
			}
		
		
		}
}
