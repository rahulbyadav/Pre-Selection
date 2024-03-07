//Take values of length and breadth of a rectangle from user and check if it is square or not
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length and breadth:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        
        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
        
        sc.close();
    }
}

