import java.util.Scanner;
public class PositiveNum {
    static void Posotive() {
        int num;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    } while (num <= 0);
    System.out.println("You entered a positive number: " + num);
    }
    
    public static void main(String[] args) {
        PositiveNum.Posotive();
        
    }
}
