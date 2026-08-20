import java.util.Scanner;
class Sum {
    int summ( int c, int d) {
        int sum1 = c + d;
        return sum1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate their sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Sum obj = new Sum();
        int result  = obj.summ(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
   
    }
}