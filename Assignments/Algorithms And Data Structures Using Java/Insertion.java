import java.util.*;
public class Insertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();		
		}
		
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
