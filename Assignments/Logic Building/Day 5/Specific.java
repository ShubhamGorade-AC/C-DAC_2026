import java.util.Arrays;
import java.util.Scanner;
class Specific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter ");
        int num = sc.nextInt();
        if (Arrays.asList(arr).contains(num)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}