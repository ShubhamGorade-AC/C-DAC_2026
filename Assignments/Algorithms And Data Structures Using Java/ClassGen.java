import java.util.*;
public class ClassGen<T> { 
	
	public void display(T a) {
		System.out.println(a);
	}
	
	public static<T> void display1(T a) {
		System.out.println(a);
	}
	
	public T display2(T a) {
		System.out.println(a);
		return a;
	}
	public static void main(String args[]) {
		
		ClassGen<Integer> obj = new ClassGen<>();
		
		obj.display(10);
		
		System.out.println(obj.display2(20));
		
		display1(30);
	}
}
