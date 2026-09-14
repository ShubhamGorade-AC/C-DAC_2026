public class Rectangle {
	
	int a;
	int b;
	
	public Rectangle(int a1, int b1) {
		a=a1;
		b=b1;
	}
	
	public int area() {
		int are = a*b;
		return are;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,2);
		Rectangle r2 = new Rectangle(3,3);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		
	}

}
