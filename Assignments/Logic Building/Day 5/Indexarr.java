import java.util.Arrays;
import java.util.Scanner;
class Indexarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int index = Arrays.binarySearch(arr, num);
        if (index >= 0) {
            System.out.println("The number " + num + " found" + index);
        } else {
            System.out.println("Not Found");
        }
    }
}