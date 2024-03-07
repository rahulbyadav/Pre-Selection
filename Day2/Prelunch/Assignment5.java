public class Assignment5 {
    public void star(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public void number(){
    for (int i = 4; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            if (j % 2 == 0) {
                System.out.print("0");
            } else {
            System.out.print("1");
            }
        }
    System.out.println();
    }
    }
    public static void main(String[] args){
        Assignment5 a = new Assignment5();
        a.star();
        a.number();
    }
}
