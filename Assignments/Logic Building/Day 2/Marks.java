class Marks {
    public static void main(String[] args) {
        int math = 80;
        int science = 85;
        int history = 90;

        int avg = (math+science+history)/3;
        System.out.println("Average Marks: " + avg);

        if(avg>=90) {
            System.out.println("Grade A");
        }
        else if (avg<=89 && avg>=70) {
            System.out.println("Grade B");
        }
        else if (avg<=69 && avg>=50) {
            System.out.println("Grade C");
        }
        else if (avg<=49 && avg>=30) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}