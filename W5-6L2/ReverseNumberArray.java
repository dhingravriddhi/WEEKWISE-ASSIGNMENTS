import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        String s = Long.toString(Math.abs(number));
        int count = s.length();

        int[] digits = new int[count];
        long tempNum = Math.abs(number);
        for (int i = 0; i < count; i++) {
            digits[i] = (int) (tempNum % 10);
            tempNum /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
        sc.close();
    }
}