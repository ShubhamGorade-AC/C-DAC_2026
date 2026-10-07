import java.util.*;
public class ArrayLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int a = sc.nextInt();
		
		int arr[] = new int[a];
		
		System.out.println("Enter the elements of the array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter to find the k-th largest element of an array");
		
		
		int find = sc.nextInt();
		
		System.out.println(arr[arr.length-find]);
			
	}

}
