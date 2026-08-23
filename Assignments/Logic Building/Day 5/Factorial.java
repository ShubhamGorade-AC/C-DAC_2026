import java.util.Scanner;

public class Factorial {
    public int factorialme(int fact) {
        int ans=1;
        for(int i=1; i<=fact; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer to find the factorial");
        int fact = sc.nextInt();

        Factorial me = new Factorial();
        int finall = me.factorialme(fact);

        System.out.println("Factorial of "+ fact + " = "+ finall);


    }
}
