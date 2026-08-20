import java.util.Scanner;
public class Nsum {
    int sum(int n) {
        int total = 0;
        for(int i=1; i<=n; i++) {
            total = total + i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for calculate sum till: ");
        int n = sc.nextInt();
        Nsum obj1 = new Nsum();   
        System.out.println("Sum of first " + n + " natural numbers is: " + obj1.sum(n));
    }
}
