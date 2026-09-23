public class Aderived extends Abase {
	int a = 111;
	
	public Aderived(int roll,int age,int a) {
		super(roll,age);
		this.a = a;
	}
	
	public void display() {
		System.out.println(a);
	}
}
