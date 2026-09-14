
public class Odd {

	public static void main(String[] args) {
		System.out.println("Enter the number till you print the odd numbers");
		int n = 10;
		n = Consoleinput.getInt();
		for(int i=0; i<=n; i++) {
			if(i%2!=0) {
			System.out.print(i+" ");
			}
		}
	}

}
