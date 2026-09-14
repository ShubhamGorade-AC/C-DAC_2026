
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		float num1= Consoleinput.getFloat();
		
		System.out.println("Enter the second number");
		float num2= Consoleinput.getFloat();
		
		Program objCalculator = new Program();
		
		float result = objCalculator.add(num1, num2);
		System.out.println(result);
	}
}
