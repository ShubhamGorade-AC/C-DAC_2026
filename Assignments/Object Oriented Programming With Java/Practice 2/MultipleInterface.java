interface Animals {
	void voice();
}
interface Add {
	int add(int a, int b);
}
public class MultipleInterface implements Animals, Add {
	
	public void voice() {
		System.out.println("Bark");
	}
	
	public int add (int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		MultipleInterface obj = new MultipleInterface();
		obj.voice();
		obj.add(10, 20);
	}
}
