import java.util.Scanner;
public class Agechecker {
static void checkAge(int age) {
        if(age<=18) {
            System.err.println("Minor");
        }
        else if(age>18 && age<60) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior Citizen");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        Agechecker.checkAge(age);
    }
}
