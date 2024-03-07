//Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
import java.util.Scanner;

public class Assignment7{
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int gcd = calculateGCD(num1, num2);

        System.out.println("Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}
