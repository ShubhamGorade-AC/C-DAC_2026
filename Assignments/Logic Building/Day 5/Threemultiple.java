import java.util.Scanner;
class Threemultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for multiples of three");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println(i*3+" ");
        }

    }
}