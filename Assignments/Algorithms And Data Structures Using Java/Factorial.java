import java.util.*;
public class Factorial {
	public static int factorial(int a) {
		if(a==1) {
			return 1;
		}
		
		return a*factorial(a-1);
	}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter numeber to find factorial");
       int a = sc.nextInt();
       System.out.println(factorial(a));
    }
}