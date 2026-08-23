import java.util.Scanner;
class Usernumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.print(i + " ");
        }
    }
}