import java.util.*;
public class Array {
	static Scanner sc = new Scanner(System.in);
	public static void array1() {
		int arr3[][] = new int[2][2] ;
		for(int i=0 ; i<arr3.length; i++) {
			for(int j=0; j<arr3.length; j++) {
			arr3[i][j] = sc.nextInt();	
			}
		}	
		for(int i=0 ; i<arr3.length; i++) {
				for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]);	
			}
			System.out.println();
	
		}
	}
		
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
		int arr1[] = {1,2,3};
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int arr2[]= new int[5];
		for(int i=0 ; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();	
		}
		
		for(int i=0 ; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");	
		}
		*/
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : 
			Array.array1();
			break;
			
		default : 
		{
			System.out.println("Worng choice");
			break;
		}
		
		}	
	}
}

