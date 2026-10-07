import java.util.*;
public class Selection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();		
		}
		
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
