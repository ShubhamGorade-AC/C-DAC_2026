import java.util.ArrayList;
public class ArrList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		
		//Traversing the list
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		list.set(1, 11);
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		
	}

}
