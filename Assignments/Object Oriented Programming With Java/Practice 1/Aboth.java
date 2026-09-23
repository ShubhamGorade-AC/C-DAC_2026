
public class Aboth {

	public static void main(String[] args) {
		
		//Abase obj = new Abase();

		//Abase obj;
		
		//Abase obj1 = new Aderived(10,100,111);
		
		//obj1.display();
		
		//Aderived objx = (Aderived) obj1;
		
		//objx.display();
		//System.out.println(objx.a);
		
		Abase obj2[] = new Aderived[3];
		
		obj2[0] = new Aderived(10,100,111);
		
		obj2[0].display();
		
		if(obj2[0] instanceof Aderived) {
			Aderived objx2 = (Aderived) obj2[0];
			objx2.display();
		}
		
	}

}
