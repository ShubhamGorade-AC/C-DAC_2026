
public class Complex {
	
	int i;
	int r;
	
	public int real(int a, int b) {
		r = a+b;
		return r;
	}
	
	public int img(int c, int d) {
		i = c+d;
		return i;
	}

	public static void main(String[] args) {
		Complex obj = new Complex();
		
		int r=obj.real(10, 10);
		int i=obj.img(10, 11);
		
		System.out.println(r + " + "+ i);

	}

}
