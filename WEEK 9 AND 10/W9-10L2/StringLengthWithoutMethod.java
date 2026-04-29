import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find length using exception
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // keep accessing
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index goes out of bounds
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int manualLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using method: " + manualLength);
        System.out.println("Length using built-in: " + builtInLength);

        sc.close();
    }
}