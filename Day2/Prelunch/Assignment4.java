// Take 10 integers from keyboard using loop and print their average value on the screen

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        // Calculate average
        double average = (double) sum / 10;

        // Print the average value
        System.out.println("Average value: " + average);

        scanner.close();
    }
}
