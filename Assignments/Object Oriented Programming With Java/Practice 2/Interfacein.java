interface Animalss {
	void voice();
}
interface Adds {
	int add(int a, int b);
}

interface newone extends Animalss, Adds {
	
}
public class Interfacein implements newone {
	
	public void voice() {
		System.out.println("Bark");
	}
	
	public int add (int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Interfacein obj = new Interfacein();
		obj.voice();
		System.out.println(obj.add(10,20));
	}
}
