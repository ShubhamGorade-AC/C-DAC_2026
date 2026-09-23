
public class throwsp {
	
	public static void display(int age) throws Exception { 
		if(age<18) {
			throw new Exception("Enter correct Age");
		}
	}
	public static void main(String[] args) {
		
		try {
			display(15);
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("Out of the program");
		}
	}
}
