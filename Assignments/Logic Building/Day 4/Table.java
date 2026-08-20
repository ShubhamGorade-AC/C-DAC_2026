import java.util.Scanner;
public class Table { 
    static void number(int num) {
        for (int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Table.number(num);
    }
    
}
