
public class Student {
	 String name;
	 int roll;
	 String adress;
	 String mobno;
	

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Shubham";
		s1.adress = "Shirur";
		s1.roll = 100;
		s1.mobno = "9322186022";
		
		Student s2 = new Student();
		s2.name = "Sujal";
		s2.adress = "Shirur";
		s2.roll = 100;
		s2.mobno = "9322186022";
		
		System.out.println(s1.name);
		System.out.println(s1.adress);
		System.out.println(s1.roll);
		System.out.println(s1.mobno);
		
		System.out.println(s2.name);
		System.out.println(s2.adress);
		System.out.println(s2.roll);
		System.out.println(s2.mobno);
	}

}
