import java.util.*;
public class Numrec {
	public static void print(int a, int n) {
		if(a>n) {
			return;
		}
		System.out.println(a);
		print(a+1, n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements to be print");
		int n = sc.nextInt();
		print(1,n);
	}

}
