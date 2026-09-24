import java.util.HashSet;
public class Setp {
public static void main(String[] args) {
		
	HashSet<Integer> set = new HashSet<>();
	
	set.add(10);
	set.add(20);
	set.add(30);
	
	System.out.println(set);
	
	set.remove(30);
	
	System.out.println(set);
	
	set.add(10);
	
	System.out.println(set);
	
	for(int i : set) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	set.clear();
	
	System.out.println(set);
	
	}

}
