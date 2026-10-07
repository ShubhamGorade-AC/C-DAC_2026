import java.util.Arrays;
import java.util.Scanner;
public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int a = sc.nextInt();
		
		int arr[] = new int[a];
		
		System.out.println("Enter the elements of the array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter target");		
		
		int target = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					continue;
				}
				
				else if(arr[i]+arr[j]==target) {
					System.out.println("These elements are"+arr[i]+" "+arr[j]);
					break;
				}
				
				else if(arr[i]==arr[arr.length-1] && arr[j]==arr[arr.length-1]) {
					System.out.println("No elemets found which meet the target");		
				}
				
			}
		}
			
	}

}


/*
boolean found = false;

for(int i = 0; i < arr.length; i++) {

    for(int j = 0; j < arr.length; j++) {

        if(i == j) {
            continue;
        }

        if(arr[i] + arr[j] == target) {
            System.out.println(arr[i] + " " + arr[j]);
            found = true;
            break;
        }
    }

    if(found) {
        break;
    }
}

if(!found) {
    System.out.println("No elements found");
}
*/