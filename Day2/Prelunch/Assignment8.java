/*A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself. 
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153. 
Write all Armstrong numbers between 100 to 500. */
public class Assignment8{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500 are:");
        for (int num = 100; num <= 500; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is Armstrong or not
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;

        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, 3);
            originalNum /= 10;
        }

        return sum == num;
    }
}
