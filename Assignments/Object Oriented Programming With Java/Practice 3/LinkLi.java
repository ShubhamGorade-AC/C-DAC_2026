import java.util.LinkedList;
public class LinkLi {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Hi");
		list.add("Hello");
		list.add("Bye");
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println(list.size());
		
		list.set(1, null);
		
		System.out.println(list);
		
		list.remove("Hi");
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		
	}

}
