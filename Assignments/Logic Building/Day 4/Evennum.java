public class Evennum {
    static void even() {
        int i = 1;
        while(i<=50) {
            if(i%2==0) {
                System.out.print(i+ " ");
            }
            i++;
        }
    } 

    public static void main(String[] args) {
        Evennum.even();
}
}
