
public class Throwp {

	public static void main(String[] args) {
		int a = 15;
		
		try {
		if(a<18) {
			throw new ArithmeticException("Age is less than 15");
		};
		
		System.out.println("Hello");
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Hello");
		}
		
		System.out.println("Helloooooooo");

	}

}
