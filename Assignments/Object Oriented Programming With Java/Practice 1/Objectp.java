import java.util.Scanner;
public class Objectp {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int roll = sc.nextInt();
	int age = sc.nextInt();
	
	Classp obj = new Classp(roll,age);
	
	obj.display();
}
}
