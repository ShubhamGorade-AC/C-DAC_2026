import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be printed");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1; j<=i; j++) {
                System.out.print((2*j)-1);

                if(j<i) {
                    System.out.print("*");
                }
                
            }
            
            System.out.println();
        }

    }
}
