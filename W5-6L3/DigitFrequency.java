import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long tempNum = Math.abs(number);
        
        String s = Long.toString(tempNum);
        int digitCount = s.length();
        
        int[] digits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (tempNum % 10);
            tempNum /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }
        sc.close();
    }
}