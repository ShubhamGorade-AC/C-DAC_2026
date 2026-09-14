import java.util.*;
public class Salary {
	
	int salary;
	int hours;
	
	public void accept(int sal, int hou) {
		salary = sal;
		hours = hou;
	}
	
	public void addsal() {
		if(salary<500) 
			salary+=10;
	}
	
	public void addsal2() {
		if(hours > 6) 
			salary+=5;
	}
	

	public static void main(String[] args) {

		int salary;
		int hours;
		
		Scanner sc = new Scanner(System.in);
		
		salary = sc.nextInt();
		hours = sc.nextInt();
		
		Salary s = new Salary();
		s.accept(salary,hours);
		s.addsal();
		s.addsal2();
		
		System.out.println(s.salary);
		
		
	}

}
