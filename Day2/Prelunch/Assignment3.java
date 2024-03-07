import java.util.Scanner;

public class Assignment3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        // Calculate attendance percentage
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        // Check if attendance meets the criteria
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        if (attendancePercentage >= 75) {
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.print("Does the student have a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);
            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("Student is allowed to sit in the exam due to medical cause.");
            } else {
                System.out.println("Student is not allowed to sit in the exam.");
            }
        }

        scanner.close();
    }
}
