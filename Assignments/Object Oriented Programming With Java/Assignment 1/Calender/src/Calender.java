import java.util.Scanner;

public class Calender {
	
	private int date;
	private int month;
	private int year;
	
	public void setdate(int d, int m, int y) {
		if(m==1 || m==3 ||m==5 || m==7 || m==8 || m==10 || m==12 ) {
			if(d<1 || d>31) {
				date = 1;
			}
			else {
				date = d;
			}
		}
		
		else if(m==4 || m==6 ||m==9 || m==11) {
			if(d<1 || d>30) {
				date = 1;
			}
			else {
				date = d;
			}
		}
		else {
			if(y%4==0) {
				if(d<1 || d>29) {
					date = 1;
				}
				else {
					date = d;
				}
			}
			else {
				if(d<1 || d>28) {
					date = 1;
				}
				else {
					date = d;
				}
			
			}
		}
	}
	
public void setmonth(int m, int y) {
	if(m<1 || m>12) {
		month = 1;
	}
	else {
		month = m;
	}
}

public void setyear(int y) {
	year = y;	
}

public int getdate() {
	return date;
}

public int getmonth() {
	return month;
}

public int getyear() {
	return year;
}


public void addday(int n) {
for(int i=0; i<n; i++) {
	if(date<1 || date>31) {
		date = 1;
		month++;
	}
	else {
		date++;
	}
}
}

public void addmonth(int n) {
for(int i=0; i<n; i++) {
	if(month<1 || month>12) {
		month =1;
		year++;
	}
	else {
		month++;
	}
}
}

public void addyear(int n) {
for(int i=0; i<n; i++) {
	year++;
}
}

public static void main(String[] args) {
    	Calender obj = new Calender();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {

            System.out.println("1. Enter Date");
            System.out.println("2. Add Dates");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	int date;
            		int month;
            		int year;
            		System.out.println("Enter date, month, year");
            		date =sc.nextInt();
            		month =sc.nextInt();
            		year = sc.nextInt();
            		
            		obj.setyear(year);
            		obj.setmonth(month, year);
            		obj.setdate(date,month,year);
            		break;

                case 2:
                    System.out.print("Enter add Days: ");
                    int adddate =sc.nextInt();
                    obj.addday(adddate);
                    break;
                    

                case 3:
                	System.out.print("Enter add Months: ");
                    int addmonth =sc.nextInt();
                    obj.addmonth(addmonth);
                    break;

                case 4:
                	System.out.print("Enter add year: ");
                    int addyear =sc.nextInt();
                    obj.addyear(addyear);
                    break;
                
                case 5:
                	System.out.println("Date is "+obj.getdate()+"/"+obj.getmonth()+"/"+obj.getyear());
                	break;

                default:
                	System.out.println("Enter Correct Input");
                	break;
            }

        }while(choice != 6);

	}

}
