public abstract class Abase {
	int roll;
	int age;
	
	public Abase() {
	}
	public Abase(int age, int roll) {	
		this.roll = roll;
		this.age = age;
	}
	
	public void display() {
		System.out.println(roll);
		System.out.println(age);
	}
}
