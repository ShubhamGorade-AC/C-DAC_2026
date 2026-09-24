import java.util.*;
public class ArrayMethods {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter the five elements of the array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//for 2d - arr[i].length
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
