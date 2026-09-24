import java.util.HashMap;
public class Maph {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1,"Shubham");
		map.put(2,"Sujal");
		map.put(3,"Sai");
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.get(1));
		
		System.out.println(map.containsKey(1));
		
		System.out.println(map.containsValue("Sai"));
		
		map.remove(3);
		
		System.out.println(map);
		
		map.clear();
		
		System.out.println(map);
		
		
	}

}
