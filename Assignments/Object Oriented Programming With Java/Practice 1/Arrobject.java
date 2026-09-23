
public class Arrobject {
	
	int a;
	int b;
	
	public Arrobject(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void display() {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		
		Arrobject obj[] = new Arrobject[5];
		
		obj[0] = new Arrobject(10,20);
		obj[1] = new Arrobject(20,30);
		
		for(int i=0; i<obj.length; i++) {
			obj[i].display();
		}
	}

}
