public class Triangle {
	int a;
	int b;
	int c;
	
	public Triangle (int a1, int b1, int c1){
		a=a1;
		b=b1;
		c=c1;
	}
	
	void perimeter() {
		int per = a+b+c;
		System.out.println(per);
	}
	
	public static void main(String args[]) {
		Triangle t = new Triangle(10,10,10);
		t.perimeter();
	}
}
