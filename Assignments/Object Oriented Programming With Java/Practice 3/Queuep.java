import java.util.Queue;
import java.util.LinkedList;
public class Queuep {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q);
		
		for(int i : q) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		
		System.out.println(q);
		
		q.clear();
		
		System.out.println(q);
		

	}

}
