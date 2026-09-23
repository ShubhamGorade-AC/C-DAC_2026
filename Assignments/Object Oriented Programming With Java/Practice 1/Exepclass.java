class AgeExe extends Exception {
	public AgeExe(String msg) {
		super(msg);
	}
}

public class Exepclass {
	
	public static void age(int a) throws AgeExe {
		if(a<18) {
			throw new AgeExe("Invalid Error for age");
		}
	}

	public static void main(String[] args) {
		
		try {
			Exepclass.age(15);
		}
		
		catch(AgeExe e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Program Executed Sucessfulyyyyyyyyy");
		}
	}

}
