interface Animal {
	void voice();
}

public class Interfaceb implements Animal{
	public void voice() {
		System.out.println("Bark");
	}
	

	public static void main(String[] args) {
		Interfaceb obj = new Interfaceb();
		obj.voice();
		
	}

}
