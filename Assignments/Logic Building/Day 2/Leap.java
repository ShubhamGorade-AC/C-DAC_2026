class Leap {
    public static void main(String[] args) {
      int y = 1901;
    int leap_year = y % 4;

    if(leap_year==0) {
        System.out.println(y + " is a leap year");
    }
    else {
        System.out.println(y + " is not a leap year");
    }  
    }
    
}
