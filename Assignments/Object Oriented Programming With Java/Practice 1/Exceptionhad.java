import java.util.*;
public class Exceptionhad {

	public static void main(String[] args) {
		 
		try {
			int a = 10;
			int b = 0;
			
			int c = a/b;
			
			System.out.println(c);
		}
		
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println("We cannot devide by zero");
		}
		
		 catch(ArrayIndexOutOfBoundsException e) {
				
		}
		
		 catch(InputMismatchException e) {
				
			}
		
		catch(NullPointerException e) {
			
		} 
		
		catch (Exception e) {
			
		}
		

		finally {
			System.out.println("Last");
		}

		System.out.println("After exception");
		
	}

}
