import java.util.LinkedList;
import java.util.List;
public class GenericsList<T> {
	List<T> list = new LinkedList<>();
	
	public void add1(T a, T b) {
		list.add(a);
		list.add(b);
	}
	
	public void display() {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		GenericsList<Integer> obj = new GenericsList();
		
		obj.add1(10, 20);
		
		obj.display();
	}

}
